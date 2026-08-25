public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.printVal();
    }
}

class A {
    int val = 10;
}

class B extends A {
    int val = 20;
}

class C extends B {
    int val = 30;

    void printVal() {
        if (val == super.val + ((A) this).val) {
            System.out.println(" TRUE: Values match!");
        } else {
            System.out.println(" WARNING: Values do not match!");
        }
    }
}