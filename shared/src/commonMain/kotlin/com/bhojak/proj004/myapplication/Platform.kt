package com.bhojak.proj004.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform