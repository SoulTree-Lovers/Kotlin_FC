package exam11

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    // run

    val userDto = UserDto().run {
        name = "맹구" // <-- apply와 같이 수신한 객체 자신에 접근할 수 있다.
        "수지" // <-- 마지막 라인이 리턴된다.
    }

    println("result: $userDto")


    // 보통 아래와 같이 let에 이어서 run을 많이 사용한다.
    val now : LocalDateTime? = null

    val date = now?.let {
        val temp = now.minusDays(1)
        temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    } ?: run { // now == null일 때
        val now = LocalDateTime.now()
        val temp = now.minusDays(1)
        temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }

    println("date: $date")
}