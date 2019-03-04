package Gestoras;

import Clases.Pelicula;
import Enums.*;

import java.util.Scanner;
import java.util.ArrayList;

public class GestoraEjercicioPropio {

    public static void mostrarListaPeliculas(ArrayList<Pelicula> arrayPeliculas){
        if(arrayPeliculas.isEmpty()){
            System.out.println("Actualmente la lista está vacía.");
            //System.out.println(arrayPeliculas.size());
        }
        else{
            for(int i=0; i<=arrayPeliculas.size()-1; i++){
                System.out.println( (i+1) +". " +arrayPeliculas.get(i).getTitulo());
            }
        }
    }

    public static void aniadirPelicula(ArrayList<Pelicula> arrayPeliculas){

        String nuevoTitulo = "";

        Scanner tecladoS = new Scanner(System.in);

        System.out.print("Introduzca el título de la nueva película: ");
        nuevoTitulo = tecladoS.nextLine();

        Pelicula peliAniadida = new Pelicula(nuevoTitulo);

        arrayPeliculas.add(peliAniadida);
    }

    public static void eliminarPelicula(ArrayList<Pelicula> arrayPeliculas){

        Scanner tecladoN = new Scanner(System.in);

        GestoraEjercicioPropio.mostrarListaPeliculas(arrayPeliculas);

        System.out.print("Introduzca el indice de la película: ");
        arrayPeliculas.remove(tecladoN.nextInt()-1);
    }

    public static void listaMasVecesVista(ArrayList<Pelicula> arrayPeliculas){

        int masVecesVista = 0;
        int indiceEliminar = 0;

        ArrayList<Pelicula> arrayAux = new ArrayList<Pelicula>();

        arrayAux = (ArrayList<Pelicula>) arrayPeliculas.clone();

        do{
            for(Pelicula peli: arrayAux){
                if(peli.getVecesVista() >= masVecesVista){
                    masVecesVista = peli.getVecesVista();
                    //System.out.println(arrayAux.indexOf(peli));
                    indiceEliminar = arrayAux.indexOf(peli);
                }
            }

            System.out.println(arrayAux.get(indiceEliminar).getVecesVista() +" ---> " +arrayAux.get(indiceEliminar).getTitulo());

            arrayAux.remove(indiceEliminar);

            masVecesVista = 0;

        }
        while(arrayAux.isEmpty() == false);


    }

    public static void listaMasNotaGenero(ArrayList<Pelicula> arrayPeliculas){

        int opcionMenuGenero = 0;
        int maxNota = 0;
        int indiceEliminar = 0;

        Scanner tecladoN = new Scanner(System.in);
        ArrayList<Pelicula> arrayAux = new ArrayList<Pelicula>();

        arrayAux = arrayPeliculas;

        do{
            System.out.println("o-=-=-=-= La lista de Generos =-=-=-=-=-o");
            System.out.println("|                                       |");
            System.out.println("| 1. Ciencia Ficcion                    |");
            System.out.println("| 2. Terror                             |");
            System.out.println("| 3. Comedia                            |");
            System.out.println("| 4. Drama                              |");
            System.out.println("| 5. Fantasia                           |");
            System.out.println("|                                       |");
            System.out.println("o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
            System.out.print  ("Indique un género: ");
            opcionMenuGenero = tecladoN.nextInt();
        }
        while(opcionMenuGenero<1 || opcionMenuGenero>5);

        switch(opcionMenuGenero){
            case 1:
                for(int i=0; i<=arrayPeliculas.size()-1; i++) {
                    if(arrayPeliculas.get(i).getGenero() == enumGenero.CienciaFiccion){
                        do{
                            for(Pelicula peli: arrayAux){

                                if(peli.getNota() >= maxNota){
                                    maxNota = peli.getNota();
                                    indiceEliminar = arrayAux.indexOf(peli);
                                }
                            }
                            System.out.println(arrayAux.get(indiceEliminar).getNota() +" ---> " +arrayAux.get(indiceEliminar).getTitulo());

                            arrayAux.remove(indiceEliminar);
                            maxNota = 0;
                        }
                        while(arrayAux.isEmpty() == false);
                    }
                }
                break;

            case 2:
                for(int i=0; i<=arrayPeliculas.size()-1; i++) {
                    if(arrayPeliculas.get(i).getGenero() == enumGenero.Terror){
                        do{
                            for(Pelicula peli: arrayAux){

                                if(peli.getNota() >= maxNota){
                                    maxNota = peli.getNota();
                                    indiceEliminar = arrayAux.indexOf(peli);
                                }
                            }
                            System.out.println(arrayAux.get(indiceEliminar).getNota() +" ---> " +arrayAux.get(indiceEliminar).getTitulo());

                            arrayAux.remove(indiceEliminar);
                            maxNota = 0;
                        }
                        while(arrayAux.isEmpty() == false);
                    }
                }
                break;

            case 3:
                for(int i=0; i<=arrayPeliculas.size()-1; i++) {
                    if(arrayPeliculas.get(i).getGenero() == enumGenero.Comedia){
                        do{
                            for(Pelicula peli: arrayAux){

                                if(peli.getNota() >= maxNota){
                                    maxNota = peli.getNota();
                                    indiceEliminar = arrayAux.indexOf(peli);
                                }
                            }
                            System.out.println(arrayAux.get(indiceEliminar).getNota() +" ---> " +arrayAux.get(indiceEliminar).getTitulo());

                            arrayAux.remove(indiceEliminar);
                            maxNota = 0;
                        }
                        while(arrayAux.isEmpty() == false);
                    }
                }
                break;

            case 4:
                for(int i=0; i<=arrayPeliculas.size()-1; i++) {
                    if(arrayPeliculas.get(i).getGenero() == enumGenero.Drama){
                        do{
                            for(Pelicula peli: arrayAux){

                                if(peli.getNota() >= maxNota){
                                    maxNota = peli.getNota();
                                    indiceEliminar = arrayAux.indexOf(peli);
                                }
                            }
                            System.out.println(arrayAux.get(indiceEliminar).getNota() +" ---> " +arrayAux.get(indiceEliminar).getTitulo());

                            arrayAux.remove(indiceEliminar);
                            maxNota = 0;
                        }
                        while(arrayAux.isEmpty() == false);
                    }
                }
                break;

            case 5:
                for(int i=0; i<=arrayPeliculas.size()-1; i++) {
                    if(arrayPeliculas.get(i).getGenero() == enumGenero.Fantasia){
                        do{
                            for(Pelicula peli: arrayAux){

                                if(peli.getNota() >= maxNota){
                                    maxNota = peli.getNota();
                                    indiceEliminar = arrayAux.indexOf(peli);
                                }
                            }
                            System.out.println(arrayAux.get(indiceEliminar).getNota() +" ---> " +arrayAux.get(indiceEliminar).getTitulo());

                            arrayAux.remove(indiceEliminar);
                            maxNota = 0;
                        }
                        while(arrayAux.isEmpty() == false);
                    }
                }
                break;
        }
    }

    public static void editarInfo(ArrayList<Pelicula> arrayPeliculas){

        Scanner tecladoN = new Scanner(System.in);

        System.out.println();
        GestoraEjercicioPropio.mostrarListaPeliculas(arrayPeliculas);

        System.out.print("Introduzca el indice de la película que quiere editar: ");
        arrayPeliculas.get(tecladoN.nextInt()-1).editarInfo();

    }

}
