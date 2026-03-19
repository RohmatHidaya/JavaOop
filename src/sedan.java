public class sedan extends vehicle {
    @Override
    public void gas() {
        System.out.println("sedan sedang jalan");
    }

    public static void main(String[] args) {
        sedan s = new sedan();
        s.ban = 4;
        s.warna = "red";

        s.gas();
        System.out.println("ban : " + s.ban + "warna : " + s.warna);

    }
}
