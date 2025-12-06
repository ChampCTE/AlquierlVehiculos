
public class Camion extends Vehiculo {

    private int kg;

    public Camion(String matricula, String marca, String modelo, int kg) {
        super(matricula, marca, modelo);
        this.kg = kg;
    }

    // Getters y Setters
    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return super.toString() + " Camion{" + "kg=" + kg + '}';
    }



}
