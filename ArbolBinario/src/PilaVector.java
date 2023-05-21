import java.util.Vector;

public class PilaVector {

    private static final int INICIAL = 19;
    private int cima;
    private Vector listaPila;

    public PilaVector() {
        cima = -1;
        listaPila = new Vector(INICIAL);
    }

    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.addElement(elemento);//añade un elemento a continuacion del ultimo
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        aux = listaPila.elementAt(cima);//obtiene el elemento en una posicion determinada
        listaPila.removeElementAt(cima);//elimina un elemento
        cima--;
        return aux;
    }

    public Object cimaPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacía, no se puede extraer.");
        }
        return listaPila.elementAt(cima);
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) {
            quitar();
        }
    }
}
