fun main(){
    val olahraga = Olahraga()
    olahraga.cetak()
}

class Olahraga(var jenisOlahraga: String = "Badminton", var manfaatOlahraga: String = "Menambah Tinggi Badan", var keperluanOlahraga: String = "Raket, Shuttlecock, sepatu"){
    fun cetak(){
        println("Nama Olahraga: $jenisOlahraga")
        println("Manfaat: $manfaatOlahraga")
        println("Hal yang perlu disiapkan: $keperluanOlahraga")
    }
}
