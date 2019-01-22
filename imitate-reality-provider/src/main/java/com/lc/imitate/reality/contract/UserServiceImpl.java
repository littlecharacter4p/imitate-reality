package com.lc.imitate.reality.contract;

import com.lc.imitate.reality.dto.UserDto;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserDto getUserById(Long userId) {
        return new UserDto(userId, "zs");
    }
}
