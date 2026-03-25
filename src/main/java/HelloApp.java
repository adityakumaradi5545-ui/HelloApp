public class HelloApp {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};

        System.out.println("Displaying all names in the list:");
        System.out.println("---------------------------------");

        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }
}