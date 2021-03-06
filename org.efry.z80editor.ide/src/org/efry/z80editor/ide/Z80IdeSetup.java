/*
 * generated by Xtext 2.20.0
 */
package org.efry.z80editor.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.efry.z80editor.Z80RuntimeModule;
import org.efry.z80editor.Z80StandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class Z80IdeSetup extends Z80StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new Z80RuntimeModule(), new Z80IdeModule()));
	}
	
}
