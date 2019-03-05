package BoletinPOO2.Ej2.Main;

import BoletinPOO2.Ej2.Clases.Bicicleta;
import BoletinPOO2.Ej2.Clases.Coche;
import BoletinPOO2.Ej2.Clases.Vehiculo;

import java.util.Scanner;

public class MainEj2 {
    public static void main(String[] args){

        //Declaración de variables
        int opcionMenu = 0;
        int kilometrosAndados = 0;
        String kmString = "";

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        Coche coche1 = new Coche();
        Bicicleta bici1 = new Bicicleta();

        do{
            do{
                System.out.print("VEHÍCULOS" +
                                "\n=========" +
                                "\n1. Anda con la bicicleta" +
                                "\n2. Haz el caballito con la bicicleta" +
                                "\n3. Anda con el coche" +
                                "\n4. Quema rueda con el coche" +
                                "\n5. Ver kilometraje de la bicicleta" +
                                "\n6. Ver kilometraje del coche" +
                                "\n7. Ver kilometraje total" +
                                "\n8. Salir" +
                                "\nElige una opción (1-8): ");
                opcionMenu = teclado.nextInt();
            }
            while(opcionMenu<1 || opcionMenu>8);

            switch(opcionMenu){
                case 1:
                    System.out.println();
                    System.out.print("Introduzca los kilometros recorridos con la bicicleta: ");
                    kilometrosAndados = teclado.nextInt();
                    System.out.println();

                    bici1.andar(kilometrosAndados);
                break;

                case 2:
                    bici1.hacerCaballito();
                break;

                case 3:
                    System.out.println();
                    System.out.print("Introduzca los kilometros recorridos con el coche: ");
                    kilometrosAndados = teclado.nextInt();
                    System.out.println();

                    coche1.andar(kilometrosAndados);
                break;

                case 4:
                    coche1.quemarRueda();
                break;

                case 5:
                    bici1.mostrarKilometrosRecorridos();
                break;

                case 6:
                    coche1.mostrarKilometrosRecorridos();
                break;

                case 7:
                    Vehiculo.mostrarKilometrosTotales();
                break;
            }
        }
        while(opcionMenu!=8);

        System.out.println();
        System.out.println("Ashta luego!");
        System.out.println();
    }
}
