/**
 * Modela objetos Acceso. 
 * Los objetos Acceso controlan todos los datos relativos a fecha y hora de una conexion al servidor.
 * 
 * @author garcol93
 * @version 2018/03/05
 */
public class Acceso
{   
    //direccion ip
    private String ip;
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    //direccion pagina web
    private String pagWeb;
    //codigo cel servidor 200 exito 403fallo
    private int codServ;

    /**
     * Construye objetos Acceso.
     * @param String con direccion ip, fecha, hora, min, pagina web y codigo servidor
     */
    public Acceso(String texto)
    {
        String[] strings = texto.split(" ");
        this.ip = strings[0];
        this.ano = Integer.parseInt(strings[1].substring(1,5));
        this.mes =Integer.parseInt(strings[2]);
        this.dia = Integer.parseInt(strings[3]);
        this.hora =Integer.parseInt(strings[4]);
        this.minutos = Integer.parseInt(strings[5].substring(0,2));
        this.pagWeb = strings[6];
        this.codServ = Integer.parseInt(strings[7]);
    }

    /**
     * Devuelve la ip en el que se ha producido el Acceso al servidor.
     * @return Devuelve la ip en el que se ha producido el Acceso al servidor.
     */
    public String getIp()
    {
        return ip;
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

    /**
     * Devuelve la direccion web en el que se ha producido el Acceso al servidor.
     * @return Devuelve la direccion web en el que se ha producido el Acceso al servidor.
     */
    public String getPagWeb()
    {
        return pagWeb;
    }

    /**
     * Devuelve el codigo del servidor en el que se ha producido el Acceso.
     * @return Devuelve el codigo del servidor en el que se ha producido el Acceso.
     */
    public int getCodServ()
    {
        return codServ;
    }
}