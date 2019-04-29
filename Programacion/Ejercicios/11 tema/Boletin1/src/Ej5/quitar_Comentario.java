package Ej5;

import java.io.*;
import java.util.ArrayList;

public class quitar_Comentario {
    public static void main(String args[]){

        //Declaraciones de variables
        //int contador = -1;
        char letraAntigua = ' ';
        char letra = ' ';

        int posicionCorte = 0;

        boolean encontrado = false;

        //Inicializaciones
        ArrayList<String> lineasPrograma = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            String linea = br.readLine();

            while(linea != null){
                //contador++;
                lineasPrograma.add(linea);
                //System.out.println(lineasPrograma.get(contador));	//Código para ver que muestra bien cada una de las líneas
                linea = br.readLine();
            }



            for(int i=0; i<=lineasPrograma.size()-1; i++){
                //System.out.println(i);
                for(int j=0; j<=lineasPrograma.get(i).length()-1 && encontrado==false; j++){
                    letra = lineasPrograma.get(i).charAt(j);

                    if(letraAntigua == '/' && letra == '/'){
                        encontrado = true;
                        posicionCorte = j-1;
                        //System.out.println(lineasPrograma.get(i).substring(posicionCorte));
                        lineasPrograma.set(i, lineasPrograma.get(i).replaceAll(lineasPrograma.get(i).substring(posicionCorte), ""));
                        //System.out.println(lineasPrograma.get(i));
                    }

                    letraAntigua = letra;
                }
                 encontrado = false;
            }

            for(String dato : lineasPrograma){
                //System.out.println(dato);	//Prueba para ver si lo hace todo correctamente sin bucles infinitos
                bw.write(dato);
                bw.newLine();
            }

            br.close();
            bw.close();

        }
        catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el archivo");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
