package exam01

fun main() {

    /**
     * 변수 선언: var or val
     * var: 가변 객체
     * val: 불변 객체 -> 값을 한 번 할당하면 변경이 불가능
     *
     * 변수 선언 시 [형식] [변수명]: [타입] = [값]
     * :과 [타입]은 생략할 수 있다 (자동으로 인식)
     * 문장 끝에 세미콜론을 찍지 않아도 된다.
     * java와 달리 기본타입과 객체타입이 따로 존재하지 않는다. -> 기본타입(primitive type)이 존재하지 않는다.
     */


    val name: String = "홍길동"
    var _name: String = "홍길동"
    var n = "홍길동"

    var i = 10
    var _i: Int = 10

    var d: Double = 20.0
    var _d: Double

    var f: Float = 10f

    var b: Boolean = true

    // java: System.out.println(name);
    println(name) // 자바보다 간결하다!

    // java: System.out.println("이름: " + name);
    println("이름: $name") // $를 통해 변수를 바로 작성할 수 있다.


}