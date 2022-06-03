
public class Robo {
    private int posX, posY;
    private char direcao;
    private int maxX, maxY;

    public Robo(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        direcao = 'N';
    }

    public Robo(int maxX, int maxY, int posX, int posY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.posX = posX;
        this.posY = posY;
        direcao = 'N';
    }

    public String mostrarPosicao() {
        return posX + ", " + posY + " : " + direcao;
    }

    public void girarPara(char direcao) {
        if (direcao == 'N' || direcao == 'S' || direcao == 'L' || direcao == 'O') {
            this.direcao = direcao;
        }
    }

    public void andar() {
        switch (direcao) {
            case 'N':
                if (posY < maxY) {
                    posY++;
                }
                break;
            case 'S':
                if (posY > -maxY) {
                    posY--;
                }
                break;
            case 'L':
                if (posX < maxX) {
                    posX++;
                }
                break;
            case 'O':
                if (posX > -maxX) {
                    posX--;
                }
                break;
        }
    }
}