import java.util.Scanner
fun main(args:Array<String>){
    val s = Scanner(System.`in`)
    println("the number of element")

    try {
        var colour = listOf<Int>(s.nextInt())
        println(colour)
    }
    catch (e:Exception)
    {
        println("number out of bounds of list array")
        e.printStackTrace()
    }
//    println(colour)
}