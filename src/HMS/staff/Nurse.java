package HMS.staff;

public class Nurse extends Staff {
    String assignWard;
    String certificationLevel;
//    String shiftSchedule;


    public Nurse(String empId, String name, String phoneNumber, String email, String schedule, String assignWard, String certificationLevel) {
        super(empId, name, phoneNumber, email, schedule);
        this.assignWard = assignWard;
//        this.shiftSchedule=shiftSchedule;
        this.certificationLevel = certificationLevel;
    }

    @Override
    public void displayStaffInfo() {
        super.displayStaffInfo();
        System.out.println("assignWard :- " + assignWard);
        System.out.println("certificationLevel :- " + certificationLevel);
//        System.out.println("shiftSchedule :- "+ shiftSchedule);

    }
}
