package com.chenjiacheng.micro.web.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by chenjiacheng on 2024/9/11 00:43
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@Component
public class MicroApplicationStartup implements ApplicationRunner {

    @Resource
    private ConfigurableEnvironment environment;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        environment.getPropertySources()
                .stream()
                .filter(ps -> ps instanceof EnumerablePropertySource)
                .map(ps -> (EnumerablePropertySource<?>) ps)
                .flatMap(ps -> Arrays.stream(ps.getPropertyNames()))
                .distinct()
                .forEach(key -> log.info("{} = {}", key, environment.getProperty(key)));
    }
}
