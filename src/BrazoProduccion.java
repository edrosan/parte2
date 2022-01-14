public class BrazoProduccion implements Runnable{
    private String id;
    private int numPiezas;
    private Contenedor contenedorA;
    private Contenedor contenedorB;
    private String mensaje;

    public BrazoProduccion(String id, int numPiezas, Contenedor contenedorA, Contenedor contenedorB){
        this.id = id;
        this.numPiezas = numPiezas;
        this.contenedorA = contenedorA;
        this.contenedorB = contenedorB;
    }

    @Override
    public void run() {
        for(int i = 1; i <= numPiezas; i++){
            if(contenedorA.descargarUnaPieza() && contenedorB.descargarUnaPieza()){
                System.out.println("Brazo "+id+": ha descargado una pieza del contenedor "+contenedorA.getId());
                System.out.println("Brazo "+id+": ha descargado una pieza del contenedor "+contenedorB.getId());
                System.out.println("Brazo "+id+": ha montado su producto "+i+" de "+numPiezas);
            }
        }
    }
}
