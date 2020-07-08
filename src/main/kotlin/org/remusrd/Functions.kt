package org.remusrd

import io.kotless.dsl.lang.http.Post

@Post("/greet")
fun greet(greetRequest: GreetRequest) = "Hello ${greetRequest.name} !"

data class GreetRequest(
    val name: String = "stranger"
)
