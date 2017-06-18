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
public enum Fabricante {
    NIKE{
        @Override
        public Bola criarBola() {
                return new BolaNike("Nike", "Nikoboco", "Azul", "Capão");
        }
    }, 
    PUMA{
        @Override
        public Bola criarBola() {
                return new BolaPuma("Puma", "Pola", "Preta e Branca", "PVC");
        }
    }, 
    ADIDAS{
        @Override
        public Bola criarBola() {
                return new BolaAdidas("Adidas", "Ardida", "Preta e Amarela", "Fibra de carbono moléculoflexível");
        }
    };
    
    //AbstractFactory
    public abstract Bola criarBola();
}
