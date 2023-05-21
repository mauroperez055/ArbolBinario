import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbol;
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();

        a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
        a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);

        try {
            pila.insertar(a);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        a1 = ArbolBinario.nuevoArbol(null, "Gabriel", null);
        a2 = ArbolBinario.nuevoArbol(null, "Abel", null);
        a = ArbolBinario.nuevoArbol(a1, "M Jesus", a2);

        try {
            pila.insertar(a);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            a2 = (Nodo) pila.quitar();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            a1 = (Nodo) pila.quitar();
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
        arbol = new ArbolBinario(a);

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
