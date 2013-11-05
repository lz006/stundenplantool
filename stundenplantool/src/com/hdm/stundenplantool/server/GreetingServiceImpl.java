package com.hdm.stundenplantool.server;

import com.hdm.stundenplantool.client.GreetingService;
import com.hdm.stundenplantool.server.db.DozentMapper;
import com.hdm.stundenplantool.shared.FieldVerifier;
import com.hdm.stundenplantool.shared.businessobject.Dozent;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {
	
	
	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid. 
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException(
					"Name must be at least 4 characters long");
		}
		
		//Erzeugung einer DozentMapper-Instanz um Dozenten-Objekte aus und in die DB abzubilden
		DozentMapper dozentTest = DozentMapper.dozentMapper();
		
		//Anlegen eines Dozenten in die DB
		dozentTest.insertIntoDB(new Dozent(11112, input, input));

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);
		
		

		return "Hello, " + input +"!<br><br>I am running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent;
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}

	
}
