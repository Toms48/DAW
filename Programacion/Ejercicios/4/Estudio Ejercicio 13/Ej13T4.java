//Escribe un programa que ordene tres n�meros enteros introducidos por teclado.

import java.util.Scanner;

public class Ej13T4{
  public static void main (String[]args){
    System.out.println("Bienvenido al programa que ordena de mayor a menor n�meros enteros");
    System.out.println();
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca el primer n�mero");
    int n1 = s.nextInt();

    
    System.out.println("\nIntroduzca el segundo n�mero");
    int n2 = s.nextInt();

    
    System.out.println("\nIntroduzca el tercer n�mero");
    int n3 = s.nextInt();

    
    if ((n1>n2)&&(n1>n3)&&(n2>n3)){
      System.out.println("\nEl orden es: "+n1+ ", " +n2+ " y " +n3);
      }
      else if ((n1>n2)&&(n1>n3)&&(n3>n2)){
        System.out.println("\nEl orden es: "+n1+ ", " +n3+ " y " +n2);
      }
        else if ((n2>n1)&&(n2>n3)&&(n1>n3)){
          System.out.println("\nEl orden es: "+n2+ ", " +n1+ " y " +n3);
        }
          else if ((n2>n1)&&(n2>n3)&&(n3>n1)){
            System.out.println("\nEl orden es: "+n2+ ", " +n3+ " y " +n1);
          }
            else if ((n3>n1)&&(n3>n2)&&(n1>n2)){
              System.out.println("\nEl orden es: "+n3+ ", " +n1+ " y " +n2);
            }
                else if ((n3>n1)&&(n3>n2)&&(n2>n1)){
                  System.out.println("\nEl orden es: "+n3+ ", " +n2+ " y " +n1);
                }
                  else{
                    System.out.println("Recuerde que los n�meros deben ser distintos");
                    }
    }
}

