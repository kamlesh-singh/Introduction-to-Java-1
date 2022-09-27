public class Q5 {
    private String firstname;
    private String lastname;
    private int age;
    private String designation;
    Q5() {
        this.firstname = "kamlesh";
        this.lastname = "singh";
        this.age = 25;
        this.designation = "Software Engineer";
    }
    Q5(String firstname, String lastname, int age, String designation) {
        this(lastname,age,designation);
        this.firstname = firstname;

    }
    Q5(String lastname, int age, String designation){
    this(age,designation);
    this.lastname =lastname;
    }

    Q5(int age, String designation){
       this(designation);
        this.age = age;

    }
    Q5(String designation){
        this.designation = designation;
    }


    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "First Name : " + firstname + " Last Name: " +
                lastname + " Age : " + age + " Designation : " + designation;
    }
    public static void main(String[] args) {
        Q5 obj1 = new Q5();
        Q5 obj2 = new Q5("kamlesh", "singh", 25, "Software Engineer");

        System.out.println("Initialized object using non-parameterised constructor");
        System.out.println(obj1);

        System.out.println("Initialized object using parameterised constructor");
        System.out.println(obj2);

    System.out.println("Updating instance variable of the object");
    obj2.setFirstName("kamlesh2");
    obj2.setLastName("Singh2");
    obj2.setAge(25);
    obj2.setDesignation("JVM SE");

    System.out.println("Printing Updated value");
    System.out.println(obj2);

}
}
