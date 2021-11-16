
/**
 * carroC.java
 * 
 * @author Jeremy Mejía, Héctor de León, Sofía Salguero
 * @version 16/11/2021
 * 
 * Interfaz para radio del carro tipo C
 */

public interface CarroC extends Radio {

    /**
     * 
     * @param llamada
     * @return String
     */
    public String cambiarLlamadaEspera(int llamada);

    /**
     * 
     * @param pronostico
     * @return String
     */
    public String pronosticoTiempo(int pronostico);
}
