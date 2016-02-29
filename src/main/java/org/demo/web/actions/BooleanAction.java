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
