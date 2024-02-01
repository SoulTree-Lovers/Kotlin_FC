package exam11

fun main() {
    // also

    val userDto = UserDto(
        name = "짱구"
    ).also { dto: UserDto -> // userDto가 그대로 넘어옴. (let과 다르게 마지막 라인을 리턴하는 것이 아님!)
        println(dto)

        UserDto( // 이 객체가 리턴되는 것이 아님.
            name = "훈이"
        )
    }

    println("result: $userDto")
}