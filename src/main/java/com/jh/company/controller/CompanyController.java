/**
 * @title:  .java
 * @author: JH
 * @creatAt: 2020/10/29 18:04
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company.controller;

import com.jh.company.entity.CompanyEntity;
import com.jh.company.entity.ResultEnum;
import com.jh.company.entity.Resultor;
import com.jh.company.exception.VariableException;
import com.jh.company.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 
 * @author: JH
 * @version: 1.0
 * @date: 2020/10/29 18:03
 */
@RestController
public class CompanyController {
    
    private CompanyServiceImpl companyService;
    
    @Autowired
    public CompanyController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }
    
    /**
     * @description: 增加企业
     * @author: JH
     * @date: 2020/10/29 22:42
     * @param companyEntity
     * @return: String
     */
    @RequestMapping(value = "company/addCompany",method = RequestMethod.POST)
    public Resultor<CompanyEntity> addCompany(@RequestBody CompanyEntity companyEntity) throws Exception{
        Resultor<CompanyEntity> resultor;
        try {
            resultor= companyService.addElement(companyEntity);
        } catch (VariableException e){
            resultor = new Resultor<>(ResultEnum.FAIL, e.getMessage());
        }
        return resultor;
    }
    
    /**
     * @description: 查询所有企业
     * @author: JH
     * @date: 2020/10/29 22:43
     * @param companyEntity
     * @return: String
     */
    @RequestMapping(value = "company/queryAllCompany", method = RequestMethod.POST)
    public Resultor<CompanyEntity> queryCompany(@RequestBody CompanyEntity companyEntity) throws Exception{
        Resultor<CompanyEntity> resultor;
        CompanyEntity companyEntity1;
        try {
            resultor= companyService.queryAllElement(companyEntity);
            System.out.println("草率了"+resultor);
        } catch (VariableException e){
            resultor = new Resultor<>(ResultEnum.FAIL, e.getMessage());
        }
        return resultor;
    }    
    
    /**
     * @description: 修改企业
     * @author: JH
     * @date: 2020/10/29 22:43
     * @param companyEntity
     * @return: String
     */
    @RequestMapping(value = "company/modifyCompany", method = RequestMethod.POST)
    public Resultor<CompanyEntity> modifyCompany(@RequestBody CompanyEntity companyEntity) throws Exception{
        Resultor<CompanyEntity> resultor;
        try {
            resultor= companyService.modifyElement(companyEntity);
        } catch (VariableException e){
            resultor = new Resultor<>(ResultEnum.FAIL, e.getMessage());
        }
        return resultor;
    }   
    
    /**
     * @description: 删除企业
     * @author: JH
     * @date: 2020/10/29 22:43
     * @param companyEntity
     * @return: String
     */
    @RequestMapping(value = "company/deleteCompany", method = RequestMethod.POST)
    public Resultor<CompanyEntity> deleteCompany(@RequestBody CompanyEntity companyEntity) throws Exception{
        Resultor<CompanyEntity> resultor;
        try {
            resultor= companyService.deleteElement(companyEntity);
        } catch (VariableException e){
            resultor = new Resultor<>(ResultEnum.FAIL, e.getMessage());
        }
        return resultor;
    }
    
    @PostMapping(value = {"company/test"})
    public String test() {
        System.out.println("请求成功");
        return "hello word";
    }
    
    public void test1() {
        int a = 1;
        // byte,int,short,char,enum,string
        switch (a) {
            
        }
    }
}
