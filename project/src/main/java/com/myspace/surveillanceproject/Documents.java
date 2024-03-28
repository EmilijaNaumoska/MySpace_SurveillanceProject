package com.myspace.surveillanceproject;

public class Documents implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("id")
	private java.lang.String id;
	@org.kie.api.definition.type.Label("Created At")
	private java.util.Date documentCreatedAt;
	@org.kie.api.definition.type.Label("Updated At")
	private java.util.Date documentUpdatedAt;
	@org.kie.api.definition.type.Label("Created By")
	private java.lang.String documentCreatedBy;
	@org.kie.api.definition.type.Label("Updated By")
	private java.lang.String documentUpdatedBy;
	@org.kie.api.definition.type.Label("Document Path")
	private java.lang.String documentPath;
	@org.kie.api.definition.type.Label("Document Type")
	private java.lang.String documentType;

	@org.kie.api.definition.type.Label("Document Name")
	private java.lang.String documentName;

	@org.kie.api.definition.type.Label("Parent Id")
	private java.lang.String documentRelatedToId;

	@org.kie.api.definition.type.Label("Parent Type")
	private java.lang.String documentRelatedToParent;

	@org.kie.api.definition.type.Label("Deleted")
	private java.lang.Integer deleted;
	@org.kie.api.definition.type.Label("Document Business Type Id")
	private java.lang.String documentBusinessTypeId;
	@org.kie.api.definition.type.Label(value = "businessDocumentType")
	private java.lang.String businessDocumentType;
	public Documents() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.util.Date getDocumentCreatedAt() {
		return this.documentCreatedAt;
	}

	public void setDocumentCreatedAt(java.util.Date documentCreatedAt) {
		this.documentCreatedAt = documentCreatedAt;
	}

	public java.util.Date getDocumentUpdatedAt() {
		return this.documentUpdatedAt;
	}

	public void setDocumentUpdatedAt(java.util.Date documentUpdatedAt) {
		this.documentUpdatedAt = documentUpdatedAt;
	}

	public java.lang.String getDocumentCreatedBy() {
		return this.documentCreatedBy;
	}

	public void setDocumentCreatedBy(java.lang.String documentCreatedBy) {
		this.documentCreatedBy = documentCreatedBy;
	}

	public java.lang.String getDocumentUpdatedBy() {
		return this.documentUpdatedBy;
	}

	public void setDocumentUpdatedBy(java.lang.String documentUpdatedBy) {
		this.documentUpdatedBy = documentUpdatedBy;
	}

	public java.lang.String getDocumentPath() {
		return this.documentPath;
	}

	public void setDocumentPath(java.lang.String documentPath) {
		this.documentPath = documentPath;
	}

	public java.lang.String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(java.lang.String documentType) {
		this.documentType = documentType;
	}

	public java.lang.String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(java.lang.String documentName) {
		this.documentName = documentName;
	}

	public java.lang.String getDocumentRelatedToId() {
		return this.documentRelatedToId;
	}

	public void setDocumentRelatedToId(java.lang.String documentRelatedToId) {
		this.documentRelatedToId = documentRelatedToId;
	}

	public java.lang.String getDocumentRelatedToParent() {
		return this.documentRelatedToParent;
	}

	public void setDocumentRelatedToParent(
			java.lang.String documentRelatedToParent) {
		this.documentRelatedToParent = documentRelatedToParent;
	}

	public java.lang.Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(java.lang.Integer deleted) {
		this.deleted = deleted;
	}

	public java.lang.String getDocumentBusinessTypeId() {
		return this.documentBusinessTypeId;
	}

	public void setDocumentBusinessTypeId(
			java.lang.String documentBusinessTypeId) {
		this.documentBusinessTypeId = documentBusinessTypeId;
	}

	public java.lang.String getBusinessDocumentType() {
		return this.businessDocumentType;
	}

	public void setBusinessDocumentType(java.lang.String businessDocumentType) {
		this.businessDocumentType = businessDocumentType;
	}

	public Documents(java.lang.String id, java.util.Date documentCreatedAt,
			java.util.Date documentUpdatedAt,
			java.lang.String documentCreatedBy,
			java.lang.String documentUpdatedBy, java.lang.String documentPath,
			java.lang.String documentType, java.lang.String documentName,
			java.lang.String documentRelatedToId,
			java.lang.String documentRelatedToParent,
			java.lang.Integer deleted, java.lang.String documentBusinessTypeId,
			java.lang.String businessDocumentType) {
		this.id = id;
		this.documentCreatedAt = documentCreatedAt;
		this.documentUpdatedAt = documentUpdatedAt;
		this.documentCreatedBy = documentCreatedBy;
		this.documentUpdatedBy = documentUpdatedBy;
		this.documentPath = documentPath;
		this.documentType = documentType;
		this.documentName = documentName;
		this.documentRelatedToId = documentRelatedToId;
		this.documentRelatedToParent = documentRelatedToParent;
		this.deleted = deleted;
		this.documentBusinessTypeId = documentBusinessTypeId;
		this.businessDocumentType = businessDocumentType;
	}

}