import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    var bilangan : Int
    var output = 5
    var i = 0
    print("Input Bilangan = ")
    bilangan = input.nextInt()
    var kelipatan = bilangan

    while (i < output){
        bilangan += kelipatan
        if (bilangan %2 == 0 || bilangan %3 == 0){
            print("${bilangan} ")
        }else {
            output++
        }
        i++
    }
}
