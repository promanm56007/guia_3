
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    // instance variables - replace the example below with your own
    String nombre;
    String raza;
    String localidad;
    double cedula;
    double telefono;
    double dias_asistencia;
    String nombre_dueño;
    
    /**
     * Constructor for objects of class Perro
     */
    public Perro(String nombre, String raza, String localidad, String nombre_dueño, double cedula, double telefono, double dias_asistencia)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.raza = raza;
        this.localidad = localidad;
        this.nombre_dueño = nombre_dueño;
        this.cedula = cedula;
        this.telefono = telefono;
        this.dias_asistencia = dias_asistencia;
    }

     
    
     public static void main(String[] args) {
        int opcion ;
        int contador = 1;
        boolean mantener = true;
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String raza;
        String localidad; 
        String nombre_dueño;
        double cedula;
        double telefono; 
        double dias_asistencia;
        ArrayList <Perro> perros = new ArrayList ();
        ArrayList <Perro> teusaquillo = new ArrayList();
        ArrayList <Perro> suba = new ArrayList();
        ArrayList <Perro> usaquen = new ArrayList();
        ArrayList <Perro> chapinero = new ArrayList();
        ArrayList <Perro> otros = new ArrayList();
      
        while(mantener){
        
        System.out.println("1. Crear Un Perro");
        System.out.println("2. Mostrar Todos Los Perros y Sus Datos");
        System.out.println("3. Agrupar Perros Por Localidad");
        System.out.println("4.salir del progama");
        
        opcion = teclado.nextInt(); 
                
        switch(opcion){
            
            case 1:
                System.out.println("ingrese Nombre del Perro  : "+ contador);
                 nombre = teclado.next();
                contador++;  
                System.out.println("ingrese Raza Del Perro   :");
                 raza = teclado.next  ();
                System.out.println("ingrese Localidad Del Perro :");
                 localidad = teclado.next  ();
                System.out.println("ingrese Nombre del Dueño Del Perro  :");
                 nombre_dueño= teclado.next  ();   
                 System.out.println("ingrese Cédula del Dueño del Perro  :");
                 cedula = teclado.nextDouble();
                System.out.println("ingrese Días de Asistencia Del Perro  :");
                 dias_asistencia = teclado.nextDouble();
                 System.out.println("ingrese Teléfono del Dueño del Perro  :");
                 telefono = teclado.nextDouble();
                 perros.add(new Perro(nombre,raza,localidad,nombre_dueño,cedula,telefono,dias_asistencia));
                break;
                
            case 2:
               for (Perro p: perros)
               {
                 System.out.println("Nombre Del Perro  :" + p.nombre   + "Raza Del Perro   :" + p.raza  +"La Localidad del Perro   :" +p.localidad + "Dueño Del Perro   :" + p.nombre_dueño + "Cédula Del Dueño   :" + p.cedula +"Dias de Asistencia Del Perro   :" + p.dias_asistencia + "Teléfono Del Dueño   :" + p.telefono);  
                   
               }
              
               break;
               
            case 3:
            
            System.out.println("Perros Agrupados Por Localidad   :");
            
            for (Perro p: perros)
               {
                 
                 
                 
                 if (p.localidad.equals("teusaquillo"))
                 {
                     teusaquillo.add(p);
                     
                 }
                 
                 else if (p.localidad.equals("suba"))
                 {
                   suba.add(p); 
                    
                 }
                 
                 else if (p.localidad.equals("usaquen"))
                 {
                   usaquen.add(p); 
                    
                 }
                 
                 else if (p.localidad.equals("chapinero"))
                 {
                   chapinero.add(p); 
                    
                 }
                 
                 else 
                 {
                   otros.add(p); 
                    
                 }
                 
               }
               
               for (Perro i: teusaquillo)
               
               {
                System.out.println("Nombre Perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
                
                for (Perro i: suba)
               
               {
                System.out.println("Nombre Perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
               
                for (Perro i: usaquen)
               
               {
                System.out.println("Nombre Perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
               
                for (Perro i: chapinero)
               
               {
                System.out.println("Nombre Perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
               
               System.out.println("Perros con Localidades Invalidas");
               
               for (Perro i: otros)
               
               {
                System.out.println("Nombre Perro   :" + i.nombre  + "Localidad   :" + i.localidad);
                
               }
                break;
            case 4:
              mantener = false;  
              break ;           
            default: 
                 System.out.println("ingreso mal la opcion");
        
        }
        }
    }
    
}
