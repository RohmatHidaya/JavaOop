public class Mobil extends Kendaraan {

    Mobil(String merk) {
        super(merk);
    }

    @Override
    void jalan() {
        System.out.println("brem brem");
    }
}
