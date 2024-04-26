package cat.boscdelacoma.poo.peixeragame.model;

/**
 *
 * @author Sergi
 */

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;

public class Peix {
    private float x;
    private float y;
    private int width;
    private int height;
    private Direccio direccio;
    private Peixera peixera;
    private Sprite sprite;
    private Body body;
    private Peix pare;
    private Peix mare;

    public Peix(int x, int y,Peixera peixera) {
        setX(x);
        setY(y);
        setPeixera(peixera);
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

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    public boolean esParella(Peix get){
        return false;
    }

    public void canviDireccio() {
        switch (this.direccio) {
            case DRETA:
                this.direccio = Direccio.ESQUERRA;
                break;
            case ESQUERRA:
                this.direccio = Direccio.DRETA;
                break;
            case AMUNT:
                this.direccio = Direccio.AVALL;       
                break;
            case AVALL:
                this.direccio = Direccio.AMUNT;
                break;
            default:
                break;
        }
            
        
    }

    void setHeigh(int i) {
        this.height = i;
    }

    public void setPare(Peix pare) {
        this.pare = pare;
    }

    Peix getPare() {
        return pare;
    }

    public void setMare(Peix mare) {
        this.mare = mare;
    }

    Peix getMare() {
        return mare;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void updateVelocity() {
        this.getBody().setLinearVelocity(0,5);
    }

    public Body getBody() {
        return this.body;
    }
    public boolean esNou() {
    // Verificar si el peix tiene un cuerpo asociado
    return this.getBody() == null;
}

    
}

