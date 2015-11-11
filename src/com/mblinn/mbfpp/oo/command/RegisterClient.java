package com.mblinn.mbfpp.oo.command;

import java.util.List;
/*
 * 使用命令模式可以把操作封装起来，然后重现之前的操作
 */
public class RegisterClient {
	private static CashRegister cashRegister=new CashRegister(0);
	private static PurchaseInvoker purchaseInvoker=new PurchaseInvoker();
	
	public static void main(String[] args) {
		Command purchase1=new Purchase(cashRegister, 100);
		Command purchase2=new Purchase(cashRegister,50);
		
		//invoke commands ,check register total
		purchaseInvoker.executePurchase(purchase1);
		purchaseInvoker.executePurchase(purchase2);
		
		System.out.println("After purchases:"+cashRegister.getTotal());
		
		//replay purchases
		cashRegister.reset();
		System.out.println("Register reset to 0");
		List<Command>purchases=purchaseInvoker.getExecutedPurchases();
		for(Command purchase  : purchases){
			purchase.execute();
		}
		System.out.println("After replay:"+cashRegister.getTotal());
	}
}
