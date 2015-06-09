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
public class PontoYZ extends Ponto2D {
    
    private double y, z;
    
    public PontoYZ () {
        y=0;
        z=0;
    }
    
    public PontoYZ (double y, double z) {
        this.y=y;
        this.z=z;
    }
    
    public String toString(Ponto p) {
        return p.getNome()+"("+y+", "+z+")";
    }
}
