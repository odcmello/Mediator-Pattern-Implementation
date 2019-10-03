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
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator m) {
		mediator = m;
	}
        
        public boolean propor(double valor, String unidade, vendedorAmericanoColleague vendedor){
		return mediator.proporOferta(valor, unidade, this, vendedor);
        }
        
}


