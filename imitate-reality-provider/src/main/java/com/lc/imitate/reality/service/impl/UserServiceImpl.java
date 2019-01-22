package com.lc.imitate.reality.service.impl;

import com.lc.imitate.reality.dao.UserDao;
import com.lc.imitate.reality.dto.UserDto;
import com.lc.imitate.reality.entity.User;
import com.lc.imitate.reality.service.UserService;
import com.lc.imitate.reality.util.BeanCopy;
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
