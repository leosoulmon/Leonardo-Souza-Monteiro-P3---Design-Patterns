/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author Usuário
 */
public class Investimentos {
    private double valor;
    private double rendimento;
    private double imposto;

    public Investimentos(double valor, double rendimento, double imposto) {
            this.valor = valor;
            this.rendimento = rendimento;
            this.imposto = imposto;
    }

    public double getValor() {
            return valor;
    }

    public double getRendimento() {
            return (rendimento/100)*valor;
    }

    public double getImposto() {
            return (imposto/100)*valor;
    }
}
