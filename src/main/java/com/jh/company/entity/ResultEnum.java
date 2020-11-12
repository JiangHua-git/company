/**
 * @title:  常量枚举.java
 * @author: JH
 * @creatAt: 2020/11/2 20:14
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company.entity;

import lombok.Data;

/**
 * @description: 枚举
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/2 20:15
 */
public enum ResultEnum {
    /**
     * 操作成功
     */
    SUCCESS(true, 200, "操作成功！"),

    /**
     * 操作失败
     */
    FAIL(false, 500, "操作失败！");

    /**
     * description: 响应消息</br>
     * author: JH</br>
     * time: 2020/11/2 20:26
     */
    Boolean success;
    
    /**
     * description: 操作代码</br>
     * author: JH</br>
     * time: 2020/11/2 20:28
     */
    Integer code;
   
    /**
     * description: 提示信息</br>
     * author: JH</br>
     * time: 2020/11/2 20:28
     */
    String message;

    /**
     * @description: 构造方法
     * @author: JH
     * @date: 2020/11/2 20:29
     * @param success
     * @param code
     * @param message
     * @return:
     */
    ResultEnum(boolean success, int code, String message) {
        this.init(success, code, message);
    }

    /**
     * @description: 初始化
     * @author: JH
     * @date: 2020/11/2 20:29
     * @param success
     * @param code
     * @param message
     * @return: void
     */
    void init(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
