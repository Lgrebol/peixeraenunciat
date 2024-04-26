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
    static final float VELOCITAT = 6;

    public Peix(int x, int y,Peixera peixera) {
        setX(x);
        setY(y);
        setPeixera(peixera);
    }

    public float getX() {
        if (getBody() != null)
            return getBody().getPosition().x;
        return x;
    }

    public void setX(float x) {
        this.x = x;
        if (body != null) {
            body.getPosition().x = x;
            updateVelocity();
        }
    }

    public float getY() {
        if (getBody() != null)
            return getBody().getPosition().y;
        return y;
    }

    public void setY(float y) {
        this.y = y;
        if (body != null) {
            body.getPosition().y = y;
            updateVelocity();
        }
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
        if(direccio == Direccio.AVALL) {
            if (getBody().getPosition().y + sprite.getHeight() < 8){
                setDireccio(Direccio.AMUNT);
                getBody().setLinearVelocity(0, VELOCITAT);
            } else {
                getBody().setLinearVelocity(0, -VELOCITAT);
                
            }
        } else if (direccio == Direccio.AMUNT) {
            if (getBody().getPosition().y + sprite.getHeight() < 8){
                setDireccio(Direccio.AVALL);
                getBody().setLinearVelocity(0, -VELOCITAT);
            } else {
                getBody().setLinearVelocity(0, VELOCITAT);
                
            }
            
        }else if (direccio == Direccio.ESQUERRA) {
            if (getBody().getPosition().x + sprite.getWidth() < 8){
                setDireccio(Direccio.DRETA);
                getBody().setLinearVelocity(VELOCITAT, 0);
            } else {
                getBody().setLinearVelocity(-VELOCITAT, 0);
                
            }
        } else if (direccio == Direccio.DRETA) {
            if (getBody().getPosition().x + sprite.getWidth() < 8){
                setDireccio(Direccio.ESQUERRA);
                getBody().setLinearVelocity(-VELOCITAT, 0);
            } else {
                getBody().setLinearVelocity(VELOCITAT, 0);
                
            }
        }
    }
    public Body getBody() {
        return this.body;
    }
        
}

