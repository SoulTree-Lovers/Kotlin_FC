package exam08

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    Exam08(Store())

    println(DateTimeUtil().localDateTimeToString()) // 기본값
}

data class Store(
    var registerAt: LocalDateTime ?= null // 값이 없다면 null이 기본 값

)

class Exam08 {
    constructor(store: Store) { // 생성자 메소드
        val strLocalDateTime = toLocalDateTimeString(store.registerAt)
        println(strLocalDateTime) // null값을 전달했으므로, 현재 시간으로 생성
        println(toLocalDateTimeString()) // 디폴트값으로 생성
    }

    fun toLocalDateTimeString(
        localDateTime: LocalDateTime? = LocalDateTime.of(2024, 1, 1, 14, 0, 0) // 매개변수가 아예 없는 경우 디폴트값
    ) : String { // : String 은 리턴 타입이 String이라는 의미이다.

        val temp = localDateTime // 값이 있다면 그대로 넣기
            ?: LocalDateTime.now() // 매개변수가 들어오긴 했지만, null값인 경우 현재 시간 넣기

        return temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil {

    private val FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"

    fun localDateTimeToString(
        localDateTime: LocalDateTime? = LocalDateTime.now(),
        format: String?=FORMAT
    ): String {
        return (localDateTime ?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern(format))
    }
}