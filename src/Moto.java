
public class Moto extends Vehiculo {

    private int cc;

    public Moto(String matricula, String marca, String modelo, int cc) {
        super(matricula, marca, modelo);
        this.cc = cc;
    }

    // Getters y Setters
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{" + "cc=" + cc + '}';
    }

}


