public class ArbolBinario {

    public Nodo raiz;

    public ArbolBinario() {// constructor arbol vacio
        raiz = null;
    }

    public ArbolBinario(Nodo NodoRaiz) {// constructor con nodos
        this.raiz = NodoRaiz;
    }

    public Nodo getNodoRaiz() {
        return raiz;
    }

    // se fija si el arbol esta vacio
    public boolean vacio() {
        return raiz == null;
    }

    // crea un arbol nuevo
    public static Nodo nuevoArbol(Nodo izq, Object dato, Nodo der) {
        return new Nodo(izq, dato, der);
    }

    public static void preorden(Nodo r) {
        if (r != null) {
            r.visitar();
            preorden(r.getDcho());
            preorden(r.getIzdo());
        }
    }

}
