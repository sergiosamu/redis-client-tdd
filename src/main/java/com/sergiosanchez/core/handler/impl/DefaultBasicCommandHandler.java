package com.sergiosanchez.core.handler.impl;

import com.sergiosanchez.core.handler.BasicCommandHandler;

/**
 * DefaultBasicCommandHandler
 */
public class DefaultBasicCommandHandler implements BasicCommandHandler{
    private RedisWrapper redisWrapper;

    public BasicCommandHandler(RedisWrapper redisWrapper) {
        this.redisWrapper=redisWrapper;
    }
    
}