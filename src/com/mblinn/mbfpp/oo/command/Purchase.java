package com.mblinn.mbfpp.oo.command;

public class Purchase implements Command{
	private CashRegister cashRegister;
	private Integer amount;

	public Purchase(CashRegister cashRegister, Integer amount) {
		super();
		this.cashRegister = cashRegister;
		this.amount = amount;
	}

	@Override
	public void execute() {
		cashRegister.addCash(amount);
	}

}
