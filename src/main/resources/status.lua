local ans, cursor = {}, "0"
repeat
    local t = redis.call("SCAN", cursor, "MATCH", "MXID*")
    local l = t[2]
    cursor = t[1]
    for i = 1, #l do
        local inans = {}
        local alldata = redis.call("hmget", l[i], "a", "b", "c", "e", "sessid")
        local s = redis.call("hmget", "MXSESID" .. alldata[#alldata], "a1", "b1", "c1", "d1", "e1")
        table.insert(inans, l[i])
        table.insert(alldata, s)
        table.insert(inans, alldata)
        table.insert(ans, inans)
    end
until cursor == "0"
return ans
