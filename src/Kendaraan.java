public class Kendaraan {
    String merk;

    Kendaraan(String merk) {
        this.merk = merk;
    }

    void tampil() {
        System.out.println("Merk : " + this.merk);
    }

    void jalan() {
        System.out.println("kendaraan jalan...");
    }
}
