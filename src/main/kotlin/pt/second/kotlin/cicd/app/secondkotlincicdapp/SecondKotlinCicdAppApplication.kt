package pt.second.kotlin.cicd.app.secondkotlincicdapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecondKotlinCicdAppApplication

fun main(args: Array<String>) {
    runApplication<SecondKotlinCicdAppApplication>(*args)
}
