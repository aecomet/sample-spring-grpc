package org.example;

/** A simple class that says hello. */
public class Hello {
  /**
   * Say hello to the user.
   *
   * @param msg The user's name.
   * @return A greeting.
   */
  public String sayHello(String msg) {
    return String.format("Hello %s!", msg);
  }
}
