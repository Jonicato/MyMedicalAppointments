package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to my Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;

        do {
            System.out.println("1. Doctor\n" +
                    "2. Patient\n" +
                    "0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    //showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {
        // userType == 1 Doctor
        // userType == 2 Paciente

        Scanner sc = new Scanner(System.in);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Mata", "alexmata@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "anakaren@gmail.com"));
        doctors.add(new Doctor("Aby Gallegos", "abygallegos@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Jonicato Rodríguez", "jonicato@gmail.com"));
        patients.add(new Patient("Katy Rodríguez", "katy@gmail.com"));
        patients.add(new Patient("Miguel García", "elmigue@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor doctor: doctors) {
                    if (doctor.getEmail().equals(email)) {
                        emailCorrect = true;

                        // Obtener los datos del usuario loggeado
                        doctorLogged = doctor;
                        UIDoctorMenu.showDoctorMenu();

                    }
                }
            } else if (userType == 2) {
                for (Patient patient: patients) {
                    if (patient.getEmail().equals(email)) {
                        emailCorrect = true;

                        // Obtener los datos del usuario loggeado
                        patientLogged = patient;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }

            if (!emailCorrect) {
                System.out.println("El email es incorrecto. Favor de intentar nuevamente.");
            }
        } while(!emailCorrect);
    }

    static void showPatientMenu() {
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("model.Patient\n" +
                    "1. Book an appointment\n" +
                    "2. My appointments\n" +
                    "0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My Appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
