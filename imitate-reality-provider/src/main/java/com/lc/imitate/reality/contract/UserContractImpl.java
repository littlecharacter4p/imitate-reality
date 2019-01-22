package com.lc.imitate.reality.contract;

import com.lc.imitate.reality.dto.UserDto;
import com.lc.imitate.reality.pojo.Result;
import com.lc.imitate.reality.service.UserService;
import com.lc.imitate.reality.util.ResultUtil;
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
