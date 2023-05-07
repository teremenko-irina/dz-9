/*public class Main {
    public static void main(String[] args) {
        // Create a man and a woman
        Man john = new Man("John", "Doe", 60);
        Woman jane = new Woman("Jane", "Smith", 55);

        // Check if they are retired
        System.out.println(john.isRetired());
        System.out.println(jane.isRetired());

        // Register their partnership
        john.registerPartnership(jane);
        jane.registerPartnership(john);

        // Test the partnership
        if (john.getPartner() != null) {
            System.out.println(john.getPartner().getFirstName()); // Output: Jane
        }
        if (jane.getPartner() != null) {
            System.out.println(jane.getPartner().getFirstName()); // Output: John
        }

        // Deregister their partnership
        jane.deregisterPartnership(true);


        // Test the deregistration
        System.out.println(john.getPartner()); // Output: null
        System.out.println(jane.getPartner()); // Output: null
        System.out.println(jane.getLastName()); // Output: Smith
    }
}*/
public class Main {
    public static void main(String[] args) {
        // create a man and a woman
        Man bob = new Man("Bob", "Smith", 65);
        Woman jill = new Woman("Jill", "Taylor", 59);

        // print partnership information
        System.out.println(bob.getFirstName() + " " + bob.getLastName() + " and " + jill.getFirstName() + " " + jill.getLastName() + " meet each other");

        // is retired
        System.out.println(bob.getFirstName() + " is retired = " + bob.isRetired() );
        System.out.println(jill.getFirstName() + " is retired = " + jill.isRetired() );

        // register partnership between man and woman
        bob.registerPartnership(jill);

        // print partnership information
        System.out.println(bob.getFirstName() + " " + bob.getLastName() + " and " + jill.getFirstName() + " " + jill.getLastName() + " are partners");

        // deregister partnership between man and woman
        bob.deregisterPartnership(true);

        // print partnership information
        System.out.println(bob.getFirstName() + " " + bob.getLastName() + " and " + jill.getFirstName() + " " + jill.getLastName() + " are not a partners");

    }
}
