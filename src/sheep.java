public class sheep extends animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("I can eat grass :)");
    }

    @Override
    public void IWantEat(String args) {
        System.out.println("i cant eat " + args);
    }

    public static void main(String[] args) {
        sheep s = new sheep();
        s.eat();
        s.IWantEat("suket");
    }
}
