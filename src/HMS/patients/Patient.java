package HMS.patients;

public class Patient {
    int patientId;
    String name;
    int age;
    String address;
    String contactNumber;

    public Patient(int patientId, String name, int age, String address, String contactNumber) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
    }


    public void displayPatientsInfo() {
        System.out.println("name:- " + name);
        System.out.println("age:- " + age);
        System.out.println("address " + address);
        System.out.println("address " + contactNumber);
    }

    public String getName() {
        return name;
    }
}
