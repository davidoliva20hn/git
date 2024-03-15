/*
 */
public class Estudiante {

    private String numeroCuenta;
    private String codigoClase;
    private int year;
    private int numSec;

    public Estudiante() {
    }

    public Estudiante(String numeroCuenta, String codigoClase, int year, int numSec) {
        this.numeroCuenta = numeroCuenta;
        this.codigoClase = codigoClase;
        this.year = year;
        this.numSec = numSec;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumSec() {
        return numSec;
    }

    public void setNumSec(int numSec) {
        this.numSec = numSec;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "numeroCuenta=" + numeroCuenta + ", codigoClase=" + codigoClase + ", year=" + year + ", numSec=" + numSec + '}';
    }

}
