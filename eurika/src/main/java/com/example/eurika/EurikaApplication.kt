package com.example.eurika

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
open class EurikaApplication
fun main(args: Array<String>) {
    SpringApplication.run(EurikaApplication::class.java, *args)
}