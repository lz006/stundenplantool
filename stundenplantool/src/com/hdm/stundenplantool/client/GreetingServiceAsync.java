package com.hdm.stundenplantool.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.hdm.stundenplantool.shared.businessobject.Dozent;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(Dozent input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
