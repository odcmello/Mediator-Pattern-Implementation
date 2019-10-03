/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UFSM
 */
public class comunicacaoMediator implements Mediator {

    protected ArrayList<Colleague> vendedores;
    protected ArrayList<Colleague> compradores;
    protected ArrayList<Colleague> conversores;

    public comunicacaoMediator() {
        vendedores = new ArrayList<Colleague>();
        compradores = new ArrayList<Colleague>();
        conversores = new ArrayList<Colleague>();
    }

    public void adicionarVendedor(Colleague colleague) {
        vendedores.add(colleague);
    }
    
    public void adicionarComprador(Colleague colleague) {
        compradores.add(colleague);
    }
    
    public void adicionarConversor(Colleague colleague) {
        conversores.add(colleague);
    }
    
    public boolean proporOferta(double quantia, String unidade, Colleague comprador, vendedorAmericanoColleague vendedor) {
        quantia = conversorDolar(quantia, unidade);
        return vendedor.receberOferta(quantia);   
    }
    
    public double conversorDolar(double quantia, String unidade){
        if(unidade.equals("real")){
            return (quantia * 4.16);
        }
        else if(unidade.equals("euro")){
            return (quantia * 0.92);
        }
        return 0;
    }

}
