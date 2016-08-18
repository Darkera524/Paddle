package com.paddle.util;

/**
 * Created by Administrator on 2016/8/16.
 */
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisPool;

public class RedisStandAloneUtil {
    private final static Logger logger = LoggerFactory.getLogger(RedisStandAloneUtil.class);
    /**
     * jedis连接池
     */
    private static JedisPool jedisPool;

    /**
     * redis-host
     */
    private final static String REDIS_HOST = "127.0.0.1";

    /**
     * redis-port
     */
    private final static int REDIS_PORT = 6379;

    static {
        try {
            jedisPool = new JedisPool(new GenericObjectPoolConfig(), REDIS_HOST, REDIS_PORT);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
    public static JedisPool getJedisPool() {
        return jedisPool;
    }

    public static void main(String[] args) {
        System.out.println(RedisStandAloneUtil.getJedisPool().getResource().info());
    }
}