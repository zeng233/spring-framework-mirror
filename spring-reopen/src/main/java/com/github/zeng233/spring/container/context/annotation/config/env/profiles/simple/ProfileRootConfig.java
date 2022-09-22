package com.github.zeng233.spring.container.context.annotation.config.env.profiles.simple;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zenghua
 * @date 2022/9/21
 */
@Configuration
@Import({ProfileConfig1.class, ProfileConfig2.class, ProfileConfig3.class})
@PropertySource("classpath:com/github/zeng233/spring/container/context/annotation/config/env/profiles/profileRootConfig.properties")
public class ProfileRootConfig {
}
