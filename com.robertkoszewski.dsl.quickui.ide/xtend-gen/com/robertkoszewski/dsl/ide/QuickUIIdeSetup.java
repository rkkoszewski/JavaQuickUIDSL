/**
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.robertkoszewski.dsl.QuickUIRuntimeModule;
import com.robertkoszewski.dsl.QuickUIStandaloneSetup;
import com.robertkoszewski.dsl.ide.QuickUIIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class QuickUIIdeSetup extends QuickUIStandaloneSetup {
  @Override
  public Injector createInjector() {
    QuickUIRuntimeModule _quickUIRuntimeModule = new QuickUIRuntimeModule();
    QuickUIIdeModule _quickUIIdeModule = new QuickUIIdeModule();
    return Guice.createInjector(Modules2.mixin(_quickUIRuntimeModule, _quickUIIdeModule));
  }
}
