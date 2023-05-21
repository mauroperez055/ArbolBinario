public class Nodo {

    public Object dato;
    public Nodo izdo;
    public Nodo dcho;

    public Nodo(Object valor) {
        dato = valor;
        izdo = null;
        dcho = null;
    }

    public Nodo(Nodo izdo, Object dato, Nodo dcho) {
        this.dato = dato;
        this.izdo = izdo;
        this.dcho = dcho;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }

    void visitar() {
        System.out.println("");
        System.out.println(dato + " ");
    }

}
