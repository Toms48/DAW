/* Nombre: Tiempo
 *
 * Básicas:
 * 		- horas		=> int => Consultable y Modificable
 * 		- minutos   => int => Consultable y Modificable
 * 	    - segundos  => int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones:
 *      - Si los segundos superan los 59 (no se incluye el 59, [0-59]) se sumará 1 minuto
 *      - Si los minutos superan los 59 (no se incluye el 59, [0-59]) se sumará 1 hora
 */

package BoletinPOO2.Ej6.Clases;

public class Tiempo {

    //Atributos
    private int hora;
    private int minuto;
    private int segundo;

    //Constructor por defecto
    public Tiempo(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    //Constructor con parámetros
    public Tiempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Gets
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //Sets
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    //Métodos sobrescritos
    @Override
    public String toString(){

        String s = getHora() +"h " +getMinuto() +"m " +getSegundo() +"s";

        return s;
    }

    //Métodos añadidos
    public String suma(Tiempo tiempo){

        Tiempo tiempoFinal = new Tiempo();

        do{
            if(this.segundo + tiempo.getSegundo() >= 60){
                tiempoFinal.setMinuto(tiempoFinal.getMinuto() + 1);
                tiempoFinal.setSegundo(tiempoFinal.getSegundo() + (this.segundo + tiempo.getSegundo()) - 60);
            }
            else{
                tiempoFinal.setSegundo(tiempoFinal.getSegundo() + tiempo.getSegundo());
            }
        }
        while(tiempoFinal.getSegundo() >= 60);

        do{
            if(this.minuto + tiempo.getMinuto() >= 60){
                tiempoFinal.setHora(tiempoFinal.getHora() + 1);
                tiempoFinal.setMinuto(tiempoFinal.getMinuto() + (this.minuto + tiempo.getMinuto()) - 60);
            }
            else{
                tiempoFinal.setMinuto(tiempoFinal.getMinuto() + tiempo.getMinuto());
            }
        }
        while(tiempoFinal.getMinuto() >= 60);

        tiempoFinal.setHora(tiempoFinal.getHora() + this.hora + tiempo.getHora());

        String suma = tiempoFinal.hora +"h " +tiempoFinal.minuto +"m " +tiempoFinal.segundo +"s";

        return suma;
    }

    public String resta(Tiempo tiempo){

        int segundo3 = 0;
        int minuto3 = 0;
        int hora3 = 0;

        if(this.segundo - tiempo.getSegundo() <= 0){
            segundo3 = 0;
        }
        else{
            segundo3 = this.segundo - tiempo.getSegundo();
        }

        if(this.minuto - tiempo.getMinuto() <= 0){
            minuto3 = 0;
        }
        else{
            minuto3 = this.minuto - tiempo.getMinuto();
        }

        if(this.hora - tiempo.getHora() <= 0){
            hora3 = 0;
        }
        else {
            hora3 = this.hora - tiempo.getHora();
        }

        Tiempo tiempoFinal = new Tiempo(segundo3,minuto3,hora3);

        String resta = tiempoFinal.hora +"h " +tiempoFinal.minuto +"m " +tiempoFinal.segundo +"s";

        return resta;
    }

}
