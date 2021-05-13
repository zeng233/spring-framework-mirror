package com.github.zeng233.spring.dataaccess.tx.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/4/7 9:05
 * @Version 1.0
 */
public class User implements Serializable {

    private Long id;

    private String userName;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}