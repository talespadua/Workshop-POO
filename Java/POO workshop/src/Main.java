/**
 * Created by tales.cpadua on 4/28/2015.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("hello World");
        Personagem manolo = new Personagem("Manolo", 0, 1);
        Personagem mauricio = new Personagem("mauricio", 10, 11);

        manolo.setVidas(5);
        manolo.printName();
        mauricio.printName();
    }
}
