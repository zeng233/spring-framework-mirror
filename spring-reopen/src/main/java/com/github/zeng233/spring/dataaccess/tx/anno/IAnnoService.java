package com.github.zeng233.spring.dataaccess.tx.anno;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/4/6 19:15
 * @Version 1.0
 */
public interface IAnnoService {
    /**
     * 测试当前事务自己写入，再查下
     */
    void save();

    /**
     * 测试另外的事务提交后，再查下
     */
    void save2();
}
