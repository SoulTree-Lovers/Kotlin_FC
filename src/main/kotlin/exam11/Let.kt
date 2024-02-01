package exam11

import java.time.LocalDateTime

fun main() {
    // let

//    val now: LocalDateTime?= null
    val now: LocalDateTime = LocalDateTime.now()

    val kst = now?.let {
        println(it) // 기본적으로 let 스코프 안에서 변수명은 it이다.
    } ?: LocalDateTime.now()

    val kst2 = now?.let {localDateTime : LocalDateTime ->
        println(localDateTime) // 위처럼 it 대신 다른 변수명을 사용할 수 있고, 타입도 명시하여 가독성을 높일 수 있다.
        "" // <- 스코프 안에서 가장 마지막 라인에 있는 값이 리턴된다. (return 키워드를 적으면 에러가 발생한다.)
    } ?: LocalDateTime.now()

    val kst3 = now?.let {localDateTime : LocalDateTime ->
        println("kst3 let scope: $localDateTime") // 위처럼 it 대신 다른 변수명을 사용할 수 있고, 타입도 명시하여 가독성을 높일 수 있다.
        "hello kst3" // <- 스코프 안에서 가장 마지막 라인에 있는 값이 리턴된다. (return 키워드를 적으면 에러가 발생한다.)
    } ?: LocalDateTime.now()

    println(kst3) // hello kst3 출력


    val userResponse = UserDto(name = "홍길동").let {
        logic(it)
    }

    println("userResponse: $userResponse")

    val userDtoList = listOf<UserDto>(
        UserDto(name = "홍길동"),
        UserDto(name = "철수"),
    )

    val responseList = userDtoList.stream()
        .map { it ->
            UserResponse(
                name = it.name
            )
        }.toList()

    println(responseList)
}

fun logic (userDto: UserDto) : UserResponse? {
    val response = userDto?.let { userDto ->  // UserDto
        println("userDto: $userDto")

        UserEntity(
            name = userDto.name
        )// entity 리턴
    }?.let { userEntity -> // UserEntity
        println("userEntity: $userEntity")

        UserResponse(
            name = userEntity.name
        ) // response 리턴
    }

    return response
}

data class UserDto (
    var name: String ?= null,
)

data class UserEntity (
    var name: String ?= null,
)

data class UserResponse (
    var name: String ?= null,
)

