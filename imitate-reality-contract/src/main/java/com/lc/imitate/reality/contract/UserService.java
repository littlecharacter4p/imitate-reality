package com.lc.imitate.reality.contract;

import com.lc.imitate.reality.dto.UserDto;

public interface UserService {
    UserDto getUserById(Long userId);
}
