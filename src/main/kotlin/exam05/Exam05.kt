package exam05

import java.util.function.Predicate

fun main() {
    var numberList = listOf<Int>(
        1, 2, 3, 4, 5
    )

    val predicate = object: Predicate<Int> { // 익명함수 선언 시 object 사용
        override fun test(t: Int): Boolean {
            return t % 2 == 0
        }
    }

    val predicate2 = Predicate<Int> { t ->  // 위 코드를 람다식으로 변환
        t % 2 == 0
    }

    numberList.filter { it -> it % 2 == 0 }
    numberList.filter { it % 2 == 0 } // it 생략 가능
    numberList.stream().filter(predicate) // 익명함수로 사용 가능

    val add = { x: Int, y: Int -> x+y}

    println(add.invoke(2, 3)) // invoke를 통해 함수 실행
    println(add(2, 3)) // 그냥 함수 실행

    // 함수 자체를 변수에 저장 가능.
    val mul = fun(x: Int, y:Int): Int {
        return x * y
    }

    println(mul(3, 4))

    // 람다 함수를 따로 만들어서 매개변수로 함수와 인자를 같이 넘겨 실행할 수도 있다.
    lambda(5, 5, mul)
}

fun lambda(x: Int, y: Int, method: (Int, Int) -> Int) {
    println(method(x, y))
}