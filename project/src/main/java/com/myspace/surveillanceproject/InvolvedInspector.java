package com.myspace.surveillanceproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InvolvedInspector implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "inspector")
	private java.lang.String inspector;

	public InvolvedInspector() {
	}

	public java.lang.String getInspector() {
		return this.inspector;
	}

	public void setInspector(java.lang.String inspector) {
		this.inspector = inspector;
	}

	public InvolvedInspector(java.lang.String inspector) {
		this.inspector = inspector;
	}

}