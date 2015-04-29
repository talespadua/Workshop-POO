/**
 * Created by tales.cpadua on 4/28/2015.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("hello World");
        Personagem manolo = new Personagem("Manolo", 0, 1);
        Personagem mauricio = new Personagem("mauricio", 10, 11);

        Npc jebediah = new Npc("Jebediah", 5, 5, 100);
        jebediah.souEstupido();
        jebediah.printName();

        manolo.setVidas(5);
        manolo.printName();
        mauricio.printName();
    }
}
