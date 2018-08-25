import java.util.Scanner;

public class Ascensor {
    //Atributos
    int piso_actual;
    int pisos_edificio;
    int sotanos;
    //Constructor
    public Ascensor(int pisos_edificio , int sotanos, int piso_actual){
       this.pisos_edificio = pisos_edificio;
       this.piso_actual = piso_actual;
       this.sotanos = sotanos ;
    }
   
    public void siguiente_piso_arriba(){
       int piso_siguiente ;
    if(piso_actual < pisos_edificio ){
        if(piso_actual != -1 ){
        piso_siguiente = (piso_actual + 1) ;
        }else{
         piso_siguiente = 1;
        }
         System.out.println("el siguiente piso es  :" + piso_siguiente);
    }else{
         System.out.println("no se puede subir más");
    }   
    }
   
    public void siguiente_piso_abajo(){
    if(piso_actual >(-sotanos)){
        int piso_siguiente;
        if(piso_actual != 1 ){
        piso_siguiente = (piso_actual - 1) ;
        }else{
           piso_siguiente = -1;
        }
        System.out.println("el siguiente piso es  :" + piso_siguiente);
    }else{
         System.out.println("no se puede bajar más");
    }   
    }
   
    public void cuantos_pisos_atiende(){
    int pisos_totales= sotanos + pisos_edificio ;
   
    System.out.println("el numero de pisos que puede atender es  :" + pisos_totales);
   
       
    }
   
    public static void main(String args[]) {
        
    //MENU
    Scanner teclado = new Scanner(System.in);
    int piso_actual= 0;
    int pisos_edificio = 0;
    int sotanos = 0;
    boolean mantener = true;
     int opcion; 
     
     while(mantener){  
        System.out.println("1.crear ascensor");
        System.out.println("2.Hallar piso siguiente arriba");
        System.out.println("3.Hallar piso siguiente abajo");
        System.out.println("4.número de pisos que atiende");
        System.out.println("5.salir");
        
        opcion = teclado.nextInt(); 
        Ascensor ascensor = new Ascensor(pisos_edificio,sotanos,piso_actual);
        switch(opcion){
            case 1:
                System.out.println("ingrese cuantos pisos(sin incluir sotanos) tiene el edificio : ");
                pisos_edificio = teclado.nextInt();
                
                System.out.println("ingrese cuantos sotanos tiene el edificio");
                sotanos = teclado.nextInt();
                
                System.out.println("ingrese el piso actual del ascenor");
                piso_actual = teclado.nextInt();
               
                ascensor.pisos_edificio =  pisos_edificio;
                ascensor.sotanos =   sotanos;
                ascensor.piso_actual =  piso_actual;
                 break;
            case 2:
               ascensor.siguiente_piso_arriba();
            break;
            
            case 3:
               ascensor.siguiente_piso_abajo();   
            break ;
            case 4:
               ascensor.cuantos_pisos_atiende();
            break ;
            case 5:
               mantener = false;   
               break ;
            default: 
                 System.out.println("ingreso mal la opcion");
        
        }
        }
    
    }
    }


