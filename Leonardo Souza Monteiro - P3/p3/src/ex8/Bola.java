/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author Usuário
 */
public class Bola {
    
    //cores, materiais e nomes diferentes
    private String fabricante;
    private String nome;
    private String cor;
    private String material;
    
     public Bola(String fabricante, String nome, String cor, String material) {
            this.fabricante = fabricante;
            this.nome = nome;
            this.cor = cor;
            this.material = material;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getMaterial() {
        return material;
    }

    
}
