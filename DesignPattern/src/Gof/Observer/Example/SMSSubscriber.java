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
public class SMSSubscriber implements Subscriber{
	String userInfo;
	
	public SMSSubscriber(String userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public void update(String update) {
		System.out.println(this.toString()+": "+update);
		
	}
	@Override
	public String toString() {
		return "SMSSubscriber [userInfo=" + userInfo + "]";
	}
}
