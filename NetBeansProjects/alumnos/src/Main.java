import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Declaraciones de variables
        int numeroAlumnos = 0;
        
        //Inicializaciones
        Scanner teclado = new Scanner(System.in);
        
        Asignatura As1 = new Asignatura("Programacion", "1DAW");
        Asignatura As2 = new Asignatura("Base de datos", "1DAW");
        Asignatura As3 = new Asignatura("FOL", "1DAW");
        Asignatura As4 = new Asignatura("Entorno de desarrollo", "1DAW");
        Asignatura As5 = new Asignatura("Sistemas", "1DAW");
        
        System.out.print("Por favor introduzca la cantidad de alumnos: ");
        numeroAlumnos = teclado.nextInt();
        Alumno[] arrayAlumnos = new Alumno[numeroAlumnos];
        
        for(int i=0; i<=arrayAlumnos.length-1; i++){
            
            Alumno alumno = new Alumno();
            
            String nombre;
            String apellidos = "";
            String direccion = "";
            String curso = "";
            String telefono = "";
            
            int notaAs1 = 0;
            int notaAs2 = 0;
            int notaAs3 = 0;
            int notaAs4 = 0;
            int notaAs5 = 0;
            
            System.out.println();
            
            System.out.print("Introduzca el nombre del " +(i+1) +"º alumno: ");
            nombre = teclado.nextLine();
            alumno.setNombre(nombre);
            
            teclado.next();
            
            System.out.print("Introduzca los apellidos del " +(i+1) +"º alumno: ");
            apellidos = teclado.nextLine();
            alumno.setApellidos(apellidos);
            
             teclado.next();
             
            System.out.print("Introduzca la direccion del " +(i+1) +"º alumno: ");
            direccion = teclado.nextLine();
            alumno.setDireccion(direccion);
            
            teclado.next();
             
            System.out.print("Introduzca el curso del " +(i+1) +"º alumno: ");
            curso = teclado.nextLine();
            alumno.setCurso(curso);
            
            teclado.next();
             
            System.out.print("Introduzca el  telefono del " +(i+1) +"º alumno: ");
            telefono = teclado.nextLine();
            alumno.setTelefono(telefono);
            
            teclado.next();
            
            System.out.print("Introduzca la nota de la 1ª asignatura: ");
            notaAs1 = teclado.nextInt();
            alumno.getAs1().setNota1Eva(notaAs1);
             
            System.out.print("Introduzca la nota de la 2ª asignatura: ");
            notaAs2 = teclado.nextInt();
            alumno.getAs2().setNota1Eva(notaAs2);
            
            System.out.print("Introduzca la nota de la 3ª asignatura: ");
            notaAs3 = teclado.nextInt();
            alumno.getAs3().setNota1Eva(notaAs3);
             
            System.out.print("Introduzca la nota de la 4ª asignatura: ");
            notaAs4 = teclado.nextInt();
            alumno.getAs4().setNota1Eva(notaAs4);
             
            System.out.print("Introduzca la nota de la 5ª asignatura: ");
            notaAs5 = teclado.nextInt();
            alumno.getAs5().setNota1Eva(notaAs5);
            
            arrayAlumnos[i] = alumno;
        }
        
        for(int i=0; i<=arrayAlumnos.length-1; i++){
            System.out.print(arrayAlumnos[i].getNombre());
            System.out.println(" " +arrayAlumnos[i].getApellidos());
            System.out.println(arrayAlumnos[i].getDireccion());
            System.out.println(arrayAlumnos[i].getCurso());
            System.out.println(arrayAlumnos[i].getTelefono());
            System.out.println(arrayAlumnos[i].getAs1().getNota1Eva());
            System.out.println(arrayAlumnos[i].getAs2().getNota1Eva());
            System.out.println(arrayAlumnos[i].getAs3().getNota1Eva());
            System.out.println(arrayAlumnos[i].getAs4().getNota1Eva());
            System.out.println(arrayAlumnos[i].getAs5().getNota1Eva());
        }
        
    }
}
