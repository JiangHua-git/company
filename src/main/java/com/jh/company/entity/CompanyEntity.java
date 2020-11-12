/**
 * @title:  企业实体类.java
 * @author: JH
 * @creatAt: 2020/11/2 23:59
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * @description: 企业实体类
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/3 0:00
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CompanyEntity extends BaseEntity implements Serializable {
    /**
     * description: 唯一id</br>
     * author: JH</br>
     * time: 2020/11/2 21:50
     */
    private Integer id;
    
    /**
     * description: 企业名称</br>
     * author: JH</br>
     * time: 2020/11/2 21:50
     */
    private String companyName;

    /**
     * description: 地址</br>
     * author: JH</br>
     * time: 2020/11/2 21:50
     */
    private String address;
}
