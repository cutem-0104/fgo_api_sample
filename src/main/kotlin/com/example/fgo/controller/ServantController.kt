package com.example.fgo.controller

import com.example.fgo.entity.Servant
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("servant")
class ServantController {

    @RequestMapping(value = "/1", method = arrayOf(RequestMethod.GET))
    fun getServant(): Servant {
        return Servant("ましゅ・きりえらいと", 3)
    }
}