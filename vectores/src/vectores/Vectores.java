/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectores;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author vesprada
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    
    public static void inicializar(int v[]){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Asigna cinco valores al vector: ");
        System.out.println("--------------------------------");
        for(int x=0;x<=4;x++){
           System.out.print("Valor para la posicion "+(x+1)+ ": "); 
           v[x]=leer.nextInt();
        }
        System.out.println();
        
    }
    
    public static void imprimir(int v[]){
        
        System.out.print("· Contenido del vector: ");
        
        for(int x=0;x<=4;x++){
            if(x==4){
                System.out.print(v[4]);
            }else{
            System.out.print(v[x]+", ");
        }
        }
        System.out.println();
    }
    
    public static void maximo(int v[]){
        
        int numMayor = v[0];
        
        for (int x=1;x<v.length;x++){
        
            if(v[x]>numMayor){
            numMayor = v[x];
            
        }
        }
        System.out.println("· El valor mayor es: "+numMayor);
    }
    
    public static void minimo(int v[]){
        
       int numMenor = v[0];
        
        for (int x=1;x<v.length;x++){
        
            if(v[x]<numMenor){
            numMenor = v[x];
            
        }
        }
        System.out.println("· El valor menor es: "+numMenor); 
        
    }
    
    public static boolean iguales(int v[], int b[]){
        
     boolean igualdad = Arrays.equals(v, b);
  
     if(igualdad==true){
         
         System.out.println("· Los vectores son iguales");
         
     }else{
         
         System.out.println("· Los vectores son diferentes");
         
     }
     
     return false;
          
    }
    
    public static boolean palindromo(int v[]){

       String aux="";
       
       for(int x=0;x<v.length;x++){

           aux=v[x]+aux;

        }
        
        String frase = aux;
        String fraseinvertida;
        
        StringBuilder voltear = new StringBuilder(frase);

	fraseinvertida = voltear.reverse().toString();

	if(frase.equals(fraseinvertida)){
		System.out.println("· Es palindromo");
	}else{
		System.out.println("· No es palindromo");
        }
     return false;
        
    }
    
    public static int[] ordenar(int v[]){
       
       for(int i=1; i<v.length;i++){
           for(int j=0;j<v.length-i;j++){
               
               if(v[j]>v[j+1]){
                   int aux;
                   aux=v[j];
                   v[j]=v[j+1];
                   v[j+1]=aux;
                   
               }
           }
           
       }
       
       System.out.print("· Vector ordenado: ");
       
       for(int j=0;j<v.length;j++){
            if(j==4){
                System.out.print(v[4]);
            }else{
            System.out.print(v[j]+", ");
        }
        }
        System.out.println();
       
        return null;
        
    }
    
    public static double media(int v[]){
        
        double suma=0;
        
        for(int x=0;x<v.length;x++){
            
            suma+=v[x];
        }
        
        double total=suma/5;
        
        System.out.println("· La media es: "+total);
        
        return total;
  
    }
    
    public static int[] copiar(int v[]){
       
        int b[] =new int[5];
        
        for(int x=0;x<v.length;x++){
            b[x]=v[x];
        }
        
        System.out.print("· Vector original: ");
        
        for(int x=0;x<v.length;x++){
            if(x==4){
                System.out.print(v[4]);
            }else{
            System.out.print(v[x]+", ");
        }
        }
        
        System.out.println();
        
        System.out.print("· Vector copiado: ");
        
        for(int y=0;y<b.length;y++){
            if(y==4){
                System.out.print(b[4]);
            }else{
            System.out.print(b[y]+", ");
        }
        }
        
        System.out.println();
        
    return null;
        
    }
    
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
        
       int opcion;
       
       int v[] =new int[5];
       
       inicializar(v);

       System.out.println("Elige una opcion:");
       System.out.println("-----------------");
       System.out.println("1. Imprimir");
       System.out.println("2. Maximo");
       System.out.println("3. Minimo");
       System.out.println("4. Comprobar si son iguales");
       System.out.println("5. Comprobar si es palindromo");
       System.out.println("6. Ordenar");
       System.out.println("7. Obtener la media");
       System.out.println("8. Copiar");
       System.out.println("-----------------");
       System.out.println("9. Salir");
       System.out.println();
       
       do{
           
       opcion=leer.nextInt();

       switch(opcion){
       
       case 1:
               imprimir(v);
               System.out.println();
       break;
       case 2:
               maximo(v);
               System.out.println();
       break;
       case 3:
               minimo(v);
               System.out.println();
       break;
       case 4:
               int b[] =new int[5];
        
               System.out.println("Asigna cinco valores al segundo vector: ");
               System.out.println("--------------------------------");
               for(int x=0;x<=4;x++){
               System.out.print("Valor para la posicion "+(x+1)+ ": "); 
               b[x]=leer.nextInt();
               }
               System.out.println();
               iguales(v,b);
               System.out.println();
       break;
       case 5:
               palindromo(v);
               System.out.println();
       break;
       case 6:
               ordenar(v);
               System.out.println();
       break;
       case 7:
               media(v);
               System.out.println();
       break;
               
       case 8:
               copiar(v);
               System.out.println();
       break;
       }
       if(opcion!=9){
       System.out.println("¿Que accion deseas realizar ahora?");
       System.out.println();
       }
       }while(opcion!=9);
        
        
        
    }
    
}
