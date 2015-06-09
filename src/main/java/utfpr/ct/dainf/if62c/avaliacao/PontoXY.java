/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1658930
 */
public class PontoXY extends Ponto2D {
    
    private double x, y;
    
    public PontoXY () {
        x=0;
        y=0;
    }
    
    public PontoXY (double x, double y) {
        this.x=x;
        this.y=y;
    }
    
    public String toString(Ponto p) {
        return p.getNome()+"("+x+", "+y+")";
    }
}
