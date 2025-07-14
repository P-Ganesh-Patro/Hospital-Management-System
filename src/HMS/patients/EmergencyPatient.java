package HMS.patients;

public class EmergencyPatient extends Patient {
    private String arrivalTime;
    private String criticalLevel;

    public EmergencyPatient(int patientId, String name, int age, String address, String contactNumber, String arrivalTime, String criticalLevel) {
        super(patientId, name, age, address, contactNumber);
        this.arrivalTime = arrivalTime;
        this.criticalLevel = criticalLevel;
    }


    @Override
    public void displayPatientsInfo() {
        super.displayPatientsInfo();
        System.out.println("arrivalTime :- " + arrivalTime);
        System.out.println("criticalLevel :- " + criticalLevel);

    }
}
