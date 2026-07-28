public class Test {

    class Animal {
        String species = "Generic Animal";
    }

    class Dog extends Animal {
        String species = "Dog";

        void display() {
            System.out.println("Child Species" + species);
            System.out.println("Parent Species: " + super.species);
        }

    }

    public static void main(String[] args) {
        Test test = new Test();
        Dog mydog = test.new Dog();
        mydog.display();
    }

}
