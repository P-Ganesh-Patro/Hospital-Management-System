package HMS.medicalServices;

import HMS.patients.Patient;
import HMS.staff.Doctors;

import java.util.Date;

public class Appointment {
    String appointmentId;
    private Patient patient;
    Doctors doctors;
    Date date;
    String time;
    String status;

    public Appointment(String appointmentId, Patient patient, Doctors doctors, Date date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctors = doctors;
        this.date = date;
        this.time = time;
        this.status = "Scheduled...";
    }

//    public void completeAppointment() {
//        this.status = "Completed...";
//    }

    public void cancelAppointment() {
        this.status = "Cancelled...";
    }

    public void displayAppointment() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctors.getName());
        System.out.println("Date: " + date + ", Time: " + time);
        System.out.println("Status: " + status);
    }
}
