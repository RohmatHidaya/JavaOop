public class mahasiswa extends orang {
    public String nim;

    mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
    }
}
