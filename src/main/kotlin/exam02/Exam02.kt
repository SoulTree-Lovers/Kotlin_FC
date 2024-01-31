package exam02

import java.util.Optional

fun main() {
    // 코틀린의 모든 기본값은 null이다.
    val a: Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunction(a) // 0
    callFunction(b) // 10
    callFunction(c) // 20
    callFunction(d) // null
    callFunction()
}

fun callFunction(i: Int? = 100) { // 매개변수의 타입을 지정 (?는 앨비스 연산자) + 만약 값이 없다면 100으로 세팅
//    println(i)

    // 자바의 문법을 그대로 사용할 수 있다. (null이 아닐 때만 출력)
//    Optional.ofNullable(i)
//        .ifPresent { it -> println(it) }

    // 코틀린 문법으로 사용
    // ? <- null이 올 수도 있다는 의미
    // 변수? <- 변수가 null인지 확인
    // 변수?. <- 변수가 null이 아닐 때
    // 변수?: <- 변수가 null일 때

    // 삼항연산자 대신 사용 (i가 null이면 temp에 "null입니다" 세팅)
    val temp = if (i == null) "(temp)null입니다." else i
    val temp2 = i ?: "(temp2)null입니다."
    val temp3 = i?.let { it * 20 } ?: "(temp3)null입니다."
    println(temp)
    println(temp2)
    println(temp3)

    i?.let {
        println(it)
    } ?: run {
        println("null입니다.")
    }
}