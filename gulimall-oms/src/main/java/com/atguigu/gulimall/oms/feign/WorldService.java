package com.atguigu.gulimall.oms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Helin
 * @date 19/10/03 - 00:30
 */

@Service
@FeignClient(name = "gulimall-pms")
public interface WorldService {

    @GetMapping("/world")
    public String world();
}
