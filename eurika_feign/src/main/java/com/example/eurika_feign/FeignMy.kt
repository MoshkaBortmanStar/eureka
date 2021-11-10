package com.example.eurika_feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("spring-cloud-eureka-client")
interface FeignMy {
    @RequestMapping("/greeting")
    fun greeting(): String?
}