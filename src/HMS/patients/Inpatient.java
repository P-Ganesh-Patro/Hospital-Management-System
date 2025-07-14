package HMS.patients;

import java.util.Date;

public class Inpatient extends Patient {

    private int roomNumber;
    private Date admissionDate;
    private Date dischargeDate;
    private String dailyCarePlan;


    public Inpatient(int patientId, String name, int age, String address, String contactNumber, int roomNumber, Date admissionDate, Date dischargeDate, String dailyCarePlan) {
        super(patientId, name, age, address, contactNumber);
        this.roomNumber = roomNumber;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.dailyCarePlan = dailyCarePlan;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayPatientsInfo() {
        super.displayPatientsInfo();
        System.out.println("roomNumber:- " + roomNumber);
        System.out.println("admissionDate:- " + admissionDate);
        System.out.println("dischargeDate:- " + dischargeDate);
        System.out.println("dailyCarePlan:- " + dailyCarePlan);


    }
}
