
import java.time.LocalDate; //_ Cambios Cèlia
import java.util.ArrayList;

public class VehiculosRent {
    public ArrayList<Cliente> Clientes; //Creación de listas para cada relación.
    public ArrayList<Agencia> Agencias;
    public ArrayList<Flota> Flotas;

    public VehiculosRent() {
        this.Clientes = new ArrayList<>();
        this.Agencias = new ArrayList<>();
        this.Flotas = new ArrayList<>();
    }

    public void mostrarClientes() {
        for (Cliente cliente : Clientes) {
            System.out.println("Clientes:" + cliente.getNombre()); //Impresión de los datos que tenemos.
        }
    }

    public void mostrarAgencias() {
        for (Agencia agencia : Agencias) {
            System.out.println("Agencias:" + agencia.getNombreAgencia());
        }
    }

    public void mostrarFlota() {
        for (Flota flota : Flotas) {
            System.out.println("Flotas:" + flota.getNombreFlota());
        }
    }
}