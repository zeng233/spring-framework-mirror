package com.github.zeng233.spring.dataaccess.tx.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2021/4/6 16:41
 * @Version 1.0
 */
@Service
public class AnnoService {
    @Autowired
    private AnnoDao annoDao;

    @Transactional(rollbackFor = Exception.class)
    public void save() {
        annoDao.insert();
    }
}