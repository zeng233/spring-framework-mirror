package com.github.zeng233.spring.container.bean.core;

import com.github.zeng233.spring.container.bean.core.beans.CopyBean1;
import com.github.zeng233.spring.container.bean.core.beans.CopyBean2;
import org.junit.Test;
import org.springframework.cglib.beans.BeanCopier;

/**
 * @ClassName BeanUtilsTest
 * @Description 阿里巴巴插件推荐不要使用Apache Commons的BeanUtils有性能问题，
 * 参考：为什么阿里代码规约要求避免使用 Apache BeanUtils 进行属性复制：https://cloud.tencent.com/developer/article/1445629
 * @Author zenghua
 * @Email hua.zeng@dmall.com
 * @Date 2019/12/25 16:47
 * @Version 1.0
 */
public class BeanUtilsTest {

    @Test
    public void testCopy() {

        BeanCopier.create(CopyBean1.class, CopyBean2.class, false);

        CopyBean1 copyBean1 = new CopyBean1();
        copyBean1.setId(1);
        copyBean1.setName("a");

        CopyBean2 copyBean2 = new CopyBean2();

//        BeanCopier.
//        System.out.println(copyBean2.getName());
    }
}
