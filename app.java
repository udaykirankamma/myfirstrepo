// A simple Java class demonstrating basic concepts
public class Main {

    // 1. Class Variable (Field)
    private String developerName;

    // 2. Constructor to initialize the object
    public Main(String name) {
        this.developerName = name;
    }

    // 3. Instance Method
    public void greetAndCount(int maxCount) {
        System.out.println("Hello, World! Code written by: " + developerName);
        System.out.println("----------------------------------------");

        // 4. A standard 'for' loop
        for (int i = 1; i <= maxCount; i++) {
            // 5. Conditional logic
            if (i % 2 == 0) {
                System.out.println("Number " + i + " is Even");
            } else {
                System.out.println("Number " + i + " is Odd");
            }
        }
    }

    // 6. The main method (Entry point of every Java program)
    public static void main(String[] args) {
        // Creating an instance of the Main class
        Main program = new Main("Uday");

        // Calling the method to run the logic
        program.greetAndCount(5);
    }
}

