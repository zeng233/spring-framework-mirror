package com.github.zeng233.spring.container.context.xml.collection;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2020/1/3 11:07
 * @Version 1.0
 */
public enum MapTypeEnum {
    /**
     * 路由工厂
     */
    A(1, "routea"),
    B(2, "routeb");
    private int type;
    private String message;

    MapTypeEnum(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
