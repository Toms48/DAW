/* Nombre: Comercial
 *
 * Básicas:
 * 		- comision 	=> double => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej2.Clases;

public class Comercial extends Empleado {

    //Atributos
    private double comision;

    //Constructor por defecto
    public Comercial(){
        super();
        comision = 0;
    }

    //Constructor con parámetros
    public Comercial(String nombre, int edad, double salario, double comision){
        super(nombre, edad, salario);
        this.comision = comision;
    }

    //Gets
    public double getComision() {
        return comision;
    }

    //Sets
    public void setComision(double comision) {
        this.comision = comision;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = super.toString() +"\n" +
                "Comision: " +getComision() +"€";

        return s;
    }

    //Métos añadidos
    @Override
    public void plus(){
        if(super.getEdad()>30 && getComision()>200){
            System.out.println("Salario actual de " +super.getNombre() +": " +super.getSalario() +"€");

            super.setSalario(super.getSalario() + super.getPLUS());

            System.out.println("Salario de " +super.getNombre() +" sumando " +super.getPLUS() +"€ de plus: " +super.getSalario() +"€");
        }
        else{
            System.out.println("No reune las condiciones para el plus de sueldo");
        }
    }

}
