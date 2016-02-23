/**
 *  Copyright (C) 2012 The author of this file & the Telosys Team
 *
 *  Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.gnu.org/licenses/lgpl.html
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.demo.web.actions ;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nanoj.web.tinymvc.GenericAction;

public class CalcAction extends GenericAction {

	private final static String VIEW_PAGE = "calc" ;
	
	private final static int ADD  = 1 ;
	private final static int SUB  = 2 ;
	private final static int DIV  = 3 ;
	private final static int MULT = 4 ;

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

	private String calc (HttpServletRequest request, HttpServletResponse response, int operation ) {
		
		double p1 = getParamAsDouble(request, "p1");
		double p2 = getParamAsDouble(request, "p2");
		
		double result = 0 ;
		
		switch(operation) {
		case ADD  : result = p1 + p2 ; break;
		case SUB  : result = p1 - p2 ; break;
		case DIV  : result = p1 / p2 ; break;
		case MULT : result = p1 * p2 ; break;
		}
		
		request.setAttribute("result", result);
		
		return VIEW_PAGE ;
		
	}
	
	public String add(HttpServletRequest request, HttpServletResponse response) {
		
		setFieldValueFromParam(request, "p1" );
		setFieldValueFromParam(request, "p2" );

		return calc ( request,  response, ADD ) ;		
	}
	
	public String sub(HttpServletRequest request, HttpServletResponse response) {
		
		setFieldValuesFromParameters(request);
		
		return calc ( request,  response, SUB ) ;
	}

	public String div(HttpServletRequest request, HttpServletResponse response) {
		setFieldValuesFromParameters(request);
		return calc ( request,  response, DIV ) ;
	}

	public String mult(HttpServletRequest request, HttpServletResponse response) {
		setFieldValuesFromParameters(request);
		return calc ( request,  response, MULT ) ;
	}

}
