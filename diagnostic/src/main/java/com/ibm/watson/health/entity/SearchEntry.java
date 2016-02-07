package com.ibm.watson.health.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class SearchEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5090526238868798208L;
	
	@Id
	private String id;

    private String entry;
    private String sourceLanguage;
    private String translatedEntry;

    public SearchEntry() {}

	public SearchEntry(String entry, String sourceLanguage) {
		super();
		this.entry = entry;
		this.sourceLanguage = sourceLanguage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public String getSourceLanguage() {
		return sourceLanguage;
	}

	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}

	public String getTranslatedEntry() {
		return translatedEntry;
	}

	public void setTranslatedEntry(String translatedEntry) {
		this.translatedEntry = translatedEntry;
	}
}
