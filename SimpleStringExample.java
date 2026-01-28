public class SimpleStringExample {
    public static void main(String[] args) {

        // Creating strings
        String name = "Java";
        String message = "Hello, World";

        // Printing strings
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);

        // String length
        System.out.println("Length of name: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase name: " + name.toUpperCase());

        // Concatenation
        String result = message + " Welcome to " + name;
        System.out.println(result);

        // Comparing strings
        String lang = "Java";
        System.out.println("Is name equal to lang? " + name.equals(lang));
    }
}
