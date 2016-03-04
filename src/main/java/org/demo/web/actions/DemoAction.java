package org.demo.web.actions ;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.services.CalculatorService;
import org.nanoj.web.tinymvc.GenericAction;

@Singleton
public class DemoAction extends GenericAction {

	private final static String VIEW_PAGE = "demo : layout1" ;
	
	@Inject
	CalculatorService calc ;
	
	public DemoAction() {
		super();
		System.out.println("AddAction : constructor");
	}
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		//AUTOMATIC : setFieldValuesFromParameters(request); 
		
		// Nothing to do, just show the page 
		return VIEW_PAGE ;
		
	}

	@Override
	public void afterAction(String method, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("After ");
	}

	@Override
	public void beforeAction(String method, HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("Before ");
	}

	/**
	 * Specific action method "exec" : execute addition with the given parameters
	 * @param request
	 * @param response
	 * @return
	 */
	public String toto(HttpServletRequest request, HttpServletResponse response) {

		request.setAttribute("result", "Hello");
		
		double p1 = getParamAsDouble(request, "p1", 0.0);
		double p2 = getParamAsDouble(request, "p2", 0.0);
		double r = calc.add(p1, p2);
		
		request.setAttribute("result2", r);
		
		return VIEW_PAGE ;
		
	}

	
	
}
