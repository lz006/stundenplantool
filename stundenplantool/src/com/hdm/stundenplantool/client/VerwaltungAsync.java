package com.hdm.stundenplantool.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface VerwaltungAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	
	
}
