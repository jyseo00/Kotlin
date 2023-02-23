fun main(args: Array<String>) {
    println("Hello World!")
    print(args[0])
    print(args[1])
    println(args[2])

    var n : String = "10"
    println(n)

    //변수타입 초기화 값을 할당하지 않으려면 타입 지정 var n: String = ""

    //val (java final) 불변타입함수, 초기화만 가능, 값 변경시 컴파일 에러
    val name = "kotlin"
    //name = "java" 에러 발생

    //타입지정 가능, 추론가능한값인 경우 생략가능(공통)
    val name2: String = "Swift"
    //초기화시 값 할당하지않을땐 타입 지정해야함(공통)
    val name3: String
    name3 = "Swift"

    //문맥에 따라 결과적으로 한번만 초기화됨이 맞다면 여러번 변경 가능
    val name4: String
    if (isSuccess()) {
        name4 = "Android"
    } else {
        name4 = "iOS"
    }
    println("name4 : $name4")

    //변수의 참조가 가리키는 객체 내부 값은 변경가능
    val nameArray = arrayListOf("kotlin")
    nameArray.add("java")
    println("nameArray : $nameArray")
    nameArray.remove("java")
    println("nameArray : $nameArray")

    //var 가변타입함수 초기화 후 값변경 가능, 다른 타입 불가, 타입변경시 형변화 처리
    var namevar1 = "kotlin"
    namevar1 = "java"
    println("name1 : $namevar1")

    var namevar2 = "kotlin"
    namevar2 = 77777.toString()
    println(namevar2)
    println(namevar2.length)

    //코틀린에서 모든 변수는 null이 들어갈 수 없음. null 허용은 타입? 을 선언해야함.
    //var namevar3 = null ///가능? 타입을 선언하지않으면 가능한거 같다? 컴파일에러나지않음. length불가
    //println(namevar3)
    //
    var namevar3 : String? = null //타입? 선언해주면 length 가능
    println(namevar3)
    println(namevar3?.length)

    //인스턴스 생성 시 new 키워드 사용하지않음
    var sb = StringBuffer("코틀린")
    print(sb)
    var string = String(sb)
    print(string)

}

fun isSuccess() : Boolean {
    //리턴하지않는 함수 Unit (void) 생략가능
    return true
}