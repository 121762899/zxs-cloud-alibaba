package com.zxs.user.service.impl;

import com.zxs.user.common.resp.RestResult;
import com.zxs.user.facade.UserFacade;
import com.zxs.user.model.AdminUser;
import com.zxs.user.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @DubboReference
    private UserFacade userFacade;

    @Override
    public AdminUser findByUserName(String userName) {
        return userFacade.findUserByUsername(userName);
    }

    @Override
    public RestResult<List<AdminUser>> findByUserName2(String userName) {
        return null;
    }

}
