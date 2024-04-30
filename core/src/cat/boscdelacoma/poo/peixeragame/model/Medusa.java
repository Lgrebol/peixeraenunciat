package cat.boscdelacoma.poo.peixeragame.model;

import static cat.boscdelacoma.poo.peixeragame.model.Direccio.AMUNT;
import static cat.boscdelacoma.poo.peixeragame.model.Direccio.AVALL;
import static cat.boscdelacoma.poo.peixeragame.model.Direccio.DRETA;
import static cat.boscdelacoma.poo.peixeragame.model.Direccio.ESQUERRA;
import static cat.boscdelacoma.poo.peixeragame.model.Peix.VELOCITAT;
import cat.boscdelacoma.poo.peixeragame.physics.PeixeraModel;

/**
 * Classe que representa una medusa a la peixera
 * 
 * @author Marc Nicolau
 */
public class Medusa extends Peix {

    public Medusa(int x, int y, Peixera peixera) {
        super(x, y, peixera);
    }

    @Override
    public void updateVelocity() {

        if (this.direccio == Direccio.AVALL) {
            if (getBody().getPosition().y + sprite.getHeight() < 4) {
                setDireccio(Direccio.ESQUERRA);
                getBody().setLinearVelocity(-VELOCITAT, 0);

            } else {
                getBody().setLinearVelocity(0, -VELOCITAT);
            }
        } else if (this.direccio == Direccio.AMUNT) {
            if (getBody().getPosition().y + sprite.getHeight() > PeixeraModel.WORLD_HEIGHT) {
                setDireccio(Direccio.DRETA);
                getBody().setLinearVelocity(VELOCITAT, 0);

            } else {
                getBody().setLinearVelocity(0, VELOCITAT);
            }
        } else if (this.direccio == Direccio.DRETA) {

            if (getBody().getPosition().x + sprite.getWidth() > PeixeraModel.WORLD_WIDTH) {
                setDireccio(Direccio.AVALL);
                getBody().setLinearVelocity(0, -VELOCITAT);

            } else {
                getBody().setLinearVelocity(VELOCITAT, 0);
            }

        } else if (this.direccio == Direccio.ESQUERRA) {
            if (getBody().getPosition().x + sprite.getWidth() < 4) {
                setDireccio(Direccio.AMUNT);
                getBody().setLinearVelocity(0, VELOCITAT);

            } else {
                getBody().setLinearVelocity(-VELOCITAT, 0);
            }

        }
    }
        
    @Override
    public void canviDireccio() {
        switch (this.direccio) {
            case DRETA:
                this.direccio = Direccio.AVALL;
                break;
            case ESQUERRA:
                this.direccio = Direccio.AMUNT;
                break;
            case AMUNT:
                this.direccio = Direccio.DRETA;       
                break;
            case AVALL:
                this.direccio = Direccio.ESQUERRA;
                break;
            default:
                break;
        }
    }
}