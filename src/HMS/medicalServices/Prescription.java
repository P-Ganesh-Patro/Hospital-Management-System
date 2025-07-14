package HMS.medicalServices;

import HMS.patients.Patient;
import HMS.staff.Doctors;

import java.util.List;

public class Prescription {
    private String prescriptionId;
    private Doctors doctor;
    private Patient patient;
    private List<String> medicines;
//    private boolean isApprovedByPharmacy;

    public Prescription(String prescriptionId, Doctors doctor, Patient patient, List<String> medicines) {
        this.prescriptionId = prescriptionId;
        this.doctor = doctor;
        this.patient = patient;
        this.medicines = medicines;
//        this.isApprovedByPharmacy = false;
    }

//    public void approveByPharmacy() {
//        isApprovedByPharmacy = true;
//    }

    public void displayPrescription() {
        System.out.println("Prescription ID: " + prescriptionId);
        System.out.println("Doctor: " + doctor.getName() + ", Patient: " + patient.getName());
        System.out.println("Medicines:");
        for (String med : medicines) {
            System.out.println("- " + med);
        }
//        System.out.println("Approved by Pharmacy: " + isApprovedByPharmacy);
    }
}
