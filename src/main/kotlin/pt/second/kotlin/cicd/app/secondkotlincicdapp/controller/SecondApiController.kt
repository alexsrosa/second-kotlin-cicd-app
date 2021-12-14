package pt.second.kotlin.cicd.app.secondkotlincicdapp.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 *
 * @author <a href="mailto:alexsros@gmail.com">Alex Rosa</a>
 * @since 04/12/2021 17:34
 */
@RestController
@RequestMapping("/v1/second")
class SecondApiController {

    @GetMapping
    fun second(model: Model): String {
        return UUID.randomUUID().toString()
    }


    @GetMapping("/another")
    fun another(model: Model): String {
        return UUID.randomUUID().toString()
    }

    @GetMapping("/anotherYuri")
    fun anotherYuri(model: Model): String {
        return UUID.randomUUID().toString()
    }
}