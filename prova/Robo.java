
public class Robo {
    private int posX, posY;
    private Direcao direcao;
    private Arena arena;

    public Robo(Arena arena) {
        this.arena = arena;
        direcao = Direcao.NORTE;
    }

    public Robo(Arena arena, int posX, int posY) {
        this.arena = arena;
        this.posX = posX;
        this.posY = posY;
        direcao = Direcao.NORTE;
    }

    public String mostrarPosicao() {
        return posX + ", " + posY + " : " + direcao;
    }

    public void girarPara(Direcao direcao) {
        this.direcao = direcao;
    }

    public boolean andar() {
        switch (direcao) {
            case NORTE:
                return moverNorte();
            case SUL:
                return moverSul();
            case LESTE:
                return moverLeste();
            case OESTE:
                return moverOeste();
            default:
                return false;
        }
    }

    private boolean moverSul() {
        if (posY > -arena.getMaxY()) {
            posY--;
            return true;
        }
        return false;
    }

    private boolean moverNorte() {
        if (posY < arena.getMaxY()) {
            posY++;
            return true;
        }
        return false;
    }

    private boolean moverLeste() {
        if (posX < arena.getMaxX()) {
            posX++;
            return true;
        }
        return false;
    }

    private boolean moverOeste() {
        if (posX > -arena.getMaxX()) {
            posX--;
            return true;
        }
        return false;
    }

}