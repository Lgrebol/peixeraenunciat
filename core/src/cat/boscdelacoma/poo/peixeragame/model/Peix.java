package cat.boscdelacoma.poo.peixeragame.model;

/**
 *
 * @author Sergi
 */

import com.badlogic.gdx.graphics.g2d.Sprite;

public class Peix {
    private float x;
    private float y;
    private int width;
    private int height;
    private Direccio direccio;
    private Peixera peixera;
    private Sprite sprite;

    public Peix(float x, float y, Peixera peixera) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direccio = Direccio.DRETA;
        this.peixera = peixera;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Direccio getDireccio() {
        return direccio;
    }

    public void setDireccio(Direccio direccio) {
        this.direccio = direccio;
    }

    public Peixera getPeixera() {
        return peixera;
    }

    public void setPeixera(Peixera peixera) {
        this.peixera = peixera;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    void setPosition(float x, float y) {
        
    }

    void canviDireccio() {
        
    }

    void setHeigh(int i) {
        
    }

    void setPare(Peix pare) {
        
    }

    Peix getPare() {
        return null;
    }

    void setMare(Peix mare) {
    }

    Peix getMare() {
        return null;
    }
}

