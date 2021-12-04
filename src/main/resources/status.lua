local cursor = "0"
local finalans = '['
repeat
    local t = redis.call("SCAN", cursor, "MATCH", "MXID*")
    local l = t[2]
    cursor = t[1]
    for i = 1, #l do
        local ans = '{'
        local alldata = redis.call("hmget", l[i], "a", "b", "c", "d", "e", "sessid")
        table.insert(alldata, l[i])
        local s = redis.call("hmget", "MXSESID" .. alldata[#alldata-1], "a1", "b1", "c1", "d1", "e1")

              ans = ans..string.format('"id":"%s",', alldata[7])
              ans = ans..string.format('"a":%s,', alldata[1])
              ans = ans..string.format('"b":%s,', alldata[2])
              ans = ans..string.format('"c":%s,', alldata[3])
              ans = ans..string.format('"d":%s,', alldata[4])
              ans = ans..string.format('"e":%s,', alldata[5])
              ans = ans..string.format('"sessid":%s,', alldata[6])
              ans = ans..string.format('"a1":%s,', s[1])
              ans = ans..string.format('"b1":%s,', s[2])
              ans = ans..string.format('"c1":%s,', s[3])
              ans = ans..string.format('"d1":%s,', s[4])
              ans = ans..string.format('"e1":%s', s[5])

       ans = ans..'}'

       finalans = finalans..ans..','
    end
until cursor == "0"

return finalans:sub(1,-2)..']'
