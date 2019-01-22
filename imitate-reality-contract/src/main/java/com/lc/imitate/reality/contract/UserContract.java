package com.lc.imitate.reality.contract;

import com.lc.imitate.reality.dto.UserDto;
import com.lc.imitate.reality.pojo.Result;

public interface UserContract {
    Result<UserDto> getUserById(Long userId);
}
