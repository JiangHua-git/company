package com.jh.company.dao;

import com.jh.company.entity.CompanyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description: 
 * @author: JH
 * @version: 1.0
 * @date: 2020/10/29 22:58
 */
@Mapper
public interface CompanyDao {
    
    /**
     * 添加企业
     * @author: JH
     * @date: 2020/10/29 22:58
     * @param companyEntity
     * @return: 
     */
    void addCompany(CompanyEntity companyEntity);
    
    /**
     * 查询企业
     * @author: JH
     * @date: 2020/10/29 23:00
     * @param 
     * @return: 
     */
    int queryMaxId();
    
    /**
     * 企业查询：传id则查询对应企业，不传则查询所有
     * @author: JH
     * @date: 2020/11/2 22:01
     * @param id
     * @return: 
     */
    List<CompanyEntity> queryCompany(int id);    
    
    /**
     * 删除企业：传id则删除对应企业，不传则删除所有
     * @author: JH
     * @date: 2020/11/2 22:01
     * @param id
     * @return: 
     */
    void deleteCompany(int id);   
    
    /**
     * 删除企业：修改企业信息
     * @author: JH
     * @date: 2020/11/2 22:01
     * @param companyEntity
     * @return: 
     */
    void modifyCompany(CompanyEntity companyEntity);
}
