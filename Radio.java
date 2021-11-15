public interface Radio {

    public int CambiarFMaAM = 1;
    
    public int incrementarVolumen  = 1;

    public abstract String encenderApagar(int opcion);

    public abstract void cambiarVolumen(int opcion);

    public abstract void cambiarEmisora(int opcion);
    
    public abstract void guardarEmisora(double emisora);

    public abstract void cargarEmisora(int numeroEmisora);

    public abstract void seleccionarLista(int numLista);

    public abstract void cambiarCancion(int siguienteAnerior);

    public abstract String conectarTelefono(int telefono);

    public abstract String [] mostrarContactos();

    public abstract String llamarContacto(int opcion);

    public abstract String finalizarLlamada(int opcion);



}
