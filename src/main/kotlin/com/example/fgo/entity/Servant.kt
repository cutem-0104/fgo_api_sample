package com.example.fgo.entity

class Servant(
        val no: Int,
        var name: String = "",
        val `class`: String = "",
        val rare: Int = 1,
        val hp: Int,
        val attack: Int,
        val cost: Int,
        val card: Map<String, Int>,
        val noblePhantasm: String
)