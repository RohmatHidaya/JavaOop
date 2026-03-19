public class dog extends animal {
    @Override
    public void eat() {
        System.out.println("I Can eat Dog Food");
    };

    public void display() {
        System.out.println("my name is " + name);
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.name = "Rohmat";
        d.display();
        d.eat();
    }
}
