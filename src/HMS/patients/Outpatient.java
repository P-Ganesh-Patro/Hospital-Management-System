package HMS.patients;

import java.util.Date;

public class Outpatient extends Patient {
    private Date appointmentDate;
    private String doctorName;

    public Outpatient(int patientId, String name, int age, String address, String contactNumber, Date appointmentDate, String doctorName) {
        super(patientId, name, age, address, contactNumber);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    @Override
    public void displayPatientsInfo() {
        super.displayPatientsInfo();
        System.out.println("appointmentDate:- " + appointmentDate);
        System.out.println("doctorName:- " + doctorName);
    }
}
