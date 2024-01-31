package exam07

fun main() {
    var user = User(null, 20, null)
    println(user)

    user.name = "강승민"
    user.age = 25
    user.email = "rkd@naver.com"

    println(user)

    // 이름 부분만 변경할 수 있다.
    val user2 = user.copy(name = "강진호")
    println(user2)

    // 매개변수 이름을 직접 지정하여 순서에 상관없이 객체를 생성할 수 있다.
    val user3 = User(
        age = 25,
        name = "이동현",
        email = "lee@naver", // 마지막에 쉼표가 있어도 에러가 나지 않는다.
    )
    println(user3)

    /**
     * plugin에서 kotlin fill class 라는 것을 설치해서,
     * alt + enter 를 통해 생성자의 기본 파라미터를 자동으로 입력할 수 있다.
     */
    val user4 = User(
        name = "박준용",
        age = 20,
        email = "park@gmail",
    )
}