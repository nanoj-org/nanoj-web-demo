/**
 *  Copyright (C) 2013-2016 Laurent GUERIN - NanoJ project org. ( http://www.nanoj.org/ )
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
package org.demo.web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter( filterName="zzz-welcome-filter", urlPatterns = {"/*"}  )
public class WelcomeFilter implements Filter  {
	
	// TODO : 
	// this filter must be registered dynamically 
	// only if the property "welcomeURI=/xxx" is defined 
	
	private boolean traceFlag   = true ;
	private void trace(String msg) {
		if ( traceFlag ) {
			String className = this.getClass().getSimpleName() ;
			System.out.println("[TRACE] " + className +  " : " + msg );
		}
	}

	/**
	 * Constructor
	 */
	public WelcomeFilter() {
		super();
        trace("constructor()");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
        trace("init()");
	}
	
	@Override
	public void destroy() {
        trace("destroy()");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
						throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI() ;
        String requestURL = httpRequest.getRequestURL().toString() ;
        String contextPath = httpRequest.getContextPath();
        trace("doFilter() : requestURI = " + requestURI );
        trace("doFilter() : requestURL = " + requestURL );
        trace("doFilter() : contextPath = " + contextPath );
        trace("doFilter() : pathInfo = " + httpRequest.getPathInfo() );

        //--- If the requested URI is just the context path (no resource specified) => redirect to welcome file
        if ( requestURI.equals(contextPath) || requestURI.equals(contextPath+"/") ) {
            trace("doFilter() : welcome file required" );
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            
            //String configWelcomeURI = "do/" ;
            String configWelcomeURI = "index.jsp" ;
            
            String welcomeURL = requestURL + configWelcomeURI ; 
            // TODO 
            // Secure the URI building : ending "/", etc

            trace("doFilter() : send redirect to '" + welcomeURL +"'" );
            
            httpResponse.sendRedirect(welcomeURL);
        }
        else {
            chain.doFilter(request, response);	
        }
	}
	
}
