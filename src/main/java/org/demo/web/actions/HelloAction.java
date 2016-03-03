package org.demo.web.actions ;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.services.HelloService;
import org.nanoj.web.tinymvc.GenericAction;

public class HelloAction extends GenericAction {

	private final static String VIEW_PAGE = "hello : layout1" ;
	
	@Inject 
	private HelloService service ;
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		String result = service.hello("Foo");
		request.setAttribute("result", result);
		
//		// Trigger "NullPointer" for error case
//		String s = null ;
//		s.length();
		
		return VIEW_PAGE ;
		
	}

	public String aaa(HttpServletRequest request, HttpServletResponse response) {
		return VIEW_PAGE ;
	}
	
	public String template(HttpServletRequest request, HttpServletResponse response) {
		String template = request.getParameter("template");
		request.setAttribute("title", "Foo with template");
		if ( template != null ) {
			return template + "<" + VIEW_PAGE ;
		}
		else {
			return VIEW_PAGE ;
		}
	}
	
}
