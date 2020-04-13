package com.sergiosanchez.core.handler.impl;

import com.sergiosanchez.core.RedisWrapper;
import com.sergiosanchez.core.handler.KeysCommandHandler;

/**
 * DefaultKeysCommandHandler
 */
public class DefaultKeysCommandHandler implements KeysCommandHandler{

    private RedisWrapper redisWrapper;

    public DefaultBasicCommandHandler(RedisWrapper wrapper) {
        this.redisWrapper=redisWrapper;
    }
}