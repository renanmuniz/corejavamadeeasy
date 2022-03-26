public class Constructors {
    public static void main(String[] args) {

        long l = 1000;
        Long a = new Long(l); //deprecated!

        String s = "2000";
        Long b = new Long(s); //deprecated!
        Long c = Long.valueOf(s); //Usar assim...


    }
}
