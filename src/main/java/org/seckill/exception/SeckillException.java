package org.seckill.exception;

/**
 * 秒杀相关的所有业务异常
 * Created by liuqh on 18/09/02.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
