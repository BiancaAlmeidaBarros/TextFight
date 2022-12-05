package Codigos;

public class Possibilidades {

    Inimigo inim;
    Player Play;

    public Possibilidades(Inimigo inim, Player Play) {
        this.inim = inim;
        this.Play = Play;
    }

    public int playerAtaca(int vPA, int aPA) {
            vPA -= aPA;
            return vPA;
    }

    public int inimigoAtaca(int vIA, int aIA) {
            vIA -= aIA;
            return vIA;
   

    }

}
