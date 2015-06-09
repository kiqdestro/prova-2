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
public class Poligonal {
    
    int n;
    
    public Poligonal (int n) {
        if (n<2) {
            throw new RuntimeException(
                "Poligonal deve ter ao menos 2 vértices.");
        }
    this.n=n;
    }
    double vertices[];
    
    public int getN() {
        return this.n;
    }
            
}
