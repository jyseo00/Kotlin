interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

//Derived 클래스는 Base 인터페이스 상속하며 모든 public 메소드를 지정한 객체로 위임
//by는 클래스 또는 프로퍼티를 위임할때 사용
class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}

