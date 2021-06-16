package com.uwjx.springbootasynctesting.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/6/16 22:06
 */
@Configuration
@Slf4j
public class ThreadPoolConfiguration {

    @Bean(name = "taskExecutor")
    public Executor initExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(1);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(10);
        executor.setKeepAliveSeconds(60);
        executor.setThreadNamePrefix("hugh-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        log.warn("初始化线程池完毕");
        return executor;
    }
}
