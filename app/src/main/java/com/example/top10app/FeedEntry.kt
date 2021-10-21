package com.example.top10app

class FeedEntry {
    var name: String = ""


    override fun toString(): String {
        return """
            name = $name
           """.trimIndent()
    }
}