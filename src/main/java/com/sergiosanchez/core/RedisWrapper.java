package com.sergiosanchez.core;

import nl.melp.redis.Redis;

public class RedisWrapper {

    private Redis redis;

    private RedisWrapper(Redis redis) {
        this.redis=redis;
    }
}