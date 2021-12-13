package pt.second.kotlin.cicd.app.secondkotlincicdapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 13/12/2021 22:57
 */
@EnableDiscoveryClient
@SpringBootApplication
class SecondKotlinCicdAppApplication

fun main(args: Array<String>) {
    runApplication<SecondKotlinCicdAppApplication>(*args)
}
