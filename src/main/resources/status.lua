local ans, cursor = {}, "0"
local mapping = {"a1", "b1","c1", "d1", "e1"}
repeat
    local t = redis.call("SCAN", cursor, "MATCH", "MXID*")
    local l = t[2]
    cursor = t[1]
    for i = 1, #l do
        local alldata = redis.call("hmget", l[i], "a", "b", "c", "e", "sessid")
        table.insert(alldata, l[i])
        local s = redis.call("hmget", "MXSESID" .. alldata[#alldata-1], "a1", "b1", "c1", "d1", "e1")
        for j = 1, #s do
            table.insert(alldata, s[j])
        end
        table.insert(ans, alldata)
    end
until cursor == "0"
return ans
