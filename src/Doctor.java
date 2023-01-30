public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String email;
    String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        // Paso de parámetros
        this.name = name;
        this.speciality = speciality;
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

}