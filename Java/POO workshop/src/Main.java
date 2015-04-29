/**
 * Created by tales.cpadua on 4/28/2015.
 */

public class Main {
    public static void main(String[] args){
        Personagem manolo = new Personagem("Manolo", 0, 1);
        Personagem mauricio = new Personagem("mauricio", 10, 11);

        Npc jebediah = new Npc("Jebediah", 5, 5, 100);

        manolo.printName();
        mauricio.printName();
        jebediah.printName();

        jebediah.souEstupido(99);
    }
}
