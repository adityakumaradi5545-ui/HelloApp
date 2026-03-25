public class HelloApp {
    public static void main(String[] args) {

        // Check if the array is empty to show a default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use an Enhanced For Loop (For-each) to handle multiple arguments
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }

    }
}