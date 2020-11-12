/**
 * @title:  企业业务实现类.java
 * @author: JH
 * @creatAt: 2020/11/3 0:00
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jh.company.dao.CompanyDao;
import com.jh.company.entity.CompanyEntity;
import com.jh.company.entity.ResultEnum;
import com.jh.company.entity.Resultor;
import com.jh.company.exception.VariableException;
import com.jh.company.service.CompanyService;
import com.jh.company.util.PageHelperUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description: 企业业务实现类
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/3 0:01
 */
@Log4j2
@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyDao companyDao;

    @Autowired
    public CompanyServiceImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Resultor<CompanyEntity> addElement(CompanyEntity companyEntity) throws Exception {
        Resultor<CompanyEntity> resultor;
        try {
            int maxId = companyDao.queryMaxId();
            companyEntity.setId(++maxId);
            companyDao.addCompany(companyEntity);
            resultor = new Resultor<>(ResultEnum.SUCCESS);
        } catch (Exception e) {
            throw new VariableException("服务器内部错误", e);
        }
        return resultor; 
    }

    @Override
    public Resultor<CompanyEntity> deleteElement(CompanyEntity companyEntity) throws Exception{
        int currentId;
        Resultor<CompanyEntity>  resultor;
        try {
            currentId = companyEntity.getId() == null ? -1 : companyEntity.getId();
            companyDao.deleteCompany(currentId);
            resultor = new Resultor<>(ResultEnum.SUCCESS);
        } catch (Exception e) {
            throw new VariableException("服务器内部错误", e);
        }
        return resultor;
    }

    @Override
    public Resultor<CompanyEntity> modifyElement(CompanyEntity companyEntity) throws Exception{
        Resultor<CompanyEntity>  resultor;
        try {
            companyDao.modifyCompany(companyEntity);
            resultor = new Resultor<>(ResultEnum.SUCCESS);
        } catch (Exception e) {
            throw new VariableException("服务器内部错误", e);
        }
        return resultor;
    }

    @Override
    public Resultor<CompanyEntity> queryAllElement(CompanyEntity companyEntity) throws Exception {
        Resultor<CompanyEntity> resultor;
        int id;
        try {
            PageHelperUtils.initializeBaseEntityUtil(companyEntity);
            id = companyEntity.getId() == null ? -1 : companyEntity.getId();
            PageHelper.startPage(companyEntity.getPage(), companyEntity.getSize());
            List<CompanyEntity> companyEntityList = companyDao.queryCompany(id);
            PageInfo<CompanyEntity> pageInfo = new PageInfo<>(companyEntityList);
            resultor = new Resultor<>(ResultEnum.SUCCESS);
            resultor.setObjectList(companyEntityList);
            resultor.setTotalCount((int) pageInfo.getTotal());
        } catch (Exception e) {
            throw new VariableException("服务器内部错误", e);
        }
        return resultor;
    }
}
