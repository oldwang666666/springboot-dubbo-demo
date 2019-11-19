package com.demo.base.api;

import com.demo.base.pojo.UserInfoDTO;
import com.demo.base.pojo.UserInfoVO;

public interface UserInfoService {

    UserInfoVO getUserInfo(UserInfoDTO dto);

    UserInfoVO getUserInfoById(Long id);
}
