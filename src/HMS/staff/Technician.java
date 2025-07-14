package HMS.staff;

public class Technician extends Staff {
    private String equipmentHandle;
    private String skillSet;

    public Technician(String empId, String name, String phoneNumber, String email, String schedule, String equipmentHandle, String skillSet) {
        super(empId, name, phoneNumber, email, schedule);
        this.equipmentHandle = equipmentHandle;
        this.skillSet = skillSet;

    }

    public String getName() {
        return super.name;
    }

    @Override
    public void displayStaffInfo() {
        super.displayStaffInfo();
        System.out.println("equipment Handle:- " + equipmentHandle);
        System.out.println("skill set:- " + skillSet);
    }
}
