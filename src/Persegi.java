public class Persegi extends BangunDatar {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Persegi persegi = new Persegi(10);
        System.out.println(persegi.luas());
    }
}
