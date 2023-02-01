package ui;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static void showMenu() {
        System.out.println("Welcome to my Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;

        do {
            System.out.println("1. model.Doctor\n" +
                    "2. model.Patient\n" +
                    "0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response) {
                case 1:
                    System.out.println("model.Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
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
