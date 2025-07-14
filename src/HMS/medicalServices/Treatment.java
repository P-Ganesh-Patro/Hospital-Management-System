package HMS.medicalServices;

import HMS.patients.Patient;
import HMS.staff.Doctors;

public class Treatment {
    String treatmentId;
    Patient patient;
    Doctors doctors;
    String description;
    double cost;
    boolean isCompleted;

    public Treatment(String treatmentId, Patient patient, Doctors doctors, String description, double cost, boolean isCompleted) {
        this.treatmentId = treatmentId;
        this.patient = patient;
        this.doctors = doctors;
        this.description = description;
        this.cost = cost;
        this.isCompleted = false;
    }

    public void completedTreatment() {
        this.isCompleted = true;
    }

    public double getCost() {
        return cost;
    }

    public void displayTreatment() {
        System.out.println("Treatment ID: " + treatmentId);
        System.out.println("Patient: " + patient.getName() + ", Doctor: " + doctors.getName());
        System.out.println("Description: " + description);
        System.out.println("Cost: ₹" + cost);
        System.out.println("Completed: " + isCompleted);
    }
}
