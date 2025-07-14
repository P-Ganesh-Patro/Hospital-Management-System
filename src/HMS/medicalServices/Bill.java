package HMS.medicalServices;

import HMS.patients.Patient;

public class Bill {
    private String billId;
    private Patient patient;
    private double consultationFee;
    private double testFee;
    private double treatmentFee;
    private double roomCharges;
    private double insuranceCoveredAmount;

    public Bill(String billId, Patient patient, double consultationFee, double testFee,
                double treatmentFee, double roomCharges, double insuranceCoveredAmount) {
        this.billId = billId;
        this.patient = patient;
        this.consultationFee = consultationFee;
        this.testFee = testFee;
        this.treatmentFee = treatmentFee;
        this.roomCharges = roomCharges;
        this.insuranceCoveredAmount = insuranceCoveredAmount;
    }

    public double calculateTotal() {
        double total = consultationFee + testFee + treatmentFee + roomCharges;
        return total - insuranceCoveredAmount;
    }

    public void displayBill() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Test Fee: " + testFee);
        System.out.println("Treatment Fee: " + treatmentFee);
        System.out.println("Room Charges: " + roomCharges);
        System.out.println("Insurance Covered: " + insuranceCoveredAmount);
        System.out.println("Total Bill: " + calculateTotal());
    }
}
