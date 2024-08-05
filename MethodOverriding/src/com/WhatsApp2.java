package com;

public class WhatsApp2 extends WhatsApp1 {
	@Override
	void sendMessage() {
		super.sendMessage();
		System.out.println("Double Tick Supported ");
	}

}
