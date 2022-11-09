package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(10);
        fan1.setRadius(10);
        fan1.setColor("yello");
        fan1.setOn(true);
        fan1.result();
        System.out.println();
        fan2.setSpeed(5);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        fan2.result();
    }
}
