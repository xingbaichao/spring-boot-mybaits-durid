package com.sevencailongzhu.art.ecommerce.service;

import com.sevencailongzhu.art.ecommerce.dao.UserMapper;
import com.sevencailongzhu.art.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by xingbaichao on 15/12/10.
 */
@Service
public class AccountService {


    private UserMapper mapper;


    @Autowired
    public void setUserMapper(UserMapper mapper){
        this.mapper = mapper;
    }
    public String sayHiMessage(String name) {
        User user = new User();
//        user.setId(1);

        user.setSalt("11");
        user.setPassword("11");
        user.setName("dfdf");
        user.setLoginName("222");
        user.setRoles("aa");

        mapper.save(user);

        return "Hello " + name;
    }
}
