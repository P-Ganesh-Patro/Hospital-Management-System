package HMS.medicalServices;

import HMS.patients.Patient;


import HMS.staff.Technician;

public class DiagnosticTest {
    private String testId;
    private String testName;
    private Patient patient;
    private Technician technician;
    private double cost;
    private boolean needsFasting;
    private String result;

    public DiagnosticTest(String testId, String testName, Patient patient, Technician technician, double cost) {
        this.testId = testId;
        this.testName = testName;
        this.patient = patient;
        this.technician = technician;
        this.cost = cost;
        this.needsFasting = true;
        this.result = "Pending";
    }

    public void updateResult(String result) {
        this.result = result;
    }

    public double getCost() {
        return cost;
    }

    public void displayTest() {
        System.out.println("Test: " + testName + " | Patient: " + patient.getName());
        System.out.println("Technician: " + technician.getName());
        System.out.println("Cost: " + cost + ", Needs Fasting: " + (needsFasting ? "Yes" : "No"));
        System.out.println("Result: " + result);
    }
}
