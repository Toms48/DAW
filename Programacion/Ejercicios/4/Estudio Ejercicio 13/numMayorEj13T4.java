//Escribe un programa que ordene tres números enteros 

import java.util.Scanner;

public class numMayorEj13T4{
	
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Vamos a ver los numeros ordenados de mayor a menor. \n\n\n");
    
    int mayor=0;
    int medio=0;
    int menor=0;
    
    System.out.print("Introduce el primer numero: ");
    int num1 = s.nextInt();
    
    System.out.print("\nIntroduce el segundo numero: ");    
    int num2 = s.nextInt();    
    
    System.out.print("\nIntroduce el tercer numero: ");
    int num3 = s.nextInt();    

    if ((num1>=num2)&& (num1>=num3)){
      mayor=num1;
      if (num2>=num3){
        medio=num2;
        menor=num3;
        }else{
          medio=num3;
          menor=num2;
          }
      }else if((num2>num1)&&(num2>num3)){
      mayor=num2;
        if(num1>=num3){
          medio=num1;
          menor=num3;
          }else{
            medio=num3;
            menor=num1;
            }
      }else{
        mayor=num3;
        if(num1>=num2){
          medio=num1;
          menor=num2;
          }
          else{
            medio=num2;
            menor=num1;
            }
        }
   
    System.out.println(mayor+" "+medio+" "+menor);
	}
}

