public class Guerrera extends Personaje {

    public Guerrera(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (!estaVivo()) {
            System.out.println(getNombre() + " está derrotada.");
            return;
        }

        if (!objetivo.estaVivo()) {
            System.out.println(
                objetivo.getNombre() + " ya fue derrotado."
            );
            return;
        }

        System.out.println(
            getNombre() + " ataca con su espada a "
            + objetivo.getNombre() + "."
        );

        objetivo.recibirDanio(20);
    }
}
