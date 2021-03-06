package org.camunda.bpm.infoh420.interview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Represents a university degree.
 * 
 */
@Entity
public class DegreeEntity {

	@Id
	@GeneratedValue
	protected Long id;

	@Version
	protected long version;
	
	protected Long applicationId;
	protected String school;
	protected String title;
	protected String status;
	protected String field;
	protected String countryRegion;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	
	/**
	 * @return the applicationId
	 */
	public Long getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	
	/**
	 * @return the countryRegion
	 */
	public String getCountryRegion() {
		return countryRegion;
	}

	/**
	 * @param countryRegion the countryRegion to set
	 */
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

}
