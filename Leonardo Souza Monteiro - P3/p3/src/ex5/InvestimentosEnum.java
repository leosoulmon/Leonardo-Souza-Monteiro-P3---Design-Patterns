/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author Leonardo Souza Monteiro
 */
public enum InvestimentosEnum {
    FUNDOS{
        @Override
        public Investimentos criarInvestimento() {
                return new Fundos(200, 0.9, 0);
        }
    }, 
    POUPANCA{
        @Override
        public Investimentos criarInvestimento() {
                return new Poupanca(1500, 0.5, 3);
        }
    }, 
    RENDAFIXA{
        @Override
        public Investimentos criarInvestimento() {
                return new RendaFixa(200, 0.8, 10);
        }
    };
    
    //AbstractFactory
    public abstract Investimentos criarInvestimento();
}
