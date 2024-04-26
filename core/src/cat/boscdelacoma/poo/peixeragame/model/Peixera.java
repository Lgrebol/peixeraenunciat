package cat.boscdelacoma.poo.peixeragame.model;

import java.util.ArrayList;
import java.util.List;

public class Peixera {
    private final int WIDTH;
    private final int HEIGHT;
    private List<Peix> peixos;

    public Peixera(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.peixos = new ArrayList<>();
    }
    public void esborrarPeix(Peix peix) {
        peixos.remove(peix);
    }
    
    public void afegir(Peix peixosNous ) {
        peixos.add(peixosNous);
    }
    
    public void afegir(List<Peix> peixosNous ) {
        for( Peix peix : peixosNous){
            peixos.add(peix);
        }
                
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
