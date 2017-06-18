/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author Leonardo Souza Monteiro
 */
public class ex8 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola n = Fabricante.NIKE.criarBola();
        
        System.out.println("Fabricante: "+n.getFabricante());
        System.out.println("Nome: "+n.getNome());
        System.out.println("Cor: "+n.getCor());
        System.out.println("Material: "+n.getMaterial());
        System.out.println("---------------------------");
        
        Bola a = Fabricante.ADIDAS.criarBola();
        
        System.out.println("Fabricante: "+a.getFabricante());
        System.out.println("Nome: "+a.getNome());
        System.out.println("Cor: "+a.getCor());
        System.out.println("Material: "+a.getMaterial());
        System.out.println("---------------------------");
        
        Bola p = Fabricante.PUMA.criarBola();
        
        System.out.println("Fabricante: "+p.getFabricante());
        System.out.println("Nome: "+p.getNome());
        System.out.println("Cor: "+p.getCor());
        System.out.println("Material: "+p.getMaterial());
        System.out.println("---------------------------");
    }
}
