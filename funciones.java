import java.util.Scanner;

public class funciones {
    float numero1;
    float numero2;
    float suma;
    float resta;
    float multiplicacion;
    float division;
    float modulo;
    
 public void Leer_Numeros () {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digita Numero1:");
        numero1= entrada.nextInt();
        System.out.print("Digita Numero2:");
        numero2= entrada.nextInt();
    } 
 
 public void Suma (){
suma = numero1 + numero2;
System.out.println("La suma de los dos numeros es: " + suma);

}
 
  public void Resta (){
resta = numero1 - numero2;
System.out.println("La resta de los dos numeros es: " + resta);

}
  
  
   public void Multi (){
multiplicacion = numero1 * numero2;
System.out.println("El resultado de la multiplicacion de los dos numeros es: " + multiplicacion);

}
   
    public void Div (){
division = numero1 / numero2;
System.out.println("El resultado de la division de los dos numeros es: " + division);

}
    
     public void Modulo (){
modulo = numero1 % numero2;
System.out.println("Modulo de los dos numeros: " + modulo);

}
    
    
}