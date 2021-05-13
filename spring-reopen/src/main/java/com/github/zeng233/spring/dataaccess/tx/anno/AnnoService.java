package com.github.zeng233.spring.dataaccess.tx.anno;

import com.github.zeng233.spring.dataaccess.tx.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/4/6 16:41
 * @Version 1.0
 */
@Service
public class AnnoService implements IAnnoService {
    @Autowired
    private AnnoDao annoDao;

    @Autowired
    private IAnnoService annoService2;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save() {
        annoDao.insert();
        List<User> userList = annoDao.list();
        System.out.println(userList);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save2() {
        //当前事务写入
        annoDao.insert();
        List<User> userList = annoDao.list();
        System.out.println(userList);

        //其他事务写入
        annoService2.save();
        List<User> userList2 = annoDao.list();

        //当前事务再写入
        annoDao.insert();
        List<User> userList3 = annoDao.list();
        System.out.println(userList3);
    }
}