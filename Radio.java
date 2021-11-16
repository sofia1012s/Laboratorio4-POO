/**
 * Radio.java
 * 
 * @author Jeremy Mejía, Héctor de León, Sofía Salguero
 * @version 16/11/2021
 * 
 * Interfaz para todos los tipos de radios
 */

public interface Radio {

    public int CambiarFMaAM = 1;

    public int incrementarVolumen = 1;

    /**
     * 
     * @param opcion
     * @return String
     */
    public abstract String encenderApagar(int opcion);

    /**
     * 
     * @param opcion
     */
    public abstract void cambiarVolumen(int opcion);

    /**
     * 
     * @param opcion
     */
    public abstract void cambiarEmisora(int opcion);

    /**
     * 
     * @param emisora
     */
    public abstract void guardarEmisora(double emisora);

    /**
     * 
     * @param numeroEmisora
     */
    public abstract void cargarEmisora(int numeroEmisora);

    /**
     * 
     * @param numLista
     */
    public abstract void seleccionarLista(int numLista);

    /**
     * 
     * @param siguienteAnerior
     */
    public abstract void cambiarCancion(int siguienteAnerior);

    /**
     * 
     * @param telefono
     * @return String
     */
    public abstract String conectarTelefono(int telefono);

    /**
     * 
     * @return String
     */
    public abstract String mostrarContactos();

    /**
     * 
     * @param opcion
     * @return String
     */
    public abstract String llamarContacto(int opcion);

    /**
     * 
     * @param opcion
     * @return String
     */
    public abstract String finalizarLlamada(int opcion);

}
