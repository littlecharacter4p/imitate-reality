package com.lc.imitate.reality.user.dao.impl;

import com.lc.imitate.reality.user.dao.UserDao;
import com.lc.imitate.reality.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserById(Long userId) {
        return new User(userId, "zs");
    }
}
