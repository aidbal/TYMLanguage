/*
 * generated by Xtext 2.12.0
 */
package org.pkt


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TymStandaloneSetup extends TymStandaloneSetupGenerated {

	def static void doSetup() {
		new TymStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}