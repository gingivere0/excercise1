package edu.elon.test;

import junit.framework.TestCase;

public class ATMTest extends TestCase {

	public void testATMDouble() {
		ATM testATM = new ATM();
		testATM.deposit(15);
		ATM testATM2 = new ATM(15);
		assertEquals(testATM.getBalance(),testATM2.getBalance());
	}

	public void testDeposit() {
		ATM testATM = new ATM();
		testATM.deposit(15);
		assertEquals(15.0,testATM.getBalance());
	}

	public void testGetBalance() {
		ATM testATM = new ATM(15);
		assertEquals(15.0,testATM.getBalance());
	}

	public void testToString() {
		ATM testATM = new ATM(15);
		assertEquals("Amount balance is $15.00",testATM.toString());
	}


	public void testWithdraw() {
		ATM testATM = new ATM(15);
		assertEquals(5.0,testATM.withdraw(5));
	}
	
	public void testWithdrawException(){
		ATM testATM = new ATM(15);
		try{
			testATM.withdraw(20);
		}catch (IllegalArgumentException e){
			assertTrue(true);
		}
	}

}
