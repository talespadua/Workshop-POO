/**
 * Created by tales.cpadua on 4/29/2015.
 */
public class Npc extends Personagem{
    private int estupidez;

    Npc(String nome, int posX, int posY, int estupidez){
        super(nome, posX, posY);
        this.estupidez = estupidez;
    }

    public int getEstupidez(){
        return this.estupidez;
    }

    public void souEstupido(){
        if(this.estupidez > 10){
            System.out.println("Meu nome é " + this.nome + ", e eu sou estúpido");
        }
        else{
            System.out.println("Meu nome é " + this.nome + ", e eu sou inteligentão");
        }
    }
    public void printName(){
        super.printName();
        this.souEstupido();
    }

    public void souEstupido(int negacaoDaEstupidez){
        int estupidezPercebida = this.estupidez - negacaoDaEstupidez;
        if(estupidezPercebida > 10){
            System.out.println("Meu nome é " + this.nome + ", e eu sou estúpido");
        }
        else{
            System.out.println("Meu nome é " + this.nome + ", e eu sou inteligentão");
        }
    }
}
