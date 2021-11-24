package com.zxs.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class AdminUser implements Serializable {

    @ApiModelProperty(value = "id", notes = "id")
    private Integer id;

    @ApiModelProperty(value = "用户名", notes = "用户名")
    private String username;

    @ApiModelProperty(value = "昵称", notes = "昵称")
    private String nickname;

    @ApiModelProperty(value = "手机号", notes = "手机号")
    private String phone;

    private static final long serialVersionUID = 1L;

}
