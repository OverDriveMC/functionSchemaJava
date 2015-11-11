package com.mblinn.mbfpp.oo.command;

import java.util.ArrayList;
import java.util.List;

public class PurchaseInvoker {
	private List<Command> executedPurchases=new ArrayList<Command>();
	public void executePurchase(Command purchase){
		purchase.execute();
		executedPurchases.add(purchase);
	}
	public List<Command> getExecutedPurchases() {
		return executedPurchases;
	}
	
	
	
}
