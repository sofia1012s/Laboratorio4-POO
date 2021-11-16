/**
 * RadioA.java
 * 
 * @author Jeremy Mejía, Héctor de León, Sofía Salguero
 * @version 16/11/2021 
 * 
 * Clase de radioA que hacer override a métodos de clases madre
 */


import java.util.ArrayList;
import java.util.List;

class RadioA implements CarroA {

    private int volumen = 0;
    private double emisora = 80.0;
    private int numeroDeLista = 1;
    private int contadorCancion = 0;
    private List<Double> emisorasGuardadas = new ArrayList<>();
    // Lista de reproduccion 1
    private String[] nombreCancion1 = new String[] { "hola", "adios", "100azo", "verano" };
    private String[] duracion1 = new String[] { "2 minutos", "3 minutos", "4 minutos", "5 minutos" };
    private String[] autor1 = new String[] { "Hector", "Sofi Sofia", "Jeremaya", "Phineas y pherb" };
    private String[] genero1 = new String[] { "pop", "Perreo intenso", "Reggae", "infantil" };

    // Lista de reproduccion 2
    private String[] nombreCancion2 = new String[] { "100azo", "verano", "hola", "adios" };
    private String[] duracion2 = new String[] { "5 minutos", "2 minutos", "4 minutos", "3 minutos" };
    private String[] autor2 = new String[] { "Hector", "Phineas y pherb", "Jeremaya", "Sofi Sofia" };
    private String[] genero2 = new String[] { "pop", "infantil", "Reggae", "Perreo intenso" };

    // contactos
    private String[] contactos = new String[] { "juanito", "papa", "mama", "abuelo" };

    // Historial de llamadas
    private List<String> historialLlamadas = new ArrayList<>();

    
    /** 
     * @param opcion
     * @return String
     */
    public String encenderApagar(int opcion) {
        String variable = "";
        switch (opcion) {
        case 1: // opcion 1 es para encender el radio
            variable = "Se ha encendido el radio!!";
            break;
        case 2:// esta para apagarlo
            variable = "Se apago el radio.";
            break;
        }
        return variable;
    }

    
    /** 
     * @param opcion
     */
    public void cambiarVolumen(int opcion) {
        switch (opcion) {
        case 1:// opcion 1 es para subir volumen (solo llega a 10)
            if (volumen < 10) {
                volumen = volumen + incrementarVolumen;
            }

            if (volumen == 10) {
                volumen = 10;
            }
            break;
        case 2:// opcion 2 es para bajar volumen (no baja de 0)

            if (volumen > 0) {
                volumen = volumen - incrementarVolumen;
            }

            if (volumen == 0) {
                volumen = 0;
            }
            break;
        }
    }

    
    /** 
     * @param opcion
     */
    public void cambiarEmisora(int opcion) {
        switch (opcion) {
        case 1:// es parecido a el metodo cambiarVolumen(las emisoras empiezan en 80.0 y
               // terminan en 110.0)
            if (emisora < 110.0) {
                emisora = emisora + 0.5;
            }

            if (emisora == 110.0) {
                emisora = 110.0;
            }
            break;
        case 2:

            if (emisora > 80.0) {
                emisora = emisora - 0.5;
            }

            if (emisora == 80.0) {
                emisora = 80.0;
            }
            break;
        }

    }

    
    /** 
     * @return double
     */
    public double getEmisora() {
        return emisora;
    }

    
    /** 
     * @return int
     */
    public int getVolumen() {
        return volumen;
    }

    
    /** 
     * @param getEmisorasGuardadas(
     */
    public void guardarEmisora(double emisora) {// Le da libertad al usuario de escribir directamente la emisora que
        // desea guardar
        // Hay que indicarle que las emisoras son de 80.0 a 110.0 :)
        // String emisoraString = String.valueOf(emisora);// convierte el valor a string
        // para guardarlo en el arraylist
        // como strng
        emisorasGuardadas.add(emisora);
    }

    
    /** 
     * @return List<Double>
     */
    public List<Double> getEmisorasGuardadas() {
        return emisorasGuardadas;
    }

    
    /** 
     * @param numeroEmisora
     */
    public void cargarEmisora(int numeroEmisora) {
        int nuEmisora = numeroEmisora - 1;// para que empiece en 0
        double escogida = emisorasGuardadas.get(nuEmisora);
        emisora = escogida;
    }

    
    /** 
     * @param getNumeroDeLista(
     */
    public void seleccionarLista(int numLista) {// hay 2 listas, puede seleccionar entre una de las 2
        numeroDeLista = numLista;

    }

    
    /** 
     * @return int
     */
    public int getNumeroDeLista() {
        return numeroDeLista;
    }

    
    /** 
     * @param lista
     * @return String[]
     */
    public String[] getLista(int lista) {

        String[] miLista = new String[] {};

        if (lista == 1) {
            miLista = new String[] { nombreCancion1[contadorCancion], duracion1[contadorCancion],
                    autor1[contadorCancion], genero1[contadorCancion] };
        }

        if (lista == 2) {
            miLista = new String[] { nombreCancion2[contadorCancion], duracion2[contadorCancion],
                    autor2[contadorCancion], genero2[contadorCancion] };
        }

        return miLista;
    }

    
    /** 
     * @param 1
     */
    public void cambiarCancion(int siguienteAnerior) {// el menu debe ser algo asi(1. siguiente, 2. anterior)

        if (contadorCancion < 3 && siguienteAnerior == 1) {
            contadorCancion = contadorCancion + 1;
        }

        if (contadorCancion == 3 && siguienteAnerior == 1) {
            contadorCancion = 0;
        }

        if (contadorCancion > 0 && siguienteAnerior == 2) {
            contadorCancion = contadorCancion - 1;
        }

        if (contadorCancion == 0 && siguienteAnerior == 2) {
            contadorCancion = 3;
        }
    }

    
    /** 
     * @param telefono
     * @return String
     */
    public String conectarTelefono(int telefono) {
        String out = "";
        if (telefono == 1) {
            out = "Telefono conectado";
        }
        return out;
    }

    
    /** 
     * @param i++
     * @return String
     */
    public String mostrarContactos() {// imprime la lista de contactos
        String contactos = "\n";
        for (int i = 0; i < this.contactos.length; i++) {
            contactos += "\n(" + (i + 1) + ") " + this.contactos[i];
        }
        return contactos;
    }

    
    /** 
     * @param 0
     * @return String
     */
    public String llamarContacto(int opcion) { // Elige al contacto que desea llamar
        String Llamar = "";
        if (opcion == 0){
            Llamar = "No se esta llamando a nigun contacto";
        }
        if (opcion == 1) {
            Llamar = "Llamando al contacto juanito";
        }
        if (opcion == 2) {
            Llamar = "Llamando al contacto papa";
        }
        if (opcion == 3) {
            Llamar = "Llamando al contacto mama";
        }
        if (opcion == 4) {
            Llamar = "Llamando al contacto abuelo";
        }
        return Llamar;
    }

    
    /** 
     * @param opcion
     * @return String
     */
    public String finalizarLlamada(int opcion) {
        String finalizar = "";

        if (opcion == 1) {
            finalizar = "Llamada finalizada";
        }
        return finalizar;
    }

    
    /** 
     * @param tarjetas
     * @return String
     */
    public String LlamarUltimoContacto(int ultimo) {// Hay un arreglo que guarda las llamadas y Se muestra el último
                                                    // contacto que llamó
        int numeroLlamada = historialLlamadas.size();
        String ultimoContacto = historialLlamadas.get(numeroLlamada - 1);
        return ultimoContacto;

    }

    
    /** 
     * @param tarjetas
     * @return String
     */
    public String verTarjetasPresentacion(int tarjetas) {
        String Tarjetas = "";
        if (tarjetas == 1) {
            Tarjetas = "Mostrando tarjetas de presetación";
        }
        return Tarjetas;

    }

    
    /** 
     * @return String[]
     */
    public String[] getNombreCancion1() {
        return nombreCancion1;
    }

    
    /** 
     * @return String[]
     */
    public String[] getAutor1() {
        return autor1;
    }

    
    /** 
     * @return String[]
     */
    public String[] getAutor2() {
        return autor2;
    }

    
    /** 
     * @return String[]
     */
    public String[] getNombreCancion2() {
        return nombreCancion2;
    }

    
    /** 
     * @param contadorCancion
     */
    public void setContadorCancion(int contadorCancion) {
        this.contadorCancion = contadorCancion;
    }
}
