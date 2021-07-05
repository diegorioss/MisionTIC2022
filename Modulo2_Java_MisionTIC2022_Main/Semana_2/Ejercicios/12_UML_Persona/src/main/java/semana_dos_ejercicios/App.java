//Realice un diagrama de clases en función del registro de personas que a posteriori podrán ser estudiantes o profesores de una institución universitaria (IES).

package semana_dos_ejercicios;
//import Clases.*;

public class App{
    public static void main(String[] args){
        
        Persona p = new Persona();
        Estudiante e = new Estudiante();
        Profesor pro = new Profesor();

        p.setNombre("Jose Luis Perez Portillo");
        p.setEdad(45);

        e.setNombre("Carlos Alfonso Roncancio Pardo");
        e.setLegajo(22);
        e.setCarrera("Ingeniería de sistemas");

        pro.setNombre("Manuel Pepe Grillo");
        pro.setMateria("ARquitectura del computador electrónico II");
        pro.setCargo("Docente Títular III");

        System.out.println("Vamos a imprimir el objeto \"p\" de la clase padre Persona:  ");
        System.out.printf("Nombre: %s,  Edad %d \n", p.getNombre(), p.getEdad());
        
        System.out.print("Vamos a imprimir el objeto \"e\" de la clase hijo Estudiante:  ");
        System.out.printf("\nNombre: %s,  Carrera %s, Legajo %d \n", e.getNombre(), e.getCarrera(), e.getLegajo());

        System.out.print("Vamos a imprimir el objeto \"e\" de la clase hijo Profesor:  ");
        System.out.printf("\nNombre: %s,  Materia %s, Cargo %s \n", pro.getNombre(), pro.getMateria(), pro.getCargo());
    }
}