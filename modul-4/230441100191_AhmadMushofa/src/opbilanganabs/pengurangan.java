package opbilanganabs;

public class pengurangan extends OPBilanganAbs implements Operasi {
    public pengurangan() {
        this.a = 9.25;
        this.b = 1.25;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        return a - b;
    }

    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C(double c) {
        this.c = c;
    }

    @Override
    public void tampilHasil() {
        System.out.println("=====");
        System.out.println("Operasi Pengurangan");
        System.out.println("bilangan A = " + get_A());
        System.out.println("bilangan B = " + get_B());
        System.out.println("Hasil Pengurangan A-B = " + get_C());
        System.out.println("=====");
    }
}