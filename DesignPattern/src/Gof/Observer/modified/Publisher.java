/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Observer.modified;

/**
 *
 * @author fa20-bse-069
 */
public interface Publisher {
	void subsrcibe(Gof.Observer.Example.Subscriber s);
	void unSubsrcibe(Gof.Observer.Example.Subscriber s);
	void notifySubscribers();
}