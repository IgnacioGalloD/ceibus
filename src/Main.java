import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\EntrevistaEjemploRendicion2.txt";// Nombre del archivo a leer
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            int cantLineas=0;

            ArrayList<Registro> reg = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                // Procesar cada línea
                // Completa codigo
                String id = line.substring(0,8);
                String txtAnio = line.substring(8,12);
                String txtMes = line.substring(12,14);
                String txtDia = line.substring(14,16);
                String txtImporte = line.substring(16,23);
                String txtComision = line.substring(23,27);
                String nombre = line.substring(27,47);
                String txtNumBoca = line.substring(47);

                // Transformo el importe con dos decimales
                float importe = Float.parseFloat(txtImporte);
                importe=importe/100;

                // Transformo la comision con dos decimales
                float comision = Float.parseFloat(txtComision);
                comision=comision/100;

                //String numTruncado = String.format("%.2f", importe);

                // Transformo la fecha a su formato
                LocalDate fecha = LocalDate.of(Integer.parseInt(txtAnio),Integer.parseInt(txtMes),Integer.parseInt(txtDia));

                // Transformo a int el numero de boca
                int numBoca = Integer.parseInt(txtNumBoca);

                // Agrego un elemento
                reg.add(new Registro(id, fecha, nombre, importe, comision, numBoca));

                //System.out.println(id+" "+txtImporte+" "+txtComision+" "+nombre+" "+txtNumBoca);
                cantLineas++;
            }
            // Imprimir resultados
            System.out.println("Cantidad total de operaciones: "+cantLineas);
            System.out.println("Importe total de operaciones: $"+reg.get(0).calcularImpTot(reg));
            System.out.println("Cantidad total de operaciones de la boca nro 015242: "+reg.get(0).calcularCantOpeBoca(reg));
            System.out.println("Total de Comisiones de la boca nro 015242: $"+reg.get(0).calcularTotComBoca(reg));
            System.out.println("Importe Total Cobrado de la boca nro 015242: $"+reg.get(0).calcularTotCobradoBoca(reg));
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}