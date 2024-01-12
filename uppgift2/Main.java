

public class Main {
    public static void main(String[] args) {
        

        Employee testEmployee = new Employee("John Doe", "BigComputing", new Role("Engineer"));

        testEmployee.addRole(new Role("Manager"));


        System.out.println(testEmployee);
    }
}
