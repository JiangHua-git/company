/**
 * @title:  启动类.java
 * @author: JH
 * @creatAt: 2020/11/2 23:57
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 启动类
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/2 23:57
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
