public class Fracs implements Calc<Fracs> {
    private int l;
    private int m;

    public Fracs() {
        l = 0;
        m = 1;
    }

    public Fracs(int a, int b) {
        l = a;
        m = b;
    }

    public Fracs add(Fracs a) {
        this.l = this.l*a.m + this.m*a.l;
        this.m = this.m*a.m;

        return this;
    }

    public Fracs sub(Fracs a) {
        this.l = this.l*a.m - this.m*a.l;
        this.m = this.m*a.m;

        return this;
    }

    public Fracs mul(Fracs a) {
        this.l *= a.l;
        this.m *= a.m;

        return this;
    }

    public Fracs div(Fracs a) {
        this.l *= a.m;
        this.m *= a.l;

        return this;
    }

    public String toString() {
        return this.l + "/" + this.m;
    }

    public static Fracs add(Fracs a, Fracs b) {
        return new Fracs(a.l*b.m + b.l*a.m, a.m*b.m);
    }


    public static Fracs sub(Fracs a, Fracs b) {
        return new Fracs(a.l*b.m - b.l*a.m, a.m*b.m);
    }


    public static Fracs mul(Fracs a, Fracs b) {
        return new Fracs(a.l * b.l, a.m * b.m);
    }


    public static Fracs div(Fracs a, Fracs b) {
        return new Fracs(a.l * b.m, a.m * b.l);
    }


}