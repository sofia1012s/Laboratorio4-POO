/**
 * carroS.java
 * 
 * @author Jeremy Mejía, Héctor de León, Sofía Salguero
 * @version 16/11/2021
 * 
 * Interfaz para radio del carro tipo S
 */

public interface CarroS extends Radio {

    /**
     * 
     * @param bocinaAuricular
     * @return String
     */
    public String cambiarBocinaAAuriculares(int bocinaAuricular);

    /**
     * 
     * @param destino
     */
    public void setDestino(String destino);

    /**
     * 
     * @return String
     */
    public String getDestino();
}
