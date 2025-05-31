package oop.k.uts;  // Sesuaikan paket dengan Buku.java

import java.util.Scanner;

public class OOPKUTS {

    static final int MAX_BUKU = 100; // Kapasitas array
    static Buku[] daftarBuku = new Buku[MAX_BUKU]; // Array untuk menyimpan data buku
    static int jumlahBuku = 0; // Menyimpan jumlah buku yang terdaftar
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Menu Aplikasi Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline setelah nextInt

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tampilkanBuku();
                    break;
                case 3:
                    ubahBuku();
                    break;
                case 4:
                    hapusBuku();
                    break;
                case 5:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    // Fungsi untuk menambah buku
    static void tambahBuku() {
        if (jumlahBuku >= MAX_BUKU) {
            System.out.println("Kapasitas penuh.");
            return;
        }

        System.out.print("Judul: ");
        String judul = input.nextLine();
        System.out.print("Penulis: ");
        String penulis = input.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahun = input.nextInt();
        input.nextLine(); // Membersihkan newline

        daftarBuku[jumlahBuku++] = new Buku(judul, penulis, tahun);
        System.out.println("Buku berhasil ditambahkan.");
    }

    // Fungsi untuk menampilkan daftar buku
    static void tampilkanBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada data buku.");
            return;
        }

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i]);
        }
    }

    // Fungsi untuk mengubah data buku
    static void ubahBuku() {
        tampilkanBuku();
        System.out.print("Masukkan nomor buku yang akan diubah: ");
        int index = input.nextInt() - 1;
        input.nextLine(); // Membersihkan newline

        if (index < 0 || index >= jumlahBuku) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        System.out.print("Judul baru: ");
        String judul = input.nextLine();
        System.out.print("Penulis baru: ");
        String penulis = input.nextLine();
        System.out.print("Tahun baru: ");
        int tahun = input.nextInt();
        input.nextLine(); // Membersihkan newline

        daftarBuku[index].setJudul(judul);
        daftarBuku[index].setPenulis(penulis);
        daftarBuku[index].setTahun(tahun);

        System.out.println("Data buku berhasil diubah.");
    }

    // Fungsi untuk menghapus data buku
    static void hapusBuku() {
        tampilkanBuku();
        System.out.print("Masukkan nomor buku yang akan dihapus: ");
        int index = input.nextInt() - 1;
        input.nextLine(); // Membersihkan newline

        if (index < 0 || index >= jumlahBuku) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        // Menggeser buku setelah yang dihapus
        for (int i = index; i < jumlahBuku - 1; i++) {
            daftarBuku[i] = daftarBuku[i + 1];
        }
        daftarBuku[--jumlahBuku] = null;

        System.out.println("Buku berhasil dihapus.");
    }
}
