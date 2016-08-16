package com.zj.service;

import com.zj.model.User;

/**
 *
 * @author ziJun
 */
public interface UserService {

    void addUser(User user);

    User getUserById(Integer id);
}
