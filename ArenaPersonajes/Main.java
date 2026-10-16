public class Main {

    public static void main(String[] args) {

        System.out.println("=== ARENA DE PERSONAJES ===\n");

        Personaje guerrera = new Guerrera("Lexia guerrera", 100);
        Personaje maga = new Maga("Moon maga", 100);
        Personaje arquera = new Arquera("Fiona arquera", 100);

        // Mostrar personajes iniciales
        System.out.println("Personajes creados:");
        mostrarEstado(guerrera);
        mostrarEstado(maga);
        mostrarEstado(arquera);

        // Combate
        System.out.println("\n=== COMIENZA EL COMBATE ===\n");

        guerrera.atacar(maga);

        System.out.println();

        maga.atacar(guerrera);

        System.out.println();

        arquera.atacar(maga);

        // Estado final
        System.out.println("\n=== ESTADO FINAL ===");

        mostrarEstado(guerrera);
        mostrarEstado(maga);
        mostrarEstado(arquera);
    }

    public static void mostrarEstado(Personaje personaje) {
        System.out.println(
            personaje.getNombre()
            + " | Vida: " + personaje.getVida()
            + " | Vivo: " + personaje.estaVivo()
        );
    }
}
