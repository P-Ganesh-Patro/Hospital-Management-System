package HMS;

import HMS.medicalServices.Appointment;
import HMS.medicalServices.Bill;
import HMS.medicalServices.Room;
import HMS.medicalServices.Treatment;
import HMS.patients.EmergencyPatient;
import HMS.patients.Inpatient;
import HMS.patients.Patient;
import HMS.staff.Administrator;
import HMS.staff.Doctors;
import HMS.staff.Nurse;
import HMS.staff.Technician;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospital {
    private List<Doctors> doctors;
    private List<Nurse> nurses;
    private List<Technician> technicians;
    private List<Administrator> administrators;
    private List<Patient> patients;
    private List<Room> rooms;
    private List<Appointment> appointments;
    private List<Treatment> treatments;
    private List<Bill> bills;


    public Hospital() {
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
        technicians = new ArrayList<>();
        administrators = new ArrayList<>();
        patients = new ArrayList<>();
        rooms = new ArrayList<>();
        appointments = new ArrayList<>();
        treatments = new ArrayList<>();
        bills = new ArrayList<>();
    }

    public void addDoctor(Doctors doctor) {
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    public void addTechnician(Technician tech) {
        technicians.add(tech);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void showAvailableRooms() {
//        System.out.println("Available Rooms");
        for (Room room : rooms) {
            if (room.isRoomAvailable()) {
                room.displayRoom();
            }
        }
    }

    public void scheduleAppointment(String appointmentId, Patient patient, String specialization, Date date, String time) {
        for (Doctors doc : doctors) {
            System.out.println(doc.getSpecialization() + " heart");
            if (doc.getSpecialization().equalsIgnoreCase(specialization)) {
                System.out.println(doc.getName());
                System.out.println(doc.getSpecialization() + " specl");
                Appointment appointment = new Appointment(appointmentId, patient, doc, date, time);
                appointments.add(appointment);
                System.out.println("Appointment scheduled successfully...");
                appointment.displayAppointment();
                break;
            } else {
                System.out.println("No doctor found with specialization: " + specialization);
                break;
            }
        }

    }

    public void admitPatient(Inpatient inpatient) {
        for (Room room : rooms) {
            if (room.isRoomAvailable()) {
                room.assignRoom();
                inpatient.setRoomNumber(room.getRoomNumber());
                addPatient(inpatient);
                System.out.println("Inpatient admitted to room: " + room.getRoomNumber());
            }
        }
//        System.out.println("No rooms available for admission.");
    }

    public void generateBill(String billId, Patient patient, double consultationFee, double testFee, double treatmentFee, double roomCharges, double insuranceCovered) {
        Bill bill = new Bill(billId, patient, consultationFee, testFee, treatmentFee, roomCharges, insuranceCovered);
        bills.add(bill);
        System.out.println(" -----------------------Bill:--------------------- ");
        bill.displayBill();
    }

    public void handleEmergency(EmergencyPatient patient) {
        System.out.println("Emergency patients...");
        addPatient(patient);

        patient.displayPatientsInfo();
    }


}
