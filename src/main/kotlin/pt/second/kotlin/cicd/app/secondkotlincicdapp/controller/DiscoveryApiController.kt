package pt.second.kotlin.cicd.app.secondkotlincicdapp.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 13/12/2021 22:56
 */
@RestController
@RequestMapping("/v1/services")
class DiscoveryApiController {

    @Autowired
    private val discoveryClient: DiscoveryClient? = null

    @GetMapping
    fun services(): List<String?>? {
        return discoveryClient!!.services
    }
}