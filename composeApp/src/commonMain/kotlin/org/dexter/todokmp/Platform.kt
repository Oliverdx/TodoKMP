package org.dexter.todokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform