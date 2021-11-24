package com.zxs.user.facade;

import com.zxs.user.model.AdminUser;

public interface UserFacade {

    AdminUser findUserByUsername(String username);

}
