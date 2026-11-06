class Employee {
    int empno;
    String name;
    float sal;


    Employee() {
        System.out.println("*****");
        empno = 101;
        name = "Aashish";
        sal = 5000f;
    }

    void DisplayDetails() {
        System.out.println(empno + "|" + name + "|" + sal);
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.DisplayDetails();
        emp2.DisplayDetails();
        emp3.DisplayDetails();
    }
}