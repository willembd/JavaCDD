package atleta;

public class Corredor extends Atleta {

    public Corredor(String nome, int idade) {
        super(nome, idade);
    }

    public void correr() {
        System.out.println(nome + " está correndo!!");
    }

    public void pararCorrer() {
        System.out.println(nome + " parou de correr!!");
    }
}
