package com.zxs.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxs.user.model.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {

    /**
     * 获取用户列表
     *
     * @param username
     * @return
     */
    AdminUser findUserByUsername(@Param("username") String username);


}
