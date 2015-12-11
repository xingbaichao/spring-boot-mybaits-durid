package com.sevencailongzhu.art.ecommerce.dao;

import com.sevencailongzhu.art.ecommerce.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by xingbaichao on 15/12/11.
 */
@MyBatisRepository
public interface UserMapper {

    User get(Long id);

    List<User> search(Map<String, Object> parameters);

    void save(User user);

    void delete(Long id);
}
