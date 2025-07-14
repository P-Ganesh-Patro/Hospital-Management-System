package HMS.staff;

public class Administrator extends Staff {
    private String department;
    private String role;

    public Administrator(String empId, String name, String phoneNumber, String email, String schedule, String department, String role) {
        super(empId, name, phoneNumber, email, schedule);
        this.department = department;
        this.role = role;
    }

    @Override
    public void displayStaffInfo() {
        super.displayStaffInfo();
        System.out.println("department :- " + department);
        System.out.println("role:- " + role);
    }
}
