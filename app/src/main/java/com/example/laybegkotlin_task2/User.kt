package com.example.laybegkotlin_task2

import java.io.Serializable

class User(var name: String, var age: Int) : Serializable {
    override fun toString(): String {
        return "User {" +
                "name=" + name +
                ", age=" + age + '\'' +
                '}'
    }
}