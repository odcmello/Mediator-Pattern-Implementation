/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author UFSM
 */
public class vendedorAmericanoColleague extends Colleague {

    public vendedorAmericanoColleague(Mediator m) {
        super(m);
    }

    public boolean receberOferta(double valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendedor aceita oferta de: " + valor + " dolares?");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("S")) {
            System.out.println("Proposta aceita!");
            return true;
        } 
        else if(input.equalsIgnoreCase("N")){
            System.out.println("Proposta rejeitada, tente aumentar o valor!");
            return false;
        }
        System.out.println("Valor inválido, finalizando execução.");
        exit(0);
        return false;
    }

}
