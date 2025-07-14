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
    private List<Doctors> doctorList;
    private List<Nurse> nurseList;
    private List<Technician> technicianList;
    private List<Administrator> adminList;
    private List<Patient> patientList;
    private List<Room> roomList;
    private List<Appointment> appointmentList;
    private List<Treatment> treatmentList;
    private List<Bill> billList;

    public Hospital() {
        doctorList = new ArrayList<>();
        nurseList = new ArrayList<>();
        technicianList = new ArrayList<>();
        adminList = new ArrayList<>();
        patientList = new ArrayList<>();
        roomList = new ArrayList<>();
        appointmentList = new ArrayList<>();
        treatmentList = new ArrayList<>();
        billList = new ArrayList<>();
    }

    public void addDoctor(Doctors doctor) {
        doctorList.add(doctor);
    }

    public void addNurse(Nurse nurse) {
        nurseList.add(nurse);
    }

    public void addTechnician(Technician tech) {
        technicianList.add(tech);
    }

    public void addAdministrator(Administrator admin) {
        adminList.add(admin);
    }

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void displayAvailableRooms() {
        System.out.println("----- Available Rooms -----");
        for (Room room : roomList) {
            if (room.isRoomAvailable()) {
                room.displayRoom();
            }
        }
    }

    public void scheduleAppointment(String appointmentId, Patient patient, String specialization, Date date, String time) {
        boolean isScheduled = false;

        for (Doctors doc : doctorList) {
            if (doc.getSpecialization().equalsIgnoreCase(specialization)) {
                Appointment appointment = new Appointment(appointmentId, patient, doc, date, time);
                appointmentList.add(appointment);
                System.out.println("Appointment scheduled successfully.");
                appointment.displayAppointment();
                isScheduled = true;
                break;
            }
        }

        if (!isScheduled) {
            System.out.println("No doctor found with specialization: " + specialization);
        }
    }

    public void admitPatient(Inpatient inpatient) {
        for (Room room : roomList) {
            if (room.isRoomAvailable()) {
                room.assignRoom();
                inpatient.setRoomNumber(room.getRoomNumber());
                addPatient(inpatient);
                System.out.println("Inpatient admitted to Room No: " + room.getRoomNumber());
                return;
            }
        }
        System.out.println("No available rooms to admit the patient.");
    }

    public void generateBill(String billId, Patient patient, double consultationFee, double testFee, double treatmentFee, double roomCharges, double insuranceCovered) {
        Bill bill = new Bill(billId, patient, consultationFee, testFee, treatmentFee, roomCharges, insuranceCovered);
        billList.add(bill);
        System.out.println("----- Patient Bill -----");
        bill.displayBill();
    }

    public void handleEmergency(EmergencyPatient emergencyPatient) {
        System.out.println("Emergency Case Detected:");
        addPatient(emergencyPatient);
        emergencyPatient.displayPatientsInfo();
    }
}
