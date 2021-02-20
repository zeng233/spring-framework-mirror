package com.github.zeng233.spring.container.context.xml.simple;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/2/20 17:04
 * @Version 1.0
 */
public class XmlSimpleBean {
    private Long id;

    private String name;

    private XmlSimpleBean2 xmlSimpleBean2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public XmlSimpleBean2 getXmlSimpleBean2() {
        return xmlSimpleBean2;
    }

    public void setXmlSimpleBean2(XmlSimpleBean2 xmlSimpleBean2) {
        this.xmlSimpleBean2 = xmlSimpleBean2;
    }
}