public class Calculate {
    public static void main(String[] args) {

    Fracs x = new Fracs(2, 3);
    Fracs y = new Fracs(6, 11);

    Fracs z = Fracs.add(x, y);
    Fracs w = x.mul(y);

    System.out.println(z.toString());
    System.out.println(w.toString());

    System.out.println(x.defaultMethod());
    }
}