package HMS.staff;

public class Staff {
    String empId;
    String name;
    String phoneNumber;
    String email;
    String schedule;

    public Staff(String empId, String name, String phoneNumber, String email, String schedule) {
        this.empId = empId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.schedule = schedule;
    }

    public void displayStaffInfo() {
        System.out.println("ID:- " + empId);
        System.out.println("name:- " + name);
        System.out.println("phoneNumber:- " + phoneNumber);
        System.out.println("email:- " + email);
        System.out.println("schedule:- " + schedule);
    }

}
