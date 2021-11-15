public interface Radio {

    public int CambiarFMaAM = 1;
    
    public int incrementarVolumen  = 1;

    public abstract String encenderApagar(int opcion);

    public abstract void cambiarVolumen();

    public abstract void cambiarEmisora();
    
    public abstract void guardarEmisora();

    public abstract void cargarEmisora();

    public abstract void seleccionarLista();

    public abstract void cambiarCancion();

    public abstract String conectarTelefono();

    public abstract String [] mostrarContactos();

    public abstract void llamarContacto();

    public abstract void finalizarLlamada();



}
