package com.lc.imitate.reality.user.contract;

import com.lc.imitate.reality.user.dto.UserDto;
import com.lc.imitate.reality.user.pojo.Result;

public interface UserContract {
    Result<UserDto> getUserById(Long userId);
}
