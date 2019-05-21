public class Asignatura {
    
    //Atributos
    //private boolean matriculado;
    private String nombre = new String();
    private String curso = new String();
    private int nota1Eva;
    private int nota2Eva;
    private int nota3Eva;
    
    //Constructor con parametros
    public Asignatura(){
        //matriculado = false;
        nombre = "NombreAsignatura";
        curso = "NombreCurso";
        nota1Eva = 0;
    }
    
    //Constructor con parámetros
    public Asignatura(/*boolean matriculado,*/ String nombre, String curso, int nota1Eva, int nota2Eva, int nota3Eva){
        //this.matriculado = matriculado;
        this.curso = curso;
        this.nombre = nombre;
        
        this.nota1Eva = nota1Eva;
        this.nota2Eva = nota2Eva;
        this.nota3Eva = nota3Eva;
    }
    
    public Asignatura(String nombre, String curso){
        this.curso = curso;
        this.nombre = nombre;
        
        nota1Eva = 0;
    }
    
    //GETS
    /*public String getMatriculado() {
        return nombre;
    }*/
    
    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getNota1Eva() {
        return nota1Eva;
    }

    public int getNota2Eva() {
        return nota2Eva;
    }

    public int getNota3Eva() {
        return nota3Eva;
    }
    
    //SETS
    /*public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }*/
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNota1Eva(int nota1Eva) {
        this.nota1Eva = nota1Eva;
    }

    public void setNota2Eva(int nota2Eva) {
        this.nota2Eva = nota2Eva;
    }

    public void setNota3Eva(int nota3Eva) {
        this.nota3Eva = nota3Eva;
    }
    
    //Métodos añadidos
    public double notaMedia(){
        
        double notaMedia = (getNota1Eva()+getNota2Eva()+getNota3Eva())/3;
        
        return notaMedia;
    }
    
    public void muestraNotaMedia(){
        double notaMedia = (getNota1Eva()+getNota2Eva()+getNota3Eva())/3;
        
        System.out.println("La nota media es: " +notaMedia);
    }
    
}
