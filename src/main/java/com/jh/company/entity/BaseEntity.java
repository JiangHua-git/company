/**
 * @title: 基础信息.java
 * @author: JH
 * @creatAt: 2020/11/2 21:51
 * @modify:
 * @description:
 * @version: 1.0
 */
package com.jh.company.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 基础信息
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/2 21:52
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntity implements Serializable {
    /**
     * description: 当前页</br>
     * author: JH</br>
     * time: 2020/11/2 21:52
     */
    private Integer page;

    /**
     * description: 没有条数</br>
     * author: JH</br>
     * time: 2020/11/2 21:52
     */
    private Integer size;
}
