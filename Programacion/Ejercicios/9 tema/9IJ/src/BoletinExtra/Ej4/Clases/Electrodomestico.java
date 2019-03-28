/* Nombre: Electrodomestico
 *
 * Básicas:
 * 		- precioBasa       => double     => Consultable
 *		- color            => String  => Consultable
 *		- consumoElectrico => char       => Consultable
 *		- peso             => int     => Consultable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: El consumo electrico es una letra entre A y F
 */

package BoletinExtra.Ej4.Clases;

import BoletinExtra.Ej4.Enums.enumColor;

public class Electrodomestico {

    //Atributos
    protected double precioBase;
    protected String color;
    protected char consumoElectrico;
    protected int peso;

    //Constructor por defecto
    public Electrodomestico(){
        precioBase = 100;
        color = "blanco";
        consumoElectrico = 'F';
        peso = 5;
    }

    //Constructor con parámetros
    public Electrodomestico(double precioBase, String color, char consumoElectrico, int peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    //Constructor con parámetros (Solo precio y peso)
    public Electrodomestico(double precioBase, int peso){
        this.precioBase = precioBase;
        color = "blanco";
        consumoElectrico = 'F';
        this.peso = peso;
    }

    //Gets
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    //Sets

    //Métodos sobrescritos

    //Métos añadidos
    public void comprobarConsumoEnergetico(char letra){

        int letraAscii = (int)(Character.toUpperCase(letra));

        if(letraAscii>=65 && letraAscii<=70){
            System.out.println("La letra es correcta");
        }
        else{

        }

    }

    public void comprobarColor(String color){

        if(color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")){
            System.out.println("El color es correcto");
        }
        else{

        }

    }

    public double precioFinal(){

        double precioF = this.getPrecioBase();
        int letraAscii = (int)(Character.toUpperCase(consumoElectrico));

        switch (letraAscii){
            case 'A':
                precioF += 100;
                break;

            case 'B':
                precioF += 80;
                break;

            case 'C':
                precioF += 60;
                break;

            case 'D':
                precioF += 50;
                break;

            case 'E':
                precioF += 30;
                break;

            case 'F':
                precioF += 10;
                break;
        }

        if(peso>=0 && peso<=19){
            precioF += 10;
        }
        else{
            if(peso>=20 && peso<=49){
                precioF += 50;
            }
            else{
                if(peso>=50 && peso<=79){
                    precioF += 80;
                }
                else{
                    precioF += 100;
                }
            }
        }

        return precioF;
    }

}
