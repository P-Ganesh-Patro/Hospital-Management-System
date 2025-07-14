package HMS;

import HMS.medicalServices.Room;
import HMS.patients.EmergencyPatient;
import HMS.patients.Inpatient;
import HMS.patients.Outpatient;
import HMS.staff.Doctors;
import HMS.staff.Nurse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Hospital hospital = new Hospital();

            // doctors
            hospital.addDoctor(new Doctors("D101", "Dr. Ravi", "8763514881", "ravi@gmail.com", "9AM-2PM", "Heart", "10", 500.0));
            hospital.addDoctor(new Doctors("D102", "Dr. Manoj", "7735339752", "manoj@mail.com", "10AM-1PM", "Dermatologist", "3", 300.0));
            hospital.addDoctor(new Doctors("D103", "Dr. Akash", "9959252132", "akash@mail.com", "10AM-1PM", "Pediatrician", "4", 400.0));
            hospital.addDoctor(new Doctors("D104", "Dr. Pravalika", "7735339752", "pvlk@mail.com", "10AM-1PM", "Cardiology", "6", 600.0));
            hospital.addDoctor(new Doctors("D105", "Dr. Maheswari", "9965143817", "mahe@mail.com", "10AM-1PM", "Rheumatologist", "7", 800.0));

            // nurses
            Nurse nurse = new Nurse("N201", "Priya", "6301900547", "priya@gmail.com", "Evening", "Ward A", "Level 2");
            hospital.addNurse(nurse);

            // rooms
            hospital.addRoom(new Room(101, "General", 1000));
            hospital.addRoom(new Room(102, "Private", 2000));
            hospital.addRoom(new Room(104, "ICU", 5000));

            //  patient type
            System.out.println("Enter patient type (1 = Outpatient, 2 = Inpatient, other = Emergency): ");
            int patientType = input.nextInt();
            input.nextLine();

            switch (patientType) {
                // Outpatient
                case 1 -> {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date appointmentDate = sdf.parse("2025-07-13");

                    System.out.print("Enter Patient Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Patient Age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Patient Address: ");
                    String address = input.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    String phone = input.nextLine();

                    Outpatient outpatient = new Outpatient(1, name, age, address, phone, appointmentDate, "Dr. Ram Suhas");
                    hospital.addPatient(outpatient);
                    hospital.scheduleAppointment("A001", outpatient, "Dermatologist", appointmentDate, "10:00 AM");
                }
// Inpatient
                case 2 -> {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date admissionDate = sdf.parse("2025-01-02");
                    Date dischargeDate = new Date();

                    System.out.print("Enter Patient Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Patient Age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Address: ");
                    String address = input.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    String phone = input.nextLine();

                    Inpatient inpatient = new Inpatient(189, name, age, address, phone, 87,
                            admissionDate, dischargeDate, "Daily BP test");

                    hospital.admitPatient(inpatient);
                    hospital.generateBill("B001", inpatient, 500.00, 1200.00, 3000.00, 6000.00, 1000.00);
                }

                default -> {
                    System.out.print("Name: ");
                    String emergencyName = input.nextLine();

                    System.out.print("Age: ");
                    int emergencyAge = input.nextInt();
                    input.nextLine();

                    System.out.print("Address: ");
                    String emergencyAddress = input.nextLine();

                    System.out.print("Contact Number: ");
                    String emergencyPhone = input.nextLine();

                    EmergencyPatient emergency = new EmergencyPatient(398, emergencyName, emergencyAge, emergencyAddress, emergencyPhone, "10:03 AM", "High");
                    hospital.handleEmergency(emergency);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
