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

import javax.inject.Singleton;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nanoj.web.tinymvc.GenericAction;

@Singleton
public class AddAction extends GenericAction {

	private final static String VIEW_PAGE = "add" ;
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
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
		
		double p1 = getParamAsDouble(request, "p1");
		double p2 = getParamAsDouble(request, "p2");
		double result = p1 + p2 ;
		
		request.setAttribute("result", result);
		
		return VIEW_PAGE ;
		
	}

	
	
}
