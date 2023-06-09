import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbol;
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();

        a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
        a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
        a = ArbolBinario.nuevoArbol(a1, "Mauro", a2);
        pila.insertar(a);
        
        a1 = ArbolBinario.nuevoArbol(null, "Gabriel", null);
        a2 = ArbolBinario.nuevoArbol(null, "Abel", null);
        a = ArbolBinario.nuevoArbol(a1, "M Jesus", a2);
        pila.insertar(a);
       
        a2 = (Nodo) pila.quitar();
        a1 = (Nodo) pila.quitar();
        
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
        //arbol = new ArbolBinario(a); no se usa en ningun lado

        System.out.println("********************");
        System.out.println("ARBOL BINARIO CREADO");
        System.out.println("********************");
        System.out.println("");
        System.out.println("******************");
        System.out.println("RECORRIDO PREORDEN");
        System.out.println("******************");
        System.out.println("");
        ArbolBinario.preorden(a);
        System.out.println("");
    }
        
}
