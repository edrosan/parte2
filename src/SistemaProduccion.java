public class SistemaProduccion {
    public static void main(String[] args) {
        Contenedor contenedorA = new Contenedor(50, "A");
        Contenedor contenedorB = new Contenedor(50, "B");

        new Thread(new BrazoProduccion("1",25, contenedorA, contenedorB)).start();
        new Thread(new BrazoProduccion("2",25, contenedorB, contenedorA)).start();
    }
}
