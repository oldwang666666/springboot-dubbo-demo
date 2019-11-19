package com.springboot.demo.consumer.pojo;

import java.io.Serializable;

/**
 * @Description 客户信息入参
 * @Author lz.wang
 * @Since 1.0
 * @Date 2019/11/19
 */
public class UserInfoParam implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 性别
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
