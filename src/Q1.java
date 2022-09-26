public class Q1 {
    static String firstName;
    static String lastName;
    static int age;
    static{
        firstName ="kamlesh";
        lastName = "Singh";
        age = 24;
        System.out.println("Printing Details using static block");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
    public static void print_details(){
        System.out.println("Printing Details using static function");

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);

    }
    public static void main(String[] args) {
        Q1.print_details();
        System.out.println("Printing Details using static variable");

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
