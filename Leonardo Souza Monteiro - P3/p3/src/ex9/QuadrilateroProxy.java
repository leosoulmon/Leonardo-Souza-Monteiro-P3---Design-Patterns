/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

/**
 *
 * @author Usuário
 */
public class QuadrilateroProxy implements Forma{
    private Forma f;
    private int lado1;
    private int lado2;
    public QuadrilateroProxy(int lado1, int lado2){
        //VIRIA DO BANCO
        if(lado1 > 0 && lado2 > 0){
                f = new QuadradoRetangulo();
        } else{
                f = new Figurainexistente();
        }
    }
        
    @Override
    public void calculavel() {
            f.calculavel();
    }

    @Override
    public void incalculavel() {
            f.incalculavel();
    }
}
