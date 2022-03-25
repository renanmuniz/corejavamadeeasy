public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    static {
        System.out.println("Bloco de código static. É executado antes do main.");
    }

    static {
        System.out.println("Outro bloco de código static. É executado antes do main.");
    }
}
