package com.sergiosanchez.nl.melp.redis;

import java.net.Socket;

import nl.melp.redis.Redis;

public class RedisTest {
    public static void main(final String[] args) throws Exception {
        final Redis r = new Redis(new Socket("127.0.0.1", 6379));
        r.call("SET", "foo", "123");
        r.call("INCRBY", "foo", "456");

        System.out.println((String)r.call("GET", "foo"));

    }
}