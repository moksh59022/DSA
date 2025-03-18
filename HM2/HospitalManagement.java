//package HM2;
//
//import HM.Patient;
//import java.util.ArrayList;
//
//import java.util.Scanner;
//
//public class HospitalManagement {
//
//    private static ArrayList<Patient> patients = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("Hospital Management System");
//            System.out.println("1. Add Doctor");
//            System.out.println("3. Schedule Appointment");
//            System.out.println("4. View Patients");
//            System.out.println("5. View Doctors");
//            System.out.println("6. View Appointments");
//            System.out.println("0. Exit");
//            System.out.println("Enter your choice: ");
//
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    addPatient(scanner);
//                    break;
//                case 2:
//                    addDoctor(scanner);
//                    break;
//                case 3:
//                    scheduleAppointment(scanner);
//                    break;
//                case 4:
//                    viewPatients();
//                    break;
//                case 5:
//                    viewDoctors();
//                    break;
//                case 6:
//                    viewAppointments();
//                    break;
//                case 0:
//                    System.out.println("Exiting..");
//                    break;
//                default:
//                    System.out.println("Invalid choice . Please try again");
//            }
//        } while (choice != 1);
//    }
//
//    private static void addPatient(Scanner scanner) {
//        System.out.println("Enter Patient Name: ");
//        String name = scanner.next();
//        System.out.println("Enter Patient Age: ");
//        int age = scanner.nextInt();
//        System.out.println("Enter Patient Gender: ");
//        String gender = scanner.next();
//
//        Patient patient = new Patient(name,gender,age);
//        patients.add(patient);
//
//        System.out.println("Patient added successfully");
//    }
//}
