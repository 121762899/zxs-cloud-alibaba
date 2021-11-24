package com.zxs.user.service;

import com.zxs.user.common.resp.RestResult;
import com.zxs.user.model.AdminUser;

import java.util.List;

public interface UserService {
    AdminUser findByUserName(String userName);

    RestResult<List<AdminUser>> findByUserName2(String userName);
}
