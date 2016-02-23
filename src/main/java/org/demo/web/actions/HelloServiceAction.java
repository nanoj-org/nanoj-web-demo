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

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.services.HelloService;
import org.nanoj.web.tinymvc.GenericAction;

public class HelloServiceAction extends GenericAction {

	private final static String VIEW_PAGE = "foo" ;
	
	@Inject // TODO
	private HelloService service ;
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		String result = service.hello("Foo");
		
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