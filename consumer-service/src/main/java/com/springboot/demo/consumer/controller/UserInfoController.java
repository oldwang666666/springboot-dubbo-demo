package com.springboot.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.base.api.UserInfoService;
import com.demo.base.pojo.UserInfoDTO;
import com.demo.base.pojo.UserInfoVO;
import com.springboot.demo.consumer.pojo.UserInfoParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 客户信息控制层
 * @Author lz.wang
 * @Since 1.0
 * @Date 2019/11/19
 */
@RestController
public class UserInfoController {

    //忽略启动校验
    @Reference(check=false)
    private UserInfoService userInfoService;


    @RequestMapping("/getUserInfoById")
    public UserInfoVO getUserInfoById(Long id){

        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping("/getUserInfo")
    public UserInfoVO getUserInfo(UserInfoParam userInfoParam){

        UserInfoDTO dto = new UserInfoDTO();
        dto.setId(userInfoParam.getId());
        dto.setName(userInfoParam.getName());
        dto.setAge(userInfoParam.getAge());
        return userInfoService.getUserInfo(dto);
    }

}
