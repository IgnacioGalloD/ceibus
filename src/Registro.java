import java.time.LocalDate;
import java.util.ArrayList;

public class Registro {
    private String id;
    private LocalDate fecha;
    private String nombre;
    private float importe;
    private float comision;
    private int numBoca;

    public Registro(String id, LocalDate fecha, String nombre, float importe, float comision, int numBoca) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.importe = importe;
        this.comision = comision;
        this.numBoca = numBoca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public int getNumBoca() {
        return numBoca;
    }

    public void setNumBoca(int numBoca) {
        this.numBoca = numBoca;
    }

    public float calcularImpTot(ArrayList<Registro> registros) {
        float suma = 0;
        for (Registro unRegistro : registros) {
            suma=suma+ unRegistro.getImporte();
        }
        return suma;
    }

    public int calcularCantOpeBoca(ArrayList<Registro> registros) {
        int cant = 0;
        for (Registro unRegistro : registros) {
            if(unRegistro.getNumBoca()==15242){
                cant++;
            }
        }
        return cant;
    }

    public float calcularTotComBoca(ArrayList<Registro>  registros) {
        float suma = 0;
        for (Registro unRegistro : registros) {
            if(unRegistro.getNumBoca()==15242){
                suma=suma+ unRegistro.getComision();
            }
        }
        return suma;
    }

    public float calcularTotCobradoBoca(ArrayList<Registro> registros) {
        float suma = 0;
        for (Registro unRegistro : registros) {
            if(unRegistro.getNumBoca()==15242){
                suma=suma+ unRegistro.getImporte();
            }
        }
        return suma;
    }
}
