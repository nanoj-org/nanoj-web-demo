package org.demo.web.provider;

import java.util.HashMap;
import java.util.Map;

import org.demo.web.actions.AddAction;
import org.demo.web.actions.BooleanAction;
import org.demo.web.actions.CalcAction;
import org.demo.web.actions.IndexAction;
import org.nanoj.web.tinymvc.Action;
import org.nanoj.web.tinymvc.provider.SpecificActionProvider;

public class DemoActionProvider extends SpecificActionProvider {

	private final static Map<String, Class<? extends Action>> map = new HashMap<String, Class<? extends Action >>();
	
	//--- Define actions here 
	static {
		map.put("",         IndexAction.class   ) ;
		map.put("index",    IndexAction.class   ) ;
		map.put("add",      AddAction.class ) ;
		map.put("calc",     CalcAction.class ) ;
		map.put("boolean",  BooleanAction.class ) ;
	}

	public DemoActionProvider() {
		super(map);
	}

}
