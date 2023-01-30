import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Jonathan Rodríguez", "Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Katia Rodríguez", "katirod@gmail.com");
        patient.setWeight(68.0);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("4661258556");
        System.out.println(patient.getPhoneNumber());

    }
}