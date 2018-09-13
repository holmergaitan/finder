package com.finder.model;

/**
 * Represents a response that will be sent to the client.
 * 
 * @version 0.1
 * @author holmer.gaitan
 */
public class FinderResponseDTO {

	/** The orginal request. */
	private FinderRequestDTO orginalRequest;

	/** The exptected celebrity id. */
	private Integer exptectedCelebrityId;

	/** The celebrity id found. */
	private Integer celebrityIdFound;

	/** The final result. */
	private boolean finalResult;

	/**
	 * Instantiates a new finder response DTO.
	 *
	 * @param originalRequest      the original request
	 * @param exptectedCelebrityId the exptected celebrity id
	 * @param celebrityIdFound     the celebrity id found
	 * @param finalResult          the final result
	 */
	public FinderResponseDTO(FinderRequestDTO originalRequest, Integer exptectedCelebrityId, Integer celebrityIdFound,
			boolean finalResult) {

		this.orginalRequest = originalRequest;
		this.exptectedCelebrityId = exptectedCelebrityId;
		this.celebrityIdFound = celebrityIdFound;
		this.finalResult = finalResult;
	}

	/**
	 * Gets the orginal request.
	 *
	 * @return the orginal request
	 */
	public FinderRequestDTO getOrginalRequest() {

		return orginalRequest;
	}

	/**
	 * Sets the orginal request.
	 *
	 * @param orginalRequest the new orginal request
	 */
	public void setOrginalRequest(FinderRequestDTO orginalRequest) {

		this.orginalRequest = orginalRequest;
	}

	/**
	 * Gets the exptected celebrity id.
	 *
	 * @return the exptected celebrity id
	 */
	public Integer getExptectedCelebrityId() {

		return exptectedCelebrityId;
	}

	/**
	 * Sets the exptected celebrity id.
	 *
	 * @param exptectedCelebrityId the new exptected celebrity id
	 */
	public void setExptectedCelebrityId(Integer exptectedCelebrityId) {

		this.exptectedCelebrityId = exptectedCelebrityId;
	}

	/**
	 * Gets the celebrity id found.
	 *
	 * @return the celebrity id found
	 */
	public Integer getCelebrityIdFound() {

		return celebrityIdFound;
	}

	/**
	 * Sets the celebrity id found.
	 *
	 * @param celebrityIdFound the new celebrity id found
	 */
	public void setCelebrityIdFound(Integer celebrityIdFound) {

		this.celebrityIdFound = celebrityIdFound;
	}

	/**
	 * Checks if is final result.
	 *
	 * @return true, if is final result
	 */
	public boolean isFinalResult() {

		return finalResult;
	}

	/**
	 * Sets the final result.
	 *
	 * @param finalResult the new final result
	 */
	public void setFinalResult(boolean finalResult) {

		this.finalResult = finalResult;
	}
}
