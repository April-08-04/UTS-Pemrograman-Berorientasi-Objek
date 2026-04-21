class Pembeli(
    val nama: String,
    private var uangTunai: Int
) {
    private var poinMember: Int = 0

    fun lihatUang(): Int = uangTunai
    fun lihatPoin(): Int = poinMember

    fun kurangiUang(jumlah: Int): Boolean {
        return if (jumlah > 0 && uangTunai >= jumlah) {
            uangTunai -= jumlah
            true
        } else false
    }

    fun tambahPoin(poin: Int) {
        if (poin > 0) poinMember += poin
    }
}

class Barang(
    val namaBarang: String,
    val harga: Int,
    private var stok: Int
) {
    fun lihatStok(): Int = stok

    fun kurangiStok(jumlah: Int): Boolean {
        return if (jumlah > 0 && stok >= jumlah) {
            stok -= jumlah
            true
        } else false
    }
}

class Kasir(val namaKasir: String) {
    fun prosesTransaksi(pembeli: Pembeli, barang: Barang, jumlah: Int) {
        println("Kasir $namaKasir memproses transaksi...")

        val total = barang.harga * jumlah

        if (barang.lihatStok() < jumlah) {
            println("Gagal: stok tidak cukup")
            return
        }

        if (pembeli.lihatUang() < total) {
            println("Gagal: uang tidak cukup")
            return
        }

        barang.kurangiStok(jumlah)
        pembeli.kurangiUang(total)
        pembeli.tambahPoin(10)

        println("Transaksi berhasil!")
    }
}

fun main() {
    val pembeli = Pembeli("Budi", 50000)
    val barang = Barang("Minyak", 12000, 5)
    val kasir = Kasir("Siti")

    println("=== GAGAL ===")
    kasir.prosesTransaksi(pembeli, barang, 10)

    println("=== SUKSES ===")
    kasir.prosesTransaksi(pembeli, barang, 2)
}
