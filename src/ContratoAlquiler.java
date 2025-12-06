import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList; // Modificación Cèlia: Importamos ArrayList

public class ContratoAlquiler {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private float precioDia;
    private ArrayList<Vehiculo> vehiculos; // Modificación Cèlia: Cambió Vehiculo v a ArrayList<Vehiculo> vehiculos para guardar multiples vehiculos en un mismo contrato.
    private Cliente c;

    // Constructores
    public ContratoAlquiler(LocalDate fechaInicio, LocalDate fechaFin, float precioDia, ArrayList<Vehiculo> vehiculos, Cliente c) {
        // Modificación: Cambiar el constructor {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.vehiculos = vehiculos; // Modificación Cèlia: Inicializamos los Vehiculos la lista de vehículos
        this.c = c;
    }

    //Getters y Setters
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    //Modificación Cèlia: Getter para la lista de vehículos
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    //Modificación Cèlia: Setter para la lista de vehículos
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    // Métodos
    //Método nDias para calcular los dias que está alquilado el vehículo, aqui hago también la transformación de tipo String a LocalDateFormate
    public int nDias() {

        //creamos variable days-between para hacer el calculo de los días que hay entre fechaInicio y fechjaFin
        long dias = ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);

        //este método nos devuelve el resultado de la operación que hemos hecho, tipo int.
        // Convierta un valor long en int
        return (int) dias;
    }

    //método para calcular el coste total
    public float costeTotal(float total) {

        total = this.nDias() * this.precioDia;
        return total;
    }

    @Override
    public String toString() {
        return "\nFecha de Inicio: " + fechaInicio
                + "\nFecha Final: " + fechaFin
                + "\nNúmero de Dias: " + this.nDias()
                + "\nPrecio de un Dia: " + precioDia + " €"
                + "\nPrecio Total: " + this.costeTotal(precioDia) + " €"
                + "\n\n---------------------------\n";
    }
}


