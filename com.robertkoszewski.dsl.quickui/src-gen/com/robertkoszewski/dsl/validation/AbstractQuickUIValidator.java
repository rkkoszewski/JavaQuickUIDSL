/*
 * generated by Xtext 2.11.0
 */
package com.robertkoszewski.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractQuickUIValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.robertkoszewski.dsl.quickUI.QuickUIPackage.eINSTANCE);
		return result;
	}
	
}
