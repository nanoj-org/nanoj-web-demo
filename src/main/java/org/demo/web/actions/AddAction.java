package org.demo.web.actions ;

import javax.inject.Singleton;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nanoj.web.tinymvc.GenericAction;

@Singleton
public class AddAction extends GenericAction {

	private final static String VIEW_PAGE = "add" ;
	
	public AddAction() {
		super();
		System.out.println("AddAction : constructor");
	}
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		//AUTOMATIC : setFieldValuesFromParameters(request); 
		
		// Nothing to do, just show the page 
		return VIEW_PAGE ;
		
	}

	/**
	 * Specific action method "exec" : execute addition with the given parameters
	 * @param request
	 * @param response
	 * @return
	 */
	public String exec(HttpServletRequest request, HttpServletResponse response) {

		//AUTOMATIC : setFieldValuesFromParameters(request);
		setFieldValue(request, "p1", "");
		
		double p1 = getParamAsDouble(request, "p1", 0.0);
		double p2 = getParamAsDouble(request, "p2", 0.0);
		double result = p1 + p2 ;
		

		request.setAttribute("result", result);
		
		return VIEW_PAGE ;
		
	}

	
	
}
