package animal;

public class Cat extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Mouse");
    }

    public void run() {
        System.out.println("Cat is running");
    }
}
