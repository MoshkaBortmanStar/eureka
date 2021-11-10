package com.example.eurika_client

import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import com.netflix.discovery.EurekaClient
import org.springframework.web.bind.annotation.RequestMapping
import kotlin.jvm.JvmStatic
import org.springframework.boot.SpringApplication
import com.example.eurika_client.EurikaClientApplication
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Lazy

@EnableEurekaClient
@SpringBootApplication
@RestController
open class EurikaClientApplication {
    @Autowired
    @Lazy
    private val eurekaClient: EurekaClient? = null

    @Value("\${spring.application.name}")
    private val appName: String? = null
    @RequestMapping("/greeting")
    fun greeting(): String {
        return String.format(
            "Hello from '%s'!", eurekaClient!!.getApplication(appName).name
        )
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(EurikaClientApplication::class.java, *args)
        }
    }
}