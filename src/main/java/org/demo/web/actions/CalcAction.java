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
	
//	private final static int ADD  = 1 ;
//	private final static int SUB  = 2 ;
//	private final static int DIV  = 3 ;
//	private final static int MULT = 4 ;
	
	public CalcAction() {
		super();
		System.out.println("CalcAction : constructor");
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
//		Map<String,String> defaultFieldValues = new HashMap<String,String>();
//		defaultFieldValues.put("p1", "0.1");
//		defaultFieldValues.put("p2", "0.2");
//		request.setAttribute("value", defaultFieldValues);
//		System.out.println("'value' set in request attributes");
		
		setFieldValue(request, "p1", "0.11");
		setFieldValue(request, "p2", "0.22");
		
		return VIEW_PAGE ;
		
	}

//	private String calc (HttpServletRequest request, HttpServletResponse response, int operation ) {
//		
//		double p1 = getParamAsDouble(request, "p1");
//		double p2 = getParamAsDouble(request, "p2");
//		
//		double result = 0 ;
//		
//		switch(operation) {
//		case ADD  : result = p1 + p2 ; break;
//		case SUB  : result = p1 - p2 ; break;
//		case DIV  : result = p1 / p2 ; break;
//		case MULT : result = p1 * p2 ; break;
//		}
//		
//		request.setAttribute("result", result);
//		
//		return VIEW_PAGE ;
//		
//	}
	
	public String add(HttpServletRequest request, HttpServletResponse response) {

		double result = calculator.add(getParamAsDouble(request, "p1"), getParamAsDouble(request, "p2"));
		
		setFieldValueFromParam(request, "p1" );
		setFieldValueFromParam(request, "p2" );
		request.setAttribute("result", result);
//		return calc ( request,  response, ADD ) ;	
		request.setAttribute("dumbValue", dumb.chooseValue()) ;
		return VIEW_PAGE ;
	}
	
	public String sub(HttpServletRequest request, HttpServletResponse response) {
		
		double result = calculator.sub(getParamAsDouble(request, "p1"), getParamAsDouble(request, "p2"));
		setFieldValuesFromParameters(request);
		request.setAttribute("result", result);
		
//		return calc ( request,  response, SUB ) ;
		return VIEW_PAGE ;
	}

	public String div(HttpServletRequest request, HttpServletResponse response) {
		double result = calculator.div(getParamAsDouble(request, "p1"), getParamAsDouble(request, "p2"));
		setFieldValuesFromParameters(request);
		request.setAttribute("result", result);

//		return calc ( request,  response, DIV ) ;
		return VIEW_PAGE ;
	}

	public String mult(HttpServletRequest request, HttpServletResponse response) {
		double result = calculator.mult(getParamAsDouble(request, "p1"), getParamAsDouble(request, "p2"));
		setFieldValuesFromParameters(request);
		request.setAttribute("result", result);

//		return calc ( request,  response, MULT ) ;
		return VIEW_PAGE ;
	}

}
