package com.github.zeng233.spring.container.context.validate;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/2/28 8:35
 * @Version 1.0
 */
public class HibernateBean {

    @NotNull(message = "id不能为空")
    private Integer id;

    @NotNull(message = "name不能为空")
    private String name;

    private Date createdDate;

    public HibernateBean () {}

    public HibernateBean(Integer id, String name, Date createdDate) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}