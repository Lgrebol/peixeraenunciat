package cat.boscdelacoma.poo.peixeragame.model;

import java.util.ArrayList;
import java.util.List;

public class Peixera {
    private static Peixera instance;
    private final int WIDTH;
    private final int HEIGHT;
    private List<Peix> peixos;

    public Peixera(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.peixos = new ArrayList<>();
    }

    public static Peixera getInstance() {
        if (instance == null) {
            instance = new Peixera(50, 50);
        }
        return instance;
    }

    public int getPeixosNous() {
        return peixos.size();
    }

    public int getParelles() {
        int parelles = 0;
        for (int i = 0; i < peixos.size() - 1; i++) {
            for (int j = i + 1; j < peixos.size(); j++) {
                if (peixos.get(i).esParella(peixos.get(j))) {
                    parelles++;
                }
            }
        }
        return parelles;
    }

    public void esborrarPeix(Peix peix) {
        peixos.remove(peix);
    }

    public void afegir(Peix peix) {
        peixos.add(peix);
    }

    public int getAmplada() {
        return WIDTH;
    }

    public int getAlt() {
        return HEIGHT;
    }

    public List<Peix> getPeixos() {
        return peixos;
    }
}
