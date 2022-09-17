package org.verita.auth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VeriAuthApplication

fun main(args: Array<String>) {
    runApplication<VeriAuthApplication>(*args)
}
