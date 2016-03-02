package org.demo.web.actions ;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nanoj.web.tinymvc.GenericAction;

public class WelcomeAction extends GenericAction {

	// The default action
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		return "index" ; // index.jsp
		
	}

	// Specific action
	public String doSomething(HttpServletRequest request, HttpServletResponse response) {
		
		return "index" ; // index.jsp
		
	}
	
}
