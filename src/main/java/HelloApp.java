public class HelloApp {
    public static void main(String[] args) {

        // 1. Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No arguments provided");
            return;
        }

        String result = "";

        // 2. Join arguments with comma and space
        for (int i = 0; i < args.length; i++) {
            result += args[i] + ", ";
        }

        // 3. Remove trailing comma AND space (last 2 characters)
        // Check spelling: l-e-n-g-t-h
        result = result.substring(0, result.length() - 2);

        System.out.println("Hello, " + result + "!");
    }
}