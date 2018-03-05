import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class AnalizadorAccesosAServidor
{
    private ArrayList<Acceso> accesos;

    /**
     * Constructor
     */
    public AnalizadorAccesosAServidor() 
    {
        accesos = new ArrayList<>();
    }

    /**
     * Analiza un fichero de log con el formato (AAAA MM DD hh mm).
     * @param archivo la ruta, relativa o absoluta, incluyendo la extension del archivo. 
     */
    public void analizarArchivoDeLog(String archivo)
    {
        accesos.clear();
        File archivoALeer = new File(archivo);
        try {
            Scanner sc = new Scanner(archivoALeer);
            while (sc.hasNextLine()) {
                Acceso accesoActual = new Acceso(sc.nextLine());                               
                accesos.add(accesoActual);
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Ocurrio algun error al leer el archivo.");
        }
    }

    /**
     * Devuelve la hora con mas accesos y la muestra por pantalla.
     * @return Devuelve la hora con mas accesos, si no hay accesos devuelve -1.
     */
    public int obtenerHoraMasAccesos() 
    {
        int valorADevolver = -1;

        if (!accesos.isEmpty()) {
            int[] accesosPorHora = new int[24];

            for (Acceso accesoActual : accesos) {
                int horaAccesoActual = accesoActual.getHora();
                accesosPorHora[horaAccesoActual] = accesosPorHora[horaAccesoActual] + 1;
            }

            int numeroDeAccesosMasAlto = accesosPorHora[0];
            int horaDeAccesosMasAlto = 0;
            for (int i = 0; i < accesosPorHora.length; i++) {
                if (accesosPorHora[i] >= numeroDeAccesosMasAlto) {
                    numeroDeAccesosMasAlto = accesosPorHora[i];
                    horaDeAccesosMasAlto = i;
                }
            }

            valorADevolver = horaDeAccesosMasAlto;                      
        }

        return valorADevolver;
    }

    /**
     * Devuelve la web con mas accesos y la muestra por pantalla.
     * @return Devuelve la web con mas accesos, si no hay accesos devuelve null.
     */
    public String paginaWebMasSolicitada() 
    {
        String valorADevolver = null;
        int masRepetidas= 0;
        if (accesos.size()>0) {           
            for (Acceso accesoActual : accesos) {
                String webActual = accesoActual.getPagWeb();
                int repetidas= 0;
                for(int i= 0;i< accesos.size(); i++)
                {
                    if(webActual.equals(accesos.get(i).getPagWeb()))
                    {
                        repetidas++;
                    }
                }
                if(masRepetidas<= repetidas)
                {
                    valorADevolver= webActual;
                    masRepetidas = repetidas;
                }                
            }
        }
        return valorADevolver;
    }

    public String clienteConMasAccesosExitosos()
    {
        return "";
    }

}
