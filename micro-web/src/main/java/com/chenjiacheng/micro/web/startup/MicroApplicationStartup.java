package com.chenjiacheng.micro.web.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by chenjiacheng on 2024/9/11 00:43
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@Component
public class MicroApplicationStartup implements ApplicationRunner {

    @Autowired
    private ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DataSource dataSource = ctx.getBean(DataSource.class);
        log.info("datasource: {}",dataSource);

    }
}
