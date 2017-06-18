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
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Investimentos f = InvestimentosEnum.FUNDOS.criarInvestimento();
        
        System.out.println("Fundos");
        System.out.println("Valor Investido: "+f.getValor());
        System.out.println("Redimento ao mês: "+f.getRendimento());
        System.out.println("Imposto Debitados: "+f.getImposto());
        System.out.println("---------------------------");
        
        Investimentos p = InvestimentosEnum.POUPANCA.criarInvestimento();
        
        System.out.println("Poupança");
        System.out.println("Valor Investido: "+p.getValor());
        System.out.println("Redimento ao mês: "+p.getRendimento());
        System.out.println("Imposto Debitados: "+p.getImposto());
        System.out.println("---------------------------");
        
        Investimentos r = InvestimentosEnum.RENDAFIXA.criarInvestimento();
        
        System.out.println("Renda Fixa");
        System.out.println("Valor Investido: "+r.getValor());
        System.out.println("Redimento ao mês: "+r.getRendimento());
        System.out.println("Imposto Debitados: "+r.getImposto());
        System.out.println("---------------------------");
             
    }
    
}
