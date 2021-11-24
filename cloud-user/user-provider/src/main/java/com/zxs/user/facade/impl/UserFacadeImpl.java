package com.zxs.user.facade.impl;

import com.zxs.user.facade.UserFacade;
import com.zxs.user.mapper.AdminUserMapper;
import com.zxs.user.model.AdminUser;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser findUserByUsername(String username) {
        return adminUserMapper.findUserByUsername(username);
    }

}
