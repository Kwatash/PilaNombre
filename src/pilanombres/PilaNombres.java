package pilanombres;
import java.util.Stack;
/**
 *
 * @author Omarsito
 */
public class PilaNombres {
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push("Paco");
        pila.push("Taco");
        pila.push("Macho");
        pila.push("LunaBella");
        pila.push("AlexMarin");
        pila.push("Cumexis");
        pila.pop();
        System.out.println("EL ultimo nombre es: " + pila.peek());
        pila.push("Rondamon");
        pila.pop();
        pila.pop();
        System.out.println("El ultimo nombre es: " + pila.peek());
        while(pila.empty()==false)
        {
            System.out.println(pila.pop());
        }
    }
    
}
