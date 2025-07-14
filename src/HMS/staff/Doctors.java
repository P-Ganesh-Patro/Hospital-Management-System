package HMS.staff;

public class Doctors extends Staff {
    String specialization;
    String yearsOfExperience;
    double consultantFee;


    public Doctors(String empId, String name, String phoneNumber, String email, String schedule, String specialization, String yearsOfExperience, double consultantFee) {
        super(empId, name, phoneNumber, email, schedule);
        this.specialization = specialization;
        this.consultantFee = consultantFee;
        this.yearsOfExperience = yearsOfExperience;
        System.out.println(specialization + "     ---");
    }

    @Override
    public void displayStaffInfo() {
        super.displayStaffInfo();
        System.out.println("specialization :- " + specialization);
        System.out.println("years of experience " + yearsOfExperience);
        System.out.println("consultantFee " + consultantFee);
    }

    public String getName() {
        return super.name;
    }

    public String getSpecialization() {
        return specialization;
    }
//    public void setSpecialization(String specialization){
//        this.specialization = specialization;
//    }

}
