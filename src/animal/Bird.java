package animal;

public class Bird extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("spider");
    }

    public void run() {
        System.out.println("Bird is running");
    }
}
