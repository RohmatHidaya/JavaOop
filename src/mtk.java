public class mtk {
    static int tambah(int a, int b) {
        return a + b;
    }

    static double phi() {
        return 22 / 7.0;
    }

    static double luasLingkaran(double r) {
        return phi() * r * r;
    }

    static long faktorial(long n) {
        if (n != 0) {
            return n * faktorial(n - 1);
        } else {
            return 1;
        }
    }

    static int akarTiga(int a) {
        return a * a * a;
    }

    static int volumeKubus(int s) {
        return akarTiga(s);
    }

    public static void main(String[] args) {
        System.out.println("faktorial n = 3 : " + faktorial(3));
        System.out.println("akar tiga dari 2: " + akarTiga(2));
        System.out.println("volume Kubus s = 4 : " + volumeKubus(4));
    }
}
