/*
 * Copyright (C) 2022 Karsten Reincke, Deutsche Telekom AG
 *
 * tdosca-tc13.main is licensed under the terms of the MIT license.
 * For details see the file LICENSE the top directory.
 */

package tdosca.tc13;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  private static final Logger log = LogManager.getLogger(Main.class);

  public static void main(String[] args) {
    Greeter greeter = new Greeter();

    System.out.println("tdosca.tc13.Main: 'hello'.");
    System.out.println("license(Main,M.I.T)");

    if ((args == null) || (args.length == 0)){
      greeter.speak();
    }
    else {
      greeter.speak(args[0]);
    }


    log.trace("Example Trace Message");
    log.debug("Example Debugging Message");
    log.info("Example Informational message");
    log.warn("Example Warning Message");
    log.error("Example Error Message");

    System.out.println("tdosca.tc13.Main: 'bye bye'");
  }
}
