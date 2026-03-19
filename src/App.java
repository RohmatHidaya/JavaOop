public class App {
    public static void main(String[] args) throws Exception {
        anjing a = new anjing();
        a.nama = "asw";
        System.out.println(a.nama);
        a.suara();

        kucing b = new kucing();
        b.nama = "pussy";
        System.out.println(b.nama);
        b.suara();

        System.out.println();

        mahasiswa m = new mahasiswa("Rohmat", "24311138");
        m.tampil();

        System.out.println();

        Motor motor = new Motor("mazda");
        motor.tampil();
        motor.jalan();

        System.out.println();

        Mobil mobil = new Mobil("Supra");
        mobil.tampil();
        mobil.jalan();
    }
}
