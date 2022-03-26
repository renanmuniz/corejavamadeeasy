public class AllInOne {
    public static void main(String[] args) {
        int x =100;
        String y = Integer.toString(x);

        Integer b = new Integer(y); //deprecated!
        Integer c = Integer.valueOf(y); //usar assim

        int z = b.intValue();

        String d = c.toString();
        int e = Integer.parseInt(d);
    }
}
