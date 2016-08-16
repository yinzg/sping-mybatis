package com.zj.service.impl;

import com.zj.mapper.UserMapper;
import com.zj.model.User;
import com.zj.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

/**
 *
 * @author ziJun
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Transactional
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    public User getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

}
