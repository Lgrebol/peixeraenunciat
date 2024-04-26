/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.boscdelacoma.poo.peixeragame.model;

/**
 *
 * @author Sergi
 */
public class PeixMascle extends Peix {

    public PeixMascle(int x, int y, Direccio direccio, Peixera peixera) {
        super(x, y, peixera);
        setDireccio(direccio);
    }

    public PeixMascle(int x, int y, Peixera peixera) {
        super(x,y,peixera);
    }

}
