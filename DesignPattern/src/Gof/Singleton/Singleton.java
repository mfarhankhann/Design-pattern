/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Singleton;

/**
 *
 * @author fa20-bse-069
 */
public class Singleton {

  /**
   * Holds reference to single instance.
   */
  private static Singleton INSTANCE;

  /**
   * Overrides public Constructor.
   */
  private Singleton() {
  }

  /**
   * Creates the instance if it does not yet exist(lazy instantiation).
   *
   * @return a reference to the single instance.
   */
  public static Singleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Singleton();
    }
    return INSTANCE;
  }
}