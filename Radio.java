public abstract class Radio {

    private int CambiarFMaAM; 

    public abstract void encenderApagar();

    public abstract void cambiarVolumen();

    public abstract void cambiarEmisora();
    
    public abstract void guardarEmisora();

    public abstract void cargarEmisora();

    public abstract void seleccionarLista();

    public abstract void cambiarCancion();

    public abstract void conectarTelefono();

    public abstract void mostrarContactos();

    public abstract void llamarContacto();

    public abstract void finalizarLlamada();

    public abstract String LlamarUltimoContacto(int ultimo);

    public abstract String verTarjetasPresentacion(int tarjetas);

}
