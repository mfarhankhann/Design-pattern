/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Observer.Example;

/**
 *
 * @author fa20-bse-069
 */
public interface Publisher {
	void subsrcibe(Subscriber s);
	void unSubsrcibe(Subscriber s);
	void notifySubscribers();
}