package org.demo.web.actions ;

import javax.inject.Singleton;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nanoj.web.tinymvc.GenericAction;

@Singleton 
public class XxxYyyAction extends GenericAction {

	private final static String VIEW = "xxx" ;

	// The default action
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("result", "process method result");
		return VIEW ; 
	}

	// Specific action
	public String doSomething(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("result", "doSomething method result");
		return VIEW ; 
	}
	
}
