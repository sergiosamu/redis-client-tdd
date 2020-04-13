package com.sergiosanchez.core;

import com.sergiosanchez.core.handler.BasicCommandHandler;

import nl.melp.redis.Redis;

public class RedisClient {

    private static int DEFAULT_PORT=6379;
    
    private BasicCommandHandler basicCommandHandler;
    private KeysCommandHandler basicCommandHandler;

    public RedisClient (String host) {
        this(host,0,null);
    }

    public RedisClient (String host, int port) {
        this(host,port,null);
    }
    
    public RedisClient (String host, String password) {
        this(host,0,password);
    }
    
    public RedisClient (String host, int port, String password) {

        Redis redis = new Redis(new Socket(host,port==0?DEFAULT_PORT:port);
        if (password != null) {
            redis.call("AUTH",password);
        }

        RedisWrapper redisWrapper = new RedisWrapper(redis); 

        this.basicCommandHandler = new BasicCommandHandler(redisWrapper);
        
    }    
}