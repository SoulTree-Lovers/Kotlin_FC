package exam10

fun main() {
    var user = ExamUser(name = "홍길동")
    exam10(user)
}


fun exam10(examUser: ExamUser?) {

    examUser?.let { // examUser가 null이 아닐 때만 실행
        it.name?.let { name ->  // name이 null이 아닐 때만 실행
            println(name)
        }
    } ?: run {
        // examUser가 null일 때 실행
    }


    examUser?.let {
        if (!it.name.isNullOrBlank()) { // null과 blank가 아닌경우에만 실행
            println(it.name)
        }
    }

    examUser?.let {
        if (it.name.isNotNullOrBlank()) { // 선언한 확장함수를 통해 null과 blank가 아닌경우에만 실행
            println(it.name)
        }
    }

    // Any 클래스에 isNotNull() 메소드를 확장함수를 통해 구현하여 사용
    if (examUser.isNotNull() && examUser?.name.isNotNullOrBlank()) {
        println(examUser?.name)
    }

}


// 모든 클래스의 부모 클래스: Any
fun Any?.isNotNull() : Boolean {
    return this != null
}


data class ExamUser (
    var name: String ?= null
)


fun String?.isNotNullOrBlank() : Boolean { // 확장함수: 특정 클래스에 내가 사용하고 싶은 메소드를 등록
    return !this.isNullOrBlank()
}