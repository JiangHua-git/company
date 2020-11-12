/**
 * @title:  自定义异常.java
 * @author: JH
 * @creatAt: 2020/11/2 21:02
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company.exception;

import lombok.extern.log4j.Log4j2;

/**
 * @description: 自定义异常
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/2 21:02
 */
@Log4j2
public class VariableException extends Exception{
    /**
     * description: 消息</br>
     * author: JH</br>
     * time: 2020/11/2 21:02
     */
    private String message;

    /**
     * @description: 无参构造方法
     * @author: JH
     * @version: 1.0
     * @date: 2020/11/2 21:06
     */
    public VariableException() {
    }

    /**
     * @description: 指定消息
     * @author: JH
     * @version: 1.0
     * @date: 2020/11/2 21:06
     */
    public VariableException(String message) {
        super(message);
        this.message = message;
        log.error("{}, {}", message, this.fillInStackTrace());
    }

    /**
     * @description: 用指定的详细信息和原因构造一个新的异常
     * @author: JH
     * @date: 2020/11/2 21:09
     * @param message
     * @param throwable
     * @return:
     */
    public VariableException(String message, Throwable throwable){
        super(message, throwable);
        this.message = message;
        log.error("{}, {}", message, throwable.getMessage());
    }

    /**
     * @description: 用指定原因构造一个新的异常
     * @author: JH
     * @date: 2020/11/2 21:09
     * @param throwable
     * @return:
     */
    public VariableException (Throwable throwable) {
        super(throwable);
        log.error("{}", throwable.getMessage());
    }
}
