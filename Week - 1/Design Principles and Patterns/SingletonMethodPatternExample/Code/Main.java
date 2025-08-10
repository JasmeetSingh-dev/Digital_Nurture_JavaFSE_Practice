public class Main {
    public static void main(String[] args) {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();

        System.out.println("Instance 1 hashcode: " + instance1.hashCode());
        System.out.println("Instance 2 hashcode: " + instance2.hashCode());
    }
}
