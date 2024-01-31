package exam07

data class User ( // 클래스 앞에 data 키워드를 붙이면 toString, HashCode 등 모든 기능을 만들어준다.
    // getter, setter는 data를 붙이지 않아도 기본적으로 제공됨.
    var name: String?= null,
    var age: Int?= null,
    var email: String?= null
) {
    // toString 생성 (data 키워드 붙이면 필요없음)
//    override fun toString(): String {
//        return "User(name=$name, age=$age, email=$email)"
//    }
}