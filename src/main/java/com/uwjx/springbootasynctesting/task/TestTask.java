package com.uwjx.springbootasynctesting.task;

import com.uwjx.springbootasynctesting.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/6/16 21:21
 */
@Component
@Slf4j
public class TestTask {

    @Resource
    private TestService testService;

    @Scheduled(initialDelay = 1000 * 5  , fixedRate = 100  )
    public void run() {
//        log.warn("执行 TestTask run() 开始");
        try {
            for (int i = 0; i < 10; i++) {
                testService.runTask(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        log.warn("执行 TestTask run() 完毕");
    }
}
