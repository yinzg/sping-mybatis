package com.zj.mapper;

import com.zj.model.User;

/**
 *
 * @author ziJun
 */
public interface UserMapper {

    void insertUser(User user);

    User selectUserById(Integer id);
}
