package org.demo.web.actions ;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nanoj.web.tinymvc.GenericAction;

public class BooleanAction extends GenericAction {

	private final static String VIEW_PAGE = "boolean" ;
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		return VIEW_PAGE ;
	}

	public String isTrue(HttpServletRequest request, HttpServletResponse response) {

		boolean p1 = getParamAsBoolean(request, "p1", false);
		
		request.setAttribute("result", p1);
		
		return VIEW_PAGE ;
	}

	
	
}
