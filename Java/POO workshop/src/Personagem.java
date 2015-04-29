public class Personagem{
    /****Atributos***/
    public int numVidas = 2;
    public String nome;
    public static int velocidade = 5;
    private int posX;
    private int posY;

    /****Métodos*****/
    public void moveLeft(int velocidade){
        posX -= velocidade;
    }

    public void moveRigth(int velocidade){
        posX += velocidade;
    }

    Personagem(String nome, int posX, int posY){
        this.nome = nome;
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX(){
        return this.posX;
    }

    public int getPosY(){
        return this.posY;
    }

    public void printName(){
        System.out.println("My name is: " +this.nome);
        System.out.println("I have "+this.numVidas + " lifes");
    }

    public void setVidas(int numVidas){
        this.numVidas = numVidas;
    }
}