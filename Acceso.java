/**
 * Modela objetos Acceso. 
 * Los objetos Acceso controlan todos los datos relativos a fecha y hora de una conexion al servidor.
 * 
 * @author garcol93
 * @version 2018/03/05
 */
public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    /**
     * Construye objetos Acceso.
     * @param String con fecha y hora completa
     */
    public Acceso(String texto)
    {
        String[] strings = texto.split(" ");                
        this.ano = Integer.parseInt(strings[0]);
        this.mes =Integer.parseInt(strings[1]);
        this.dia = Integer.parseInt(strings[2]);
        this.hora =Integer.parseInt(strings[3]);
        this.minutos = Integer.parseInt(strings[4]);
    }

    /**
     * Devuelve el ano en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */

    public int getAno() 
    {
        return ano;
    }

    /**
     * Devuelve el mes en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * Devuelve el dia en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getDia()
    {
        return dia;
    }

    /**
     * Devuelve la hora en la que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getHora()
    {
        return hora;
    }

    /**
     * Devuelve el minuto en el que se ha producido el Acceso al servidor.
     * @return Devuelve el ano en el que se ha producido el Acceso al servidor.
     */
    public int getMinutos()
    {
        return minutos;
    }
}