package exam09

import java.lang.NullPointerException

fun main() {
    /**
     * when()은 java의 switch문과 비슷하지만,
     * java와 다르게 변수가 특정 구문을 탈 때 캐스팅되어 내려간다는 점이 다르다!
     */

    var result = when("") {
        "" -> {
            ""
        }
        "MASTER", "MASTER2" -> {
            "master"
        }
        "ADMIN" -> {
            "admin"
        }
        "USER" -> {
            "user"
        }
        else -> {
            "default"
        }
    }

    var any : Any = ""

    when (any) {
        is String -> {
            any.compareTo("") // String 객체의 메소드 활용 가능
        }
        is Int -> {
            any.plus(10) // Int 객체의 메소드 활용 가능
        }
        is Boolean -> {
            any.and(true) // Boolean 객체의 메소드 활용 가능
        }
    }

    var exception = Exception()
    when(exception) {
        is NullPointerException -> {
            // exception이 이미 캐스팅이 되어 해당 객체의 메소드를 사용할 수 있다.
        }
        is RuntimeException -> {

        }
    }

    var number = 10

    when (val n = number % 2) {
        0 -> {
            println("짝수입니다.")
        }
        else -> {
            println("홀수입니다.")
        }
    }


}