package com.lc.imitate.reality.user.contract;


import com.lc.imitate.reality.user.dto.UserDto;
import com.lc.imitate.reality.user.pojo.Result;
import com.lc.imitate.reality.user.service.UserService;
import com.lc.imitate.reality.user.util.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userContract")
public class UserContractImpl implements UserContract {
    @Resource
    private UserService userService;

    @Override
    public Result<UserDto> getUserById(Long userId) {
        UserDto userDto = userService.getUserById(userId);
        return ResultUtil.success(userDto);
    }
}
