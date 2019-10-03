/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author UFSM
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comunicacaoMediator mediador = new comunicacaoMediator();

        compradorBrasilColleague brasileiro = new compradorBrasilColleague(mediador);
        compradorFrancesColleague frances = new compradorFrancesColleague(mediador);
        vendedorAmericanoColleague americano = new vendedorAmericanoColleague(mediador);

        mediador.adicionarComprador(brasileiro);
        mediador.adicionarComprador(frances);
        mediador.adicionarVendedor(americano);

        System.out.println("Vendendo para Brasileiro");
        double quantia = 12;
        while(!brasileiro.propor(quantia, "real", americano)){
            quantia = quantia + 3;
        }
        
        System.out.println("\nVendendo para Francês");
        quantia = 3;
        while(!frances.propor(quantia, "euro", americano)){
            quantia = quantia + 1.5;
        }
    }

}
