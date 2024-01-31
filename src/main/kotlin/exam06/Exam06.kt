package exam06

fun main() {
    val dog = Dog("순이")
    dog.bark()
    dog.eat()
    dog.hi()

    // 코틀린은 기본적으로 getter setter를 제공해줌.
    println(dog.age)

    dog.age = 20

    println(dog.age)
}

// 인터페이스 구현
interface Bark {
    fun bark()
}

interface Temp {
    fun hi()
}

abstract class Animal ( // 생성자
    private val name: String?="" // 값이 없다면, ""으로 초기화
) : Bark {
    // body
    fun eat() {
        println("$name 음식 먹기")
    }
}

class Dog(
    private val name: String?= null // 생성자 메소드
) : Animal(name), Temp { // 부모로 값 넘겨주기 -> java: super(name) / 다중 상속

    var age: Int?=0 // var 이므로 setter 동작


    override fun bark() {
        println("$name 멍멍")
    }

    override fun hi() {
        println("$name 안녕")
    }
}
