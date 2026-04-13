public class HelloApp {
    public static void main() {
        main(null);
    }

    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length > 0) {
            // Join all arguments with a space and prefix with "Hello, "
            String message = String.join(" ", args);
            System.out.println("Hello, " + message);
        } else {
            // Fallback to a default message
            System.out.println("Hello, World!");
        }
    }
}