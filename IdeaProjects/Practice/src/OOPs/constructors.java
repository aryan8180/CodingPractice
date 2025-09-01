package OOPs;

public class constructors {
    public static void main(String[] args) {
        Complex one = new Complex(3,6);
        one.print();
    }
}

class Complex {
    int a,b;

    public Complex(int real, int imaginary) { // Constructor
        a = real;
        b = imaginary;
    }

    void print() {
        System.out.println(a+" + "+ b+"i");
    }

}
