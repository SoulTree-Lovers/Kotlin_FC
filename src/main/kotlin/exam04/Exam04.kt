package exam04

fun main() {
    /**
     * 자바에서 Object = 코틀린에서 Any
     */
    val map = mapOf<String, Any>( // 불변 map
        Pair("", ""),
        "key" to "value" // Pair() 객체로 변환
    )

    val mutableMap = mutableMapOf(
        "key" to "value"
    )

    // 아래 두 가지 방식으로 값을 넣을 수 있다.
    mutableMap.put("key", "value")
    mutableMap["key"] = "value"

    // 아래 두 가지 방법으로 값을 가져올 수 있다.
    val value = mutableMap.get("key")
    val value2 = mutableMap["key"]

    val hashMap = hashMapOf<String, Any>()

    var triple = Triple<String, String, String>( // 3가지 값 저장하기
        first = "1",
        second = "2",
        third = "3"
    )

    println(triple.first)
    println(triple.second)
    println(triple.third)
}