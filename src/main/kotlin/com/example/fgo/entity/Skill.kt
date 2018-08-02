package com.example.fgo.entity

class Skill(
        val id: Int,
        val servantId: Int,
        val name: String = "",
        val effect: String = "",
        val continuation: Int,
        val CT: Int
)