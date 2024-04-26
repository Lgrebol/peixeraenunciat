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

        public Peix(float x, float y,Peixera peixera) {
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

        }

        Peix getPare() {
            return null;
        }

        public void setMare(Peix mare) {
        }

        Peix getMare() {
            return null;
        }

        public void setBody(Body body) {
            this.body = body;
        }

        public void updateVelocity() {
            this.getBody().setLinearVelocity(0,5);
        }

        public Body getBody() {
            return body;
        }
    }