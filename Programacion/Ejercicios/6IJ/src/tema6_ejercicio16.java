import java.util.Scanner;

public class tema6_ejercicio16 {

	static String verde = "\033[32m";
	static String naranja = "\033[33m";
	static String blanco = "\033[37m";
	static String rojo = "\033[31m";

	public static void main(String[] args) {	
	
		System.out.println("Tema 6. Ejercicio 16: Maquina tragaperras");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		//Figuras
		String[] variables = {"corazon", "diamante", "herradura", "campana", "limon"};
		String[] corazon = {"  ,--.  ,--.  ", " (    )(    ) ", "  *.      .*  ", "    *.  .*    ", "      \\/      "};
		String[] diamante = {"  __________  ", " / / /  \\ \\ \\ ", " \\ \\      / / ", "   \\      /   ", "     \\  /     "};
		String[] herradura = {" |_ |   | _| ", "  / /   \\ \\  ", " | |     | | ", "  \\ \\___/ /  ", "   \\_____/   "};
		String[] campana = {"     .--.     ", "    /    \\    ", "   /      \\   ", "  /        \\  ", " /__________\\ "};
		String[] limon = {"    .----.    ", "   /      \\   ", "  *        *  ", "   \\      /   ", "    `----*    "};

		//Variables auxiliares
		int monedas = 10;
		String respuesta_usuario = "";
		String literal_auxiliar = "";
		
		//Literales
		System.out.println("##########################################\n####### Bienvenido a TragaMonedas ########\n############## Monedas: " + naranja + monedas + blanco + " ###############\n##########################################\n");
		System.out.println("Para tirar, escriba lo que sea y pulse intro. \nPara dejar de jugar, escriba 'e' y pulse intro.\n\nBuena suerte!\n\n");
		respuesta_usuario = scan.next();

		//Ciclo de vida de la tragaperras
		while(!respuesta_usuario.equals("e") && monedas > 0)
		{
			//Generamos aleatorios y canjeamos las monedas
			monedas--;
			int rail_1 = (int)(Math.random()*5);
			int rail_2 = (int)(Math.random()*5);
			int rail_3 = (int)(Math.random()*5);
			
			//Literales
			if(monedas == 1){literal_auxiliar = "Le queda " + naranja + monedas + " moneda " + blanco +"   ###~";} else if (monedas >= 1 && monedas < 10) {literal_auxiliar = "Le quedan " + naranja + monedas + " monedas" + blanco + "  ###~";} else {literal_auxiliar = "Le quedan " + naranja + monedas + " monedas" + blanco + " ###~";}
			System.out.println("\n\n~########################################~\n~### " + rojo + "-1 Moneda" + blanco + " ~ " + literal_auxiliar + "\n~########################################~\n\n");
			
			//Imprimimos las figuras por partes según los aleatorios generados
			for(int i=0; i<5; i++){
				switch(rail_1) {
					case 0:
					System.out.print(corazon[i]);
					break;
					case 1:
					System.out.print(diamante[i]);
					break;
					case 2:
					System.out.print(herradura[i]);
					break;
					case 3:
					System.out.print(campana[i]);
					break;
					case 4:
					System.out.print(limon[i]);
					break;
				}
				switch(rail_2) {
					case 0:
					System.out.print(corazon[i]);
					break;
					case 1:
					System.out.print(diamante[i]);
					break;
					case 2:
					System.out.print(herradura[i]);
					break;
					case 3:
					System.out.print(campana[i]);
					break;
					case 4:
					System.out.print(limon[i]);
					break;
				}
				switch(rail_3) {
					case 0:
					System.out.print(corazon[i]);
					break;
					case 1:
					System.out.print(diamante[i]);
					break;
					case 2:
					System.out.print(herradura[i]);
					break;
					case 3:
					System.out.print(campana[i]);
					break;
					case 4:
					System.out.print(limon[i]);
					break;
				}
				System.out.println();
			}
			
			//Alinea 3
			if((rail_1 == rail_2) && (rail_2 == rail_3)) {
				System.out.println();
				System.out.println("Enhorabuena, tres iguales, USTED GANA ~ " + verde + "+10 monedas" + blanco);
				monedas = monedas + 10;
				System.out.println("Monedas ahora: " + monedas);
				System.out.println();
			}
			
			//Alinea 2
			else if((rail_1 == rail_2) || (rail_2 == rail_3) || (rail_1 == rail_3)) {
				System.out.println();
				System.out.println("Enhorabuena, dos iguales ~ " + verde + "+1 moneda" + blanco);
				monedas++;
				System.out.println("Monedas ahora: " + monedas);
			} else {
				if(monedas <= 0){ System.out.println(rojo + "\nTe has quedado sin credito, vuelve cuando tengas dinero que perder xD" + blanco); }
			}

			System.out.println("\n~########################################~\n");
			respuesta_usuario = scan.next();
		}
	}
}
