package com.github.zeng233.spring.dataaccess.tx.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/4/8 17:00
 * @Version 1.0
 */
@Service
public class AnnoService2 implements IAnnoService {
    @Autowired
    private AnnoDao annoDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    @Override
    public void save() {
        annoDao.insert();
    }

    @Override
    public void save2() {

    }
}