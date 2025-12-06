
import java.util.ArrayList;

public class Flota {
    private String nombreFlota;
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Flota (String nombreZona){
        this.nombreFlota = nombreFlota;
    }
    public static void addVehiculoFlota(Vehiculo vehiculo) {
        vehiculos.add(vehiculo); //Utilizamos .add, que está dentro de la biblioteca de ArrayList para añadir elementos a una clase determinada.
        System.out.println("Vehículo agregado a la flota: " + vehiculo.getMatricula()); //Utilizamos la matrícula como elemento único para agregar a la Flota.
    }
    public static void mostrarVehiculosFlota() {
        if (vehiculos.isEmpty()) { //isEmpty es para los Strings y nos ayuda a comprobar si la flota está vacía o no.
            System.out.println("Flota vacía.");
        } else {
            System.out.println("Vehículos en la flota:");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
        }
    }
    public static void quitarVehiculosFlota(String matricula) {
        boolean quitar = vehiculos.removeIf(vehiculo -> vehiculo.getMatricula().equals(matricula));
            if (quitar){
                System.out.println("Vehiculo Eliminado");
            } else {
                System.out.println("No se ha encontrado el vehiculo");
        }
    }
    public String getNombreFlota(){
        return nombreFlota;
    }
}

//.REMOVE para cuando no usemos bucles for-each!
//vehiculos.remove(vehiculo);
// Utilizamos .remove, que está dentro de la biblioteca de ArrayList para eliminar elementos a una clase determinada.
