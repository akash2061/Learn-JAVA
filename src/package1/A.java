package package1;

import package2.*;

public class A {
    protected String protectedMessage_A = "Protected Message from A";

    public static void main(String[] args) {
        C c = new C();
        // System.out.println(c.defaultMessage); //! Not Visible
        System.out.println(c.publicMessage_C);

        // B b = new B();
        // System.out.println(b.privateMessage_B); //! Not Visible
    }
}
