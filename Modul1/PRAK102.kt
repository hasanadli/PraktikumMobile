import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    val x: Int
    print("Nilai x = ")
    x = input.nextInt()

    val hasil = 2 * (x * x) + 5 * x - 8
    print(hasil)
}
