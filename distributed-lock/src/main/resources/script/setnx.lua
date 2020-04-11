local key = KEYS[1]
local val = KEYS[2]
local expire = KEYS[3]
if redis.call("setnx" ,key) == true then
    if tonumber(expire) > 0 then
        redis.call("expire", key, expire)
    end
    return true
else
    return flase
end
