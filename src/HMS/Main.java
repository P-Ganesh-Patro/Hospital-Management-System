package HMS;

import HMS.medicalServices.Room;
import HMS.patients.EmergencyPatient;
import HMS.patients.Inpatient;
import HMS.patients.Outpatient;
import HMS.staff.Doctors;
import HMS.staff.Nurse;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Hospital hospital = new Hospital();
            Doctors doctor1 = new Doctors("D101", "Dr. Ravi", "8763514881", "ravi@gmail.com", "9AM-2PM", "Heart", "10", 500.0);
            Doctors doctor2 = new Doctors("D102", "Dr. Manoj", "7735339752", "manoj@mail.com", "10AM-1PM", "dermatologist", "3", 300.0);
            Doctors doctor3 = new Doctors("D103", "Dr. akash", "9959252132", "akash@mail.com", "10AM-1PM", "pediatricians", "4", 400.0);
            Doctors doctor4 = new Doctors("D104", "Dr. Pravalika", "7735339752", "pvlk@mail.com", "10AM-1PM", "Cardiology", "6", 600.0);
            Doctors doctor5 = new Doctors("D105", "Dr. Maheswari", "9965143817", "mahe@mail.com", "10AM-1PM", "Rheumatologists", "7", 800.0);
            hospital.addDoctor(doctor1);
            hospital.addDoctor(doctor2);
            hospital.addDoctor(doctor3);
            hospital.addDoctor(doctor4);
            hospital.addDoctor(doctor5);

            Nurse nurse1 = new Nurse("N201", "Priya", "6301900547", "priya@gmail.com", "Evening", "Ward A", "Level 2");
            hospital.addNurse(nurse1);

            Room room1 = new Room(101, "General", 1000);
            Room room2 = new Room(102, "Private", 2000);
            Room room3 = new Room(104, "ICU", 5000);
            hospital.addRoom(room1);
            hospital.addRoom(room2);
            hospital.addRoom(room3);

            System.out.println("Please Enter the patientCode:- 1 - Outpatient, 2- Inpatient");
            int patientCode = in.nextInt();
            switch (patientCode) {
                case 1:
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date appointmentDate = sdf.parse("2025-07-13");
                    System.out.print("Enter Patient Name:- ");
                    String name = in.nextLine();
                    in.nextLine();
                    System.out.print("Enter Patient age:- ");
                    int age = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter Patient address:- ");
                    String address = in.nextLine();
                    System.out.print("Enter Mobile Number:- ");
                    String mobileNumber = in.nextLine();
                    Outpatient op = new Outpatient(1, name, age, address, mobileNumber, appointmentDate, "Dr. Ram suhas");
                    hospital.addPatient(op);
                    hospital.scheduleAppointment("A001", op, "heart", appointmentDate, "10:00 AM");
                    break;
                case 2:
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date dateOfAdminssion = dateFormat.parse("2025-01-02");
                    Date dateOfDischarge = new Date();
                    System.out.print("Enter the Patient Name:- ");
                    String patientName = in.nextLine();
                    in.nextLine();
                    System.out.print("Enter the Patient Age Name:- ");
                    int patientAge = in.nextInt();

                    System.out.print("Enter the address:- ");
                    String patientAddress = in.nextLine();
                    in.nextLine();
                    System.out.print("Enter the mobile Number:-");
                    String patientNumber = in.nextLine();


                    Inpatient inpatient = new Inpatient(189, patientName, patientAge, patientAddress, patientNumber, 87, dateOfAdminssion, dateOfDischarge, "daily BP test");
                    hospital.admitPatient(inpatient);

                    hospital.generateBill("B001", inpatient, 500.00, 1200.00, 3000.00, 6000.00, 1000.00);
                    break;
                default:
                    EmergencyPatient ep = new EmergencyPatient(398, "Ramu", 40, "vizianagaram", "9853462829", "10:03Am", "High");
                    hospital.handleEmergency(ep);

                    break;

            }
            hospital.showAvailableRooms();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
