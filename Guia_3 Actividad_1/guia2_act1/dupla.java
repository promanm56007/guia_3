
/**
 * Write a description of class guia2_act1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dupla
{
    
    private int[] dupla = new int [2];
    
    public int[] lee()
    
    {
        
        return dupla;        
        
    }
    
    
    public void guardar (int a, int b)
    
    {
    
      dupla[0] = a;
      dupla[1] = b;    
    
    }
    
    public dupla (){}
    public static void main(String [] args)
    
    {
    
    int []arreglo;    
    dupla primerpar = new dupla();
    primerpar.guardar(12,32);
    arreglo = primerpar.lee();
    System.out.println("El Valor del Primer Par es   " + arreglo[0]+","+arreglo[1]);
    
    
    }
}
