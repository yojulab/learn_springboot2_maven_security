package com.study.study_springboot_security.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.study_springboot_security.daos.SharedDao;

public class MemberWithAuthorityService {

    @Autowired
    SharedDao sharedDao;

    public Object insert(Object dataMap){
        String sqlMapId = "Memberwithauthority.insertWithUID";
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }
}
