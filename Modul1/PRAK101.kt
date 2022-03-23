import kotlin.random.Random
import java.util.Scanner

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    val waktu: String
    val nama: String
    val umur: Int
    print("Waktu Sekarang: ")
    waktu = input.nextLine()
    print("Nama Anda: ")
    nama = input.nextLine()
    print("Umur Anda: ")
    umur = input.nextInt()
    var suhu = String.format("%.2f", Random.nextDouble(35.00, 37.00))

    println("\n")

    println("Selamat $waktu $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celcius")
}