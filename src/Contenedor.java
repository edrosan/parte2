public class Contenedor {
    private  int piezasTotales;
    private int piezas;
    private String id;

    public Contenedor(int piezas, String id){
        this.piezas = piezas;
        this.piezasTotales = piezas;
        this.id = id;
    }

    public synchronized boolean descargarUnaPieza(){
        if(piezas > 0){
            piezas--;
            return true;
        }
        return false;
    }

    public String getId() {
        return id;
    }

    public int getPiezas() {
        return piezas;
    }

    public int getPiezasTotales() {
        return piezasTotales;
    }
}
