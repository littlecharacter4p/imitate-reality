package com.lc.imitate.reality.contract;

import com.lc.imitate.reality.dto.UserDto;
import org.springframework.stereotype.Service;

@Service("userContract")
public class UserContractImpl implements UserContract {
    @Override
    public UserDto getUserById(Long userId) {
        return new UserDto(userId, "zs");
    }
}
