package com.uwjx.springbootasynctesting.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author wanghuan
 * @link https://huan.uwjx.com
 * @date 2021/6/16 21:20
 */
@Service
@Slf4j
public class TestService {

    @Async
    public void runTask(int i){
        log.warn("执行任务开始 : " + Thread.currentThread().getName());
        log.warn("获取车辆:{} 的数据" , i);
        try {
            Thread.sleep(10* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.error("执行任务完毕 : " + Thread.currentThread().getName());
    }
}
