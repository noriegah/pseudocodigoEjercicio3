import java.util.*;

public class Practica3 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num;
    int facto=1;
    System.out.println("Ingrese un Valor");
    num=scanner.nextInt();
    if (num>=0){
        for (int i=1;i<=num;i++){
            facto=facto*i;
        }
        System.out.println("El factorial de "+num+" es "+facto);
    }else {
        System.out.println(num+" No tiene factorial");
    }
}
}