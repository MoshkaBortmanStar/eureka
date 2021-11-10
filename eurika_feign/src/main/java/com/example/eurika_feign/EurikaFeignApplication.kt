package com.example.eurika_feign

import com.example.eurika_feign.EurikaFeignApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@EnableEurekaClient
@EnableFeignClients
@RestController
@SpringBootApplication
open class EurikaFeignApplication {
    @Autowired
    var feignMy: FeignMy? = null
    @GetMapping("test")
    fun get(): String? {
        return feignMy!!.greeting()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(EurikaFeignApplication::class.java, *args)
        }
    }
}