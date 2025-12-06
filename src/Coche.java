

public class Coche extends Vehiculo {
    private int puertas;
    private int plazas;

    public Coche( String matricula, String marca, String modelo, int puertas, int plazas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
        this.plazas = plazas;
    }
    
    // Getters y Setters

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return super.toString() + " Coche{" + "puertas=" + puertas + ", plazas=" + plazas + '}';
    }

    
    

    
    
   
}
