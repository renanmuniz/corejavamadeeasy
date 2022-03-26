public class PrimitiveAndString {
    public static void main(String[] args) {
        byte x = 100;

        String s = Byte.toString(x);
        byte b = Byte.parseByte(s);
    }
}
