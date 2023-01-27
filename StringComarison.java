public class StringComarison {

    public static void main(String[] args) {
        String a = "Sai";

        String b = "Sai";


        System.out.println(a.equals(b));
        System.out.println(a==b);

        String p = new String("Sai");
        String q = p;
//        String q = new String("Sai");

        System.out.println(p==q);
        System.out.println("Nodu2" + p.equals(q));

        System.out.println(p==a);
        System.out.println(p.equals(a));
    }
}
