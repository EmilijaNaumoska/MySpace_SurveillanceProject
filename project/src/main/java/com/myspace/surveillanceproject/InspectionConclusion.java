package com.myspace.surveillanceproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InspectionConclusion implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("common")
	private com.myspace.surveillanceproject.CommonInspectionObject common;
	@org.kie.api.definition.type.Label("reportArchiveNumber")
	private java.lang.String reportArchiveNumber;
	@org.kie.api.definition.type.Label("inspectionCost")
	private java.lang.Double inspectionCost;
	@org.kie.api.definition.type.Label("bankAccountNumber")
	private java.lang.String bankAccountNumber;
	@org.kie.api.definition.type.Label("conclusion")
	private java.lang.String conclusion;

	@org.kie.api.definition.type.Label("measures")
	private java.util.List<com.myspace.surveillanceproject.ConclusionMeasures> measures;

	@org.kie.api.definition.type.Label("id")
	private java.lang.String id;

	@org.kie.api.definition.type.Label("archiveDate")
	private java.util.Date archiveDate;

	@org.kie.api.definition.type.Label("documents")
	private java.util.List<com.myspace.surveillanceproject.Documents> documents;

	@org.kie.api.definition.type.Label("laws")
	private java.util.List<com.myspace.surveillanceproject.LawInstance> laws;

	@org.kie.api.definition.type.Label(value = "establishedFacts")
	private java.lang.String establishedFacts;

	public InspectionConclusion() {
	}

	public com.myspace.surveillanceproject.CommonInspectionObject getCommon() {
		return this.common;
	}

	public void setCommon(
			com.myspace.surveillanceproject.CommonInspectionObject common) {
		this.common = common;
	}

	public java.lang.String getReportArchiveNumber() {
		return this.reportArchiveNumber;
	}

	public void setReportArchiveNumber(java.lang.String reportArchiveNumber) {
		this.reportArchiveNumber = reportArchiveNumber;
	}

	public java.lang.Double getInspectionCost() {
		return this.inspectionCost;
	}

	public void setInspectionCost(java.lang.Double inspectionCost) {
		this.inspectionCost = inspectionCost;
	}

	public java.lang.String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(java.lang.String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public java.lang.String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(java.lang.String conclusion) {
		this.conclusion = conclusion;
	}

	public java.util.List<com.myspace.surveillanceproject.ConclusionMeasures> getMeasures() {
		return this.measures;
	}

	public void setMeasures(
			java.util.List<com.myspace.surveillanceproject.ConclusionMeasures> measures) {
		this.measures = measures;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.util.Date getArchiveDate() {
		return this.archiveDate;
	}

	public void setArchiveDate(java.util.Date archiveDate) {
		this.archiveDate = archiveDate;
	}

	public java.util.List<com.myspace.surveillanceproject.Documents> getDocuments() {
		return this.documents;
	}

	public void setDocuments(
			java.util.List<com.myspace.surveillanceproject.Documents> documents) {
		this.documents = documents;
	}

	public java.util.List<com.myspace.surveillanceproject.LawInstance> getLaws() {
		return this.laws;
	}

	public void setLaws(
			java.util.List<com.myspace.surveillanceproject.LawInstance> laws) {
		this.laws = laws;
	}

	public java.lang.String getEstablishedFacts() {
		return this.establishedFacts;
	}

	public void setEstablishedFacts(java.lang.String establishedFacts) {
		this.establishedFacts = establishedFacts;
	}

	public InspectionConclusion(
			com.myspace.surveillanceproject.CommonInspectionObject common,
			java.lang.String reportArchiveNumber,
			java.lang.Double inspectionCost,
			java.lang.String bankAccountNumber,
			java.lang.String conclusion,
			java.util.List<com.myspace.surveillanceproject.ConclusionMeasures> measures,
			java.lang.String id,
			java.util.Date archiveDate,
			java.util.List<com.myspace.surveillanceproject.Documents> documents,
			java.util.List<com.myspace.surveillanceproject.LawInstance> laws,
			java.lang.String establishedFacts) {
		this.common = common;
		this.reportArchiveNumber = reportArchiveNumber;
		this.inspectionCost = inspectionCost;
		this.bankAccountNumber = bankAccountNumber;
		this.conclusion = conclusion;
		this.measures = measures;
		this.id = id;
		this.archiveDate = archiveDate;
		this.documents = documents;
		this.laws = laws;
		this.establishedFacts = establishedFacts;
	}

}