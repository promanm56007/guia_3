import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Supermercado

{
  String nombre="Santa Fe";
  String localidad="Fontibón";
    
    
    public static void main(String [] args)
    {
         int opcion;
         int contador=1;
         boolean mantener=true;
         String nombre;
         String departamento;
         String posicion;
         int salario;
         ArrayList <Empleado>empleados=new ArrayList();
         
         
         
        // asociar teclado al programa
        Scanner teclado = new Scanner(System.in);
        while(mantener)
        {
          System.out.println("0.agregar trabajador");    
          System.out.println("1.departamento del Empleado");
          System.out.println("2.Cargo del Empleado");
          System.out.println("3.Mostrar Informacion de todos");
          System.out.println("4.salir del progama");   
          opcion = teclado.nextInt();
          
          switch(opcion)
          
           {
              case 0:
              
                System.out.println("ingrese el nombre del empleado   : "+ contador);
                nombre = teclado.next();
                contador++;  
                System.out.println("ingrese departamento del empleado   :");
                departamento = teclado.next();
                System.out.println("ingrese posicion del empleado   :");
                posicion = teclado.next();
                System.out.println("ingrese salario del empleado   :");
                salario = teclado.nextInt();
                empleados.add(new Empleado(nombre,departamento,posicion,salario));
                break;
                
                case 1:
                
                System.out.println("ingrese el nombre del empleado   : ");
                nombre = teclado.next();
                
                
                for (Empleado a : empleados)
                {
                    if (a.getNombre().equals(nombre))
                    {
                       System.out.println("Empleados:  "+a.getNombre()+"departamento  "+a.getDepartamento());
                    
                    }
                 }
               break;
               
               case 2:
                
                System.out.println("ingrese el nombre del empleado : ");
                nombre = teclado.next();
                
                for (Empleado a : empleados)
                {
                    if (a.getNombre().equals(nombre))
                    {
                       System.out.println("Empleados:  "+a.getNombre()+"posicion  "+a.getPosicion());
                    
                    }
                 }
               break;
               
               case 3:
               
                for (Empleado a : empleados)
                {
                    
                       System.out.println("Nombre:  "+a.getNombre()+"departamento  "+a.getDepartamento()+"posicion  "+a.getPosicion()+"salario  "+a.getSalario());
                    
                    
                }
                break;
                
                case 4:
                
                mantener=false;
                break;
                default:
                 System.out.println("ingreso mal la opcion");
        }   
    }
}
}   
 