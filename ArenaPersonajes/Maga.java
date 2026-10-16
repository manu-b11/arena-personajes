public class Maga extends Personaje {

    public Maga(String nombre, int vida) {
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
            getNombre() + " lanza un hechizo contra "
            + objetivo.getNombre() + "."
        );

        objetivo.recibirDanio(30);
    }
}
