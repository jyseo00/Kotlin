import org.w3c.dom.Node
import java.lang.IllegalArgumentException

class Elvis {



    fun elvisIfElse() {
        println("--------------------------elvisIfElse")
        //Elvis 연산자 (표현법: ?:)
        //?:왼쪽 객체가 non-null이면 그 객체의 값이 리턴되고 null이라면 ?: 오른쪽 값 리턴

        val str: String? = "1234"
        val nullStr: String? = null

        var len: Int = if (str != null) str.length else -1
        println("str.length: $len")

        len = if (nullStr != null) nullStr.length else -1
        println("nullStr.length: $len")
    }

    fun elvisOperation() {

        println("--------------------------elvisOperation")
        //?. SafeCall str?.length객체가 null이 아니면 그 값을 리턴, null이면 -1리턴
        val str: String? = "1234"
        val nullStr: String? = null

        var len: Int = str?.length ?: -1
        println("str.length: $len")

        len = nullStr?.length ?: -1
        println("nullStr.length: $len")
    }

    fun returnStr(): String? {
        //return "TRUE!!"
        return null
    }

    fun foo(e: Elvis): String? {
        println("--------------------------returnFun")
        //메소드에서 null 리턴
        val parent = e.returnStr()
        return parent ?: return null

        //Exception 발생 구현
        //val name = e.returnStr() ?: throw IllegalArgumentException("name expected ")
        //return name
    }
}




fun main() {
    val e = Elvis()
    e.elvisIfElse()
    e.elvisOperation()
    println(e.foo(e))

}