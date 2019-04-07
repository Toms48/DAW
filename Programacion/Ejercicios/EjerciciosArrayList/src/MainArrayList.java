import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayList {
    public static  void main(String[] args){

        //Declaraciones de variables
        String ciudad = "";
        String ciudadABuscar = "";

        int posicionAImprimir = 0;
        int posicionABorrar = 0;
        int posicionABuscar = 0;

        //Inicializaciones
        Scanner tecladoS = new Scanner(System.in);
        Scanner tecladoN = new Scanner(System.in);

        ArrayList<String> nombresCiudades = new ArrayList<String>();
        nombresCiudades.add("Tokio");
        nombresCiudades.add("Rio");
        nombresCiudades.add("Berlin");
        nombresCiudades.add("Nairobi");
        nombresCiudades.add("Moscú");

        //Inicio
        //Mostrar numero de ciudades
        System.out.println("EJERCICIO 2");
        System.out.println("====================================================================================================================");
        System.out.println("Hay un total de " +nombresCiudades.size() +" ciudades en el array: ");

        System.out.println();

        //Mostrar listado de las ciudades
        System.out.println("=-=-= Listado de ciudades =-=-=");
        for(String dato : nombresCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 3");
        System.out.println("====================================================================================================================");
        //Introducir ciudades
        do{
            System.out.print("Introduzca el nombre de una ciudad (\"fin\" para salir): ");
            ciudad = tecladoS.nextLine();
            if(!ciudad.equals("fin")){
                nombresCiudades.add(ciudad);
            }
        }
        while(!ciudad.equals("fin"));

        System.out.println();

        //Mostrar listado de las ciudades
        System.out.println("=-=-= Listado de ciudades =-=-=");
        for(String dato : nombresCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 4");
        System.out.println("====================================================================================================================");
        //Buscar ciudad en la lista
        System.out.print("Introduzca el nombre de una ciudad: ");
        ciudadABuscar = tecladoS.nextLine();

        if(nombresCiudades.contains(ciudadABuscar)){
            System.out.println("La ciudad está en el puesto " +(nombresCiudades.indexOf(ciudadABuscar)+1) +" de la lista");
        }
        else{
            System.out.println("La ciudad introducida no está en el listado");
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 5");
        System.out.println("====================================================================================================================");
        //Mostrar ciudad por una posicion dada
        do{
            System.out.print("Escriba una posición del listado (1-" +nombresCiudades.size() +"): ");
            posicionAImprimir = tecladoN.nextInt();

            if(posicionAImprimir<=0 || posicionAImprimir>nombresCiudades.size()){
                System.out.println("Tienes que introducir un número entre el rango indicado, gracias.");
            }

        }
        while(posicionAImprimir<=0 || posicionAImprimir>nombresCiudades.size());

        System.out.println();

        System.out.println(nombresCiudades.get(posicionAImprimir-1));
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 6");
        System.out.println("====================================================================================================================");
        //Borrar elemento del array
        do{
            System.out.print("Escriba una posición del listado para borrar (1-" +nombresCiudades.size() +"): ");
            posicionABorrar = tecladoN.nextInt();

            if(posicionABorrar<=0 || posicionABorrar>nombresCiudades.size()){
                System.out.println("Tienes que introducir un número entre el rango indicado, gracias.");
            }

        }
        while(posicionABorrar<=0 || posicionABorrar>nombresCiudades.size());

        nombresCiudades.remove(posicionABorrar-1);
        System.out.println("Se ha borrado el elemento seleccionado");

        System.out.println();

        //Mostrar listado de las ciudades
        System.out.println("=-=-= Listado de ciudades =-=-=");
        for(String dato : nombresCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 7");
        System.out.println("====================================================================================================================");
        System.out.print("Introduzca el nombre de una ciudad: ");
        ciudadABuscar = tecladoS.nextLine();

        if(nombresCiudades.contains(ciudadABuscar)){
            nombresCiudades.remove(ciudadABuscar);
            System.out.println("Se ha eliminado correctamente");
        }
        else{
            System.out.println("La ciudad introducida no está en el listado");
        }

        System.out.println("\n=-=-= Listado de ciudades =-=-=");
        for(String dato : nombresCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 8");
        System.out.println("====================================================================================================================");
        do{
            System.out.print("Escriba una posición del listado para cambiar el nombre (1-" +nombresCiudades.size() +"): ");
            posicionABuscar = tecladoN.nextInt();

            if(posicionABuscar<=0 || posicionABuscar>nombresCiudades.size()){
                System.out.println("Tienes que introducir un número entre el rango indicado, gracias.");
            }

        }
        while(posicionABuscar<=0 || posicionABuscar>nombresCiudades.size());

        System.out.print("Introduzca el nombre nuevo para la ciudad: ");
        ciudad = tecladoS.nextLine();

        nombresCiudades.set(posicionABuscar-1, ciudad);

        System.out.println("\n=-=-= Listado de ciudades =-=-=");
        for(String dato : nombresCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 9");
        System.out.println("====================================================================================================================");
        System.out.println("\n=-=-= Listado de ciudades =-=-=");
        for(String dato : nombresCiudades){
            dato = "Cdd " +dato;
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 10");
        System.out.println("====================================================================================================================");
        String[] arrayCiudades = new String[nombresCiudades.size()];
        nombresCiudades.toArray(arrayCiudades);

        System.out.println("\n=-=-= Listado de ciudades =-=-=");
        for(String dato : arrayCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 11");
        System.out.println("====================================================================================================================");
        System.out.print("Introduzca el nombre de una ciudad: ");
        ciudadABuscar = tecladoS.nextLine();

        do{
            if(nombresCiudades.contains(ciudadABuscar)){
                nombresCiudades.remove(ciudadABuscar);
            }
            else{
                System.out.println("La ciudad introducida no está en el listado");
            }
        }
        while(nombresCiudades.contains(ciudadABuscar));

        System.out.println("\n=-=-= Listado de ciudades =-=-=");
        for(String dato : nombresCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");

        System.out.println("\n\n\n");

        System.out.println("EJERCICIO 12");
        System.out.println("====================================================================================================================");
        Collections.sort(nombresCiudades);

        System.out.println("=-=-= Listado de ciudades ordenadas =-=-=");
        for(String dato : nombresCiudades){
            System.out.println("\t- " +dato);
        }
        System.out.println("====================================================================================================================");


        //Fin

    }
}
