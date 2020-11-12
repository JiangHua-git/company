/**
 * @title:  基础操作.java
 * @author: JH
 * @creatAt: 2020/11/2 23:58
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company.service;

import com.jh.company.entity.Resultor;

/**
 * @description: 基础操作
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/2 23:58
 */
public interface BaseService<T> {

    /**
     * 增加元素
     * @author: JH
     * @date: 2020/11/3 0:03
     * @param t
     * @return: Resultor<T>
     * @throws Exception
     */
    Resultor<T> addElement(T t) throws Exception;
    
    /**
     * 删除元素
     * @author: JH
     * @date: 2020/10/29 17:50
     * @param t
     * @return: Resultor<T>
     * @throws Exception
     */
    Resultor<T> deleteElement(T t) throws Exception;
    
    /**
     * 修改元素
     * @author: JH
     * @date: 2020/11/3 0:08
     * @param t
     * @return: Resultor<T>
     * @throws Exception
     */
    Resultor<T> modifyElement(T t) throws Exception;
    
    /**
     * 查询元素
     * @author: JH
     * @date: 2020/10/29 17:52
     * @param t
     * @return: Resultor<T>
     * @throws Exception
     */
    Resultor<T> queryAllElement(T t) throws Exception;
}
