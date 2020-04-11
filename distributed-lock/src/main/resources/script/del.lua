local key = KEYS[1]
if redis.call("exists" ,key) == true then
    redis.call("del", key)
    return true
else
    return flase
end
