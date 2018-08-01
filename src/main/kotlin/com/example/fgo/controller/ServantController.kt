package com.example.fgo.controller

import com.example.fgo.entity.Servant
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("servant")
class ServantController {

    @RequestMapping(value = "/1", method = arrayOf(RequestMethod.GET))
    fun getServant(): Servant {
        val card = mutableMapOf("Q" to 1, "A" to 2, "B" to 2)
        return Servant(
                1,
                "ましゅ・きりえらいと",
                "シールダー",
                3,
                11516,
                7815,
                0,
                card,
                "A"
                )
    }
}