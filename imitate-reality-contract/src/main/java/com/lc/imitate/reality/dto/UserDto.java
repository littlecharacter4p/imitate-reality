package com.lc.imitate.reality.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
    private Long userId;
    private String userName;

    public UserDto(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
