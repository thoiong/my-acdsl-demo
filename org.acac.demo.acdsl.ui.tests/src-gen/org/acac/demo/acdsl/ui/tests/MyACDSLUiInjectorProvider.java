/*
 * generated by Xtext 2.11.0
 */
package org.acac.demo.acdsl.ui.tests;

import com.google.inject.Injector;
import org.acac.demo.acdsl.ui.internal.AcdslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MyACDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AcdslActivator.getInstance().getInjector("org.acac.demo.acdsl.MyACDSL");
	}

}
