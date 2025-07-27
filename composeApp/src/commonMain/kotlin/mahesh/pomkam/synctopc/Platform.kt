package mahesh.pomkam.synctopc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform