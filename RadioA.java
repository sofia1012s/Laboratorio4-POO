import java.util.ArrayList;
import java.util.List;

class RadioA implements CarroA{
   
    private int volumen = 0;
    private double emisora = 80.0;
    private int numeroDeLista = 0;
    private int contadorCancion = 0;
    private List<String> emisorasGuardadas = new ArrayList<>();
    //Lista de reproduccion 1
    private String[] nombreCancion1 = new String[]{"hola", "adios", "100azo", "verano"};
    private String[] duracion1 = new String[]{"2 minutos", "3 minutos", "4 minutos", "5 minutos"};
    private String[] autor1 = new String[]{"Hector", "Sofi Sofia", "Jeremaya", "Phineas y pherb"};
    private String[] genero1 = new String[]{"pop", "Perreo intenso", "Reggae", "infantil"};
 //Lista de reproduccion 2
    private String[] nombreCancion2 = new String[]{"hola", "adios", "100azo", "verano"};
    private String[] duracion2 = new String[]{"2 minutos", "3 minutos", "4 minutos", "5 minutos"};
    private String[] autor2 = new String[]{"Hector", "Sofi Sofia", "Jeremaya", "Phineas y pherb"};
    private String[] genero2 = new String[]{"pop", "Perreo intenso", "Reggae", "infantil"};

    //contactos
    private String[] contactos = new String[]{"juanito", "papa", "mama", "abuelo"};
    


    public String encenderApagar( int opcion){
        String variable = "";
        switch(opcion){
            case 1: //opcion 1 es para encender el radio
                variable = "Se ha encendido el radio!!";
                break;
            case 2://esta para apagarlo
            variable = "Se apago el radio.";
                break;
        }
        return variable;
    }

    public void cambiarVolumen( int opcion){
        switch(opcion){
            case 1://opcion 1 es para subir volumen (solo llega a 10)
                if(volumen < 10){
                    volumen = volumen + incrementarVolumen;
                }

                if(volumen == 10){
                    volumen = 10;
                }
                break;
            case 2://opcion 2 es para bajar volumen (no baja de  0)

                if(volumen > 0){
                    volumen = volumen - incrementarVolumen;
                }

                if(volumen == 0){
                    volumen = 0;
                }
                 break;
        }
    }

    public void cambiarEmisora(int opcion){
        switch(opcion){
            case 1://es parecido a el metodo cambiarVolumen(las emisoras empiezan en 80.0 y terminan en 110.0)
                if(emisora < 110.0){
                    emisora = emisora + 0.5;
                }

                if(emisora == 110.0){
                    emisora = 110.0;
                }
                break;
            case 2:

                if(emisora > 80.0){
                    emisora = emisora - 0.5;
                }

                if(emisora == 80.0){
                    emisora = 80.0;
                }
                 break;
        }

    }
    
    public void guardarEmisora(double emisora){//Le da libertad al usuario de escribir directamente la emisora que desea guardar
        //Hay que indicarle que las emisoras son de 80.0 a 110.0 :)
        String emisoraString = String.valueOf(emisora);//convierte el valor a string para guardarlo en el arraylist como strng
        emisorasGuardadas.add(emisoraString);
    }

    public String cargarEmisora(int numeroEmisora){
        int nuEmisora = numeroEmisora -1 ;//para que empiece en 0
        String escogida = emisorasGuardadas.get(nuEmisora);
        return escogida;
    }

    public void seleccionarLista(int numLista){//hay 2 listas, puede seleccionar entre una de las 2 
        numeroDeLista = numLista;

    }

    public void cambiarCancion(int siguienteAnerior){//el menu debe ser algo asi(1. siguiente, 2. anterior)

        if(contadorCancion < 4 && siguienteAnerior == 1 ){
            contadorCancion = contadorCancion + 1;
        }

        if(contadorCancion == 4 && siguienteAnerior == 1 ){
            contadorCancion = 4;
        }

        if(contadorCancion > 0 && siguienteAnerior == 2 ){
            contadorCancion = contadorCancion - 1;
        }

        if(contadorCancion == 0 && siguienteAnerior == 2 ){
            contadorCancion = 0;
        }
    }

    public String conectarTelefono(int telefono){
        String out = "";
        if (telefono == 1){
            out = "Telefono conectado";
        }
        return out;
    }

    public String [] mostrarContactos(){//imprime la lista de contactos
        return contactos; 
    }

    public void llamarContacto(){
        
    }

    public void finalizarLlamada(){}

   

      
   
    public String LlamarUltimoContacto(int ultimo){

    }
    public String verTarjetasPresentacion(int tarjetas){

    }
}
