# UTS Pemrograman Berorientasi Objek

## Sistem ITK-Print (Kotlin)

### 📌 Deskripsi

Project ini merupakan implementasi sistem simulasi pencetakan (**ITK-Print**) menggunakan bahasa **Kotlin** sebagai bagian dari Ujian Tengah Semester (UTS) mata kuliah Pemrograman Berorientasi Objek.

Sistem ini dirancang untuk mensimulasikan proses pencetakan dokumen dengan mempertimbangkan:

* Saldo pelanggan
* Ketersediaan tinta
* Ketersediaan kertas
* Biaya per halaman

---

### 🎯 Tujuan

* Menerapkan konsep **Object-Oriented Programming (OOP)**:

  * Encapsulation
  * Class & Object
  * Method & Behavior
* Mengimplementasikan aturan bisnis dalam bentuk program
* Melakukan simulasi kondisi **berhasil dan gagal**

---

### 🧩 Struktur Class

Project ini terdiri dari 3 class utama:

1. **Pelanggan**

   * Menyimpan data nama dan saldo
   * Mengelola proses top up dan pengurangan saldo

2. **Dokumen**

   * Menyimpan nama dokumen dan jumlah halaman

3. **MesinPrint**

   * Mengelola proses pencetakan
   * Mengecek tinta, kertas, dan saldo pelanggan

---

### ⚙️ Fitur

* Simulasi cetak berhasil
* Simulasi cetak gagal (saldo tidak cukup)
* Validasi tinta dan kertas
* Perhitungan biaya otomatis
* Menampilkan informasi sisa sumber daya mesin

---

### Cara Menjalankan Program

#### Opsi 1 (Online)

1. Buka: https://play.kotlinlang.org
2. Copy isi file `Main.kt`
3. Paste ke editor
4. Klik tombol **Run**

#### Opsi 2 (Offline)

1. Gunakan IntelliJ IDEA / Kotlin Compiler
2. Jalankan file `Main.kt`

---

### Contoh Output

```text
=== SISTEM ITK PRINT BERJALAN ===

=== SIMULASI GAGAL: SALDO TIDAK CUKUP ===
Cetak gagal: saldo pelanggan tidak mencukupi.

=== SIMULASI SUKSES ===
Cetak berhasil.
Saldo pelanggan tersisa: Rp5000
```

---

### Struktur Repository

* `Main.kt` → Source code program
* `Laporan_UTS_PBO_ITK_Print.pdf/.docx` → Laporan UTS
* `classdiagram-itkprint.jpg` → Class Diagram
* `usecase-itkprint.jpg` → Use Case Diagram
* `README.md` → Dokumentasi project

---

### 🔗 Repository

👉 https://github.com/April-08-04/UTS-Pemrograman-Berorientasi-Objek

---

### 👤 Author

* Nama: Fadilah
* NIM: 04221054
* Mata Kuliah: Pemrograman Berorientasi Objek
* Institusi: Institut Teknologi Kalimantan

---

