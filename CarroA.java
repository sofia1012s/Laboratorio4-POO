/**
 * carroA.java
 * 
 * @author Jeremy Mejía, Héctor de León, Sofía Salguero
 * @version 16/11/2021 
 * 
 * Interfaz para radio del carro tipo A
 */

public interface CarroA extends Radio {
    /**
     * @param ultimo
     * @return String
     */
    public String LlamarUltimoContacto(int ultimo);

    /**
     * 
     * @param tarjetas
     * @return String
     */
    public String verTarjetasPresentacion(int tarjetas);
}
