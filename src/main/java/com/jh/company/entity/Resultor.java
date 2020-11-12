/**
 * @title:  返回消息.java
 * @author: JH
 * @creatAt: 2020/11/2 18:13
 * @modify: 
 * @description: 返回消息
 * @version: 1.0
 */
package com.jh.company.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * @description: 返回消息
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/2 18:13
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resultor<T>{
    /**
     * description: 状态</br>
     * author: JH</br>
     * time: 2020/11/2 18:25
     */
    private int code;
    
    /**
     * description: </br>
     * author: JH</br>
     * time: 2020/11/2 18:15
     */
    private boolean success = true;
    
    /**
     * description: </br>
     * author: JH</br>
     * time: 2020/11/2 18:16
     */
    private String message;  
    
    /**
     * description: </br>
     * author: JH</br>
     * time: 2020/11/2 18:16
     */
    private Integer totalCount;
    
    /**
     * description: </br>
     * author: JH</br>
     * time: 2020/11/2 18:16
     */
    private Object object;
    
    /**
     * description: </br>
     * author: JH</br>
     * time: 2020/11/2 18:16
     */
    private List<T> objectList;

    /**
     * @description: 构造方法
     * @author: JH
     * @date: 2020/11/2 21:35
     * @param resultEnum
     * @return:
     */
    public Resultor(ResultEnum resultEnum) {
        this.success = resultEnum.success;
        this.message = resultEnum.message;
        this.code = resultEnum.code;
    }

    /**
     * @description: 构造方法
     * @author: JH
     * @date: 2020/11/2 21:35
     * @param resultEnum
     * @return:
     */
    public Resultor(ResultEnum resultEnum, String message) {
        this.success = resultEnum.success;
        this.message = message;
        this.code = resultEnum.code;
    }
}
