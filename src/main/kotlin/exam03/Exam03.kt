package exam03


fun main() {
    // 코틀린은 가변(var)이냐, 불변(val)이냐가 명확하게 나뉘어져 있다.
    // 기본적으로는 불변형식이다. ex) listOf<>()
    // 가변으로 사용하고 싶다면, ex) mutableListOf<>() 처럼 앞에 mutable과 같은 수식어를 붙여야 한다.
    val userList = mutableListOf<User>() // 내용이 바뀔 수 있는 리스트
    userList.add(User("1", 10))
    userList.add(User("2", 10))
    userList.add(User("3", 10))

    val list = listOf<User>( // 내용이 바뀔 수 없음 (초기화할 때 값을 넣어야 함.)
        User("4", 10),
        User("5", 10),
        User("6", 10)
    )

    for (element in userList) {
        println(element)
    }

    userList.forEach { it -> println(it) }

    userList.forEachIndexed { index, user ->  // 변수를 그대로 넘겨줌.
        println("index: $index, user: $user")
    }

    userList.forEachIndexed(fun (index, user) { // 함수 자체를 넣는 것도 가능함.
        println("index: $index, user: $user")
    })

    for ((index, user) in userList.withIndex()) { // for문을 통해 인덱스 출력
        println("index: $index, user: $user")
    }
}

class User (
    var name: String,
    var age: Int
)


