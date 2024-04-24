package cat.boscdelacoma.poo.peixeragame.model;

import java.util.ArrayList;
import java.util.List;

public class Peixera {
    private static Peixera instance;
    private final int WIDTH;
    private final int HEIGHT;
    private List<Peix> peixos;

    private Peixera(int width, int height) {
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
        // Implementació per calcular el nombre de parelles
        return parelles;
    }

    public void esborrarPeix() {
        // Implementació per esborrar un animal
    }

    public void afegirPeix() {
        // Implementació per afegir un animal
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

    public void afegir(Peix peix) {
        peixos.add(peix);
    }

    public void esborrarPeix(Peix peix) {
        peixos.remove(peix);
    }
}
