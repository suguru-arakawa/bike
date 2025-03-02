package com.uzabase

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/systems")
class SystemResource {

    @GetMapping("/ping")
    fun pong() = "ping2"
}