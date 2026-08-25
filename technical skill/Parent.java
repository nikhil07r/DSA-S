public class Parent {
    void show() {
        System.out.println("Parent Class");
    }

    public static void main(String[] args) {
        new Child1().display();
        new Child2().display();
    }
}

class Child1 extends Parent {
    void display() {
        super.show();
        System.out.println("Child 1");
    }
}

class Child2 extends Parent {
    void display() {
        super.show();
        System.out.println("Child 2");
    }
}
