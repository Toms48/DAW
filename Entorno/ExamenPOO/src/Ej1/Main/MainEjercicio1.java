package Ej1.Main;

import Ej1.Clases.Campana;
import Ej1.Clases.Piano;
import Ej1.Enums.Nota;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MainEjercicio1 {
	public static void main(String[] args){
		
		//Declaraciones de varaibles
		
		//Inicializaciones
		Campana campana = new Campana();
		Piano piano = new Piano();
		
		//Inicio
			//Agragar notas a la campana
			campana.agregarNota(Nota.DO);
			campana.agregarNota(Nota.SI);
			campana.agregarNota(Nota.SOL);
			campana.agregarNota(Nota.RE);
			
			//Interpretar con la campana
			campana.interpretar();
			
			System.out.println();
			
			//Agregar notas al piano
			piano.agregarNota(Nota.MI);
			piano.agregarNota(Nota.MI);
			piano.agregarNota(Nota.FA);
			piano.agregarNota(Nota.SOL);
			piano.agregarNota(Nota.SOL);
			piano.agregarNota(Nota.FA);
			
			piano.agregarNota(Nota.MI);
			piano.agregarNota(Nota.RE);
			piano.agregarNota(Nota.DO);
			piano.agregarNota(Nota.DO);
			piano.agregarNota(Nota.RE);
			
			piano.agregarNota(Nota.MI);
			piano.agregarNota(Nota.MI);
			
			piano.agregarNota(Nota.FA);
			piano.agregarNota(Nota.FA);
			
			System.out.println();
			
			//Interpretar con el piano
			piano.interpretar();
		
		//Fin
		
	}
}
