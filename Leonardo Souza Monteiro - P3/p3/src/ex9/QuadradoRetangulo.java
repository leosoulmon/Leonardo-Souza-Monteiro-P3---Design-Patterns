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
public class QuadradoRetangulo implements Forma {
    QuadradoRetangulo(){}
    @Override
    public void calculavel() {
            System.out.println("Oi, eu sou um Figura.");
    }

    @Override
    public void incalculavel() {
            System.out.println("Figura inexistente");
    }
}
