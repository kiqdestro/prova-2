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
public class PontoXZ extends Ponto2D {
    
    private double x, z;
    
    public PontoXZ () {
        x=0;
        z=0;
    }
    
    public PontoXZ (double x, double z) {
        this.x=x;
        this.z=z;
    }
    
    public String toString(Ponto p) {
        return p.getNome()+"("+x+", "+z+")";
    }
    
}
