/**
 * @title: 分页工具类.java
 * @author: JH
 * @creatAt: 2020/11/2 22:45
 * @modify:
 * @description:
 * @version: 1.0
 */
package com.jh.company.util;

import com.jh.company.entity.CompanyEntity;

/**
 * @description: 分页工具类
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/2 22:46
 */
public class PageHelperUtils {
    public static void initializeBaseEntityUtil(CompanyEntity companyEntity) {
        if (companyEntity.getPage() == null) {
            companyEntity.setPage(0);
        }
        if (companyEntity.getSize() == null) {
            companyEntity.setSize(1000);
        }
    }
}
