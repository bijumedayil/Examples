
package com.cluster;

import com.cluster.Account;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class TransactionDemo {
	public static void main(String[] args) {
		
			Account acc= new Account();
			acc.transfer(11,33,5000);
			System.out.println("End of main program");
	}
}
