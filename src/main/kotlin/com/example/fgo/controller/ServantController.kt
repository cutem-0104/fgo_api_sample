package com.example.fgo.controller

import com.example.fgo.entity.Servant
import com.example.fgo.entity.Skill
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
                "秩序・善",
                3,
                11516,
                7815,
                0,
                card,
                "A"
                )
    }

    @RequestMapping(value = "1/skill/1", method = arrayOf(RequestMethod.GET))
    fun getServantSkill(): Skill {
        return Skill(
                1,
                1,
                "今は脆き雪花の壁",
                "味方全体の防御力をアップ[Lv.1～]",
                3,
                7

        )
    }
}