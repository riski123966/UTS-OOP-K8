package oop.k.uts;  // Menyesuaikan dengan paket yang sesuai

// Kelas Buku untuk menyimpan data buku
public class Buku {
    private String judul;
    private String penulis;
    private int tahun;

    // Constructor untuk kelas Buku
    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    // Getter dan Setter untuk judul buku
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter untuk penulis buku
    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Getter dan Setter untuk tahun terbit buku
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Menampilkan data buku dalam format string
    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Tahun: " + tahun;
    }
}
