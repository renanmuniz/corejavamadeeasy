public class ThisKeyWordDemo {

    int x;

    public ThisKeyWordDemo() {
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ThisKeyWordDemo obj = new ThisKeyWordDemo();
        ThisKeyWordDemo obj2 = new ThisKeyWordDemo();
    }
}
