package com.cn.hnust.dao;

import com.cn.hnust.pojo.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    //查找用户名密码
    Person selectByUsername(String username);
    Person selectByMail(String mail);
    Person selectByCodeAndEmail(Person record);
    int updateStateByCode(Person record);
    Person selectByPwdAndEmail(Person record);
}