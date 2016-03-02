package org.demo.web.actions ;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.services.CalculatorService;
import org.demo.services.DumbService;
import org.nanoj.web.tinymvc.GenericAction;

public class CalcAction extends GenericAction {

	@Inject
	private CalculatorService calculator ;
	
	@Inject
	private DumbService dumb ;
	
	private final static String VIEW_PAGE = "calc" ;
	
	public CalcAction() {
		super();
		System.out.println("CalcAction : constructor");
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		setFieldValue(request, "p1", "0.11");
//		setFieldValue(request, "p2", "0.22");
		
		return VIEW_PAGE ;
	}
	
	public String add(HttpServletRequest request, HttpServletResponse response) {
		double result = calculator.add(getParamAsDouble(request, "p1", 0.0), getParamAsDouble(request, "p2", 0.0));
		request.setAttribute("result", result);
		request.setAttribute("dumbValue", dumb.chooseValue()) ;
		return VIEW_PAGE ;
	}
	
	public String sub(HttpServletRequest request, HttpServletResponse response) {
		
		double result = calculator.sub(getParamAsDouble(request, "p1", 0.0), getParamAsDouble(request, "p2", 0.0));
		request.setAttribute("result", result);
		return VIEW_PAGE ;
	}

	public String div(HttpServletRequest request, HttpServletResponse response) {
		double result = calculator.div(getParamAsDouble(request, "p1", 0.0), getParamAsDouble(request, "p2", 0.0));
		request.setAttribute("result", result);
		return VIEW_PAGE ;
	}

	public String mult(HttpServletRequest request, HttpServletResponse response) {
		double result = calculator.mult(getParamAsDouble(request, "p1", 0.0), getParamAsDouble(request, "p2", 0.0));
		request.setAttribute("result", result);
		return VIEW_PAGE ;
	}

}
