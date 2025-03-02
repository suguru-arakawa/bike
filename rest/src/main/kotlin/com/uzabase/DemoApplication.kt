package com.uzabase

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	System.setProperty("spring.config.location", "classpath:config/application.yml")
	runApplication<DemoApplication>(*args)
}
