/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class PruebaEstudiantes {

    public static void main(String[] args) {


        Estudiantes el = new Estudiantes();
        el.setNombre("Miguel");
        el.setApellido("Herrera");
        el.setDir("Loja");
        el.setLugNac("Catacocha");
        el.setEdad(20);
        
        System.out.println(el.getNombre());
        System.out.println(el.getApellido());
        System.out.println(el.getDir());
        System.out.println(el.getLugNac());
        System.out.println(el.getEdad());
    }
}
