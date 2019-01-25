package com.lc.imitate.reality.user.service.impl;


import com.lc.imitate.reality.user.dao.UserDao;
import com.lc.imitate.reality.user.dto.UserDto;
import com.lc.imitate.reality.user.entity.User;
import com.lc.imitate.reality.user.service.UserService;
import com.lc.imitate.reality.user.util.BeanCopy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public UserDto getUserById(Long userId) {
        User user = userDao.getUserById(userId);
        return BeanCopy.copyBeanByJson(user, UserDto.class);
    }
}
