package com.example.fgo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FgoApplication

fun main(args: Array<String>) {
    runApplication<FgoApplication>(*args)
}
