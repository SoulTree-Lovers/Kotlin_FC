package exam11

fun main() {

    // apply -> 생성자 패턴에서 많이 쓰임
    // - 초기화에 쓰임

    val userDto = UserDto().apply { // also와 마찬가지로 수신한 객체를 리턴함.
        name = "유리"
        this.name = "유리2"
        ""
    }

    val userDto2 = UserDto().apply { // also와 마찬가지로 수신한 객체를 리턴함.
        this.myUserDto() // 확장 함수를 넘겨줄 수도 있다!
    }

    println(userDto)
    println(userDto2)
}

fun UserDto.myUserDto() {
    name = "짱구는못말려"
}