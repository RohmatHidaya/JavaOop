public class StaticMethod {
    public int a;
    public int b;

    public StaticMethod() {
    }

    public StaticMethod(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor called with a = " + a + " and b = " + b);
    }

    // non-static method
    int multiply(int a, int b) {
        return a * b;
    }

    // static method
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(StaticMethod.add(1, 1));
        System.out.println(new StaticMethod().multiply(1, 1));
    }
}
