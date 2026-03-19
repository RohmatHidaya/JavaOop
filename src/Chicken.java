public class Chicken extends animal {
    public void eat() {
        super.eat();
        System.out.println("I can eat dedak");

    }

    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        c1.eat();
    }
}