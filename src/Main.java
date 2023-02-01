import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Jonathan Rodríguez", "jonicato@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");
        System.out.println(myDoctor);

        User user = new Doctor("Azareth Gallegos", "aby1009@gmail.com");
        user.showDataUser();

        User userPatient = new Patient("Azareth Sifuentes", "aby1009@gmail.com");
        userPatient.showDataUser();

        // Clase anónima
        User user1 = new User("Jonathan Rodríguez de Sifuentes", "jonicato@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n" +
                        "Hospital: Cruz Verde\n" +
                        "Departamento: Geriatría");
            }
        };

        user.showDataUser();


        // Interfaces anónimas
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                System.out.println("Holi");
            }
        };

        ISchedulable iSchedulable1 = new AppointmentDoctor();
        // iSchedulable1.schedule();

        /* for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        } */

        Patient patient = new Patient("Katia Rodríguez", "katirod@gmail.com");
        // System.out.println(patient);

    }
}