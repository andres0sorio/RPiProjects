/** Copyright or License
 *
 */

package com.aosorio.nginx;

/**
 * Package: com.aosorio.nginx
 *
 * Class: Main Main.java
 * 
 * Original Author: @author AOSORIO
 * 
 * Description: [one line class summary]
 * 
 * Implementation: [Notes on implementation]
 *
 * Created: Jul 1, 2016 12:09:16 AM
 * 
 */
import static spark.Spark.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		InetAddress ip;
		try {

			ip = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ip.getHostAddress());
			get("/hello", (req, res) -> "Nginx test: " + ip.getHostAddress());
			
		} catch (UnknownHostException e) {

			e.printStackTrace();

		}

		
	}

}
