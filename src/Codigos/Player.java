package Codigos;

public class Player extends Personagem{
    String nome;
    
    public Player(String nome, int atq, int vida) {
        super(atq, vida);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
}
