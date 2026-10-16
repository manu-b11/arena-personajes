public abstract class Personaje {

    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void recibirDanio(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("El daño debe ser positivo.");
            return;
        }

        vida -= cantidad;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(
            nombre + " recibe " + cantidad + " puntos de daño."
        );

        System.out.println("Vida restante: " + vida);

        if (vida == 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract void atacar(Personaje objetivo);
}
