package com.fireflink.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fireflink.generic.BaseClass;

@Listeners(com.fireflink.generic.ListenersImplementation.class)

public class ExecutionClass extends BaseClass {
	
	@Test
	public void execution() {
		Reporter.log("Framework successfully executed",true);
	}
	
	

}
