package com.finder.model;

/**
 * Represents a response that will be sent to the client.
 * 
 * @version 0.1
 * @author holmer.gaitan
 */
public class FinderResponseDTO {

	/** The original request. */
	private FinderRequestDTO originalRequest;

	/** The expected celebrity id. */
	private Integer exptectedCelebrityId;

	/** The celebrity id found. */
	private Integer celebrityIdFound;

	/** The final result. */
	private boolean finalResult;

	/**
	 * Instantiates a new finder response DTO.
	 *
	 * @param originalRequest     the original request
	 * @param expectedCelebrityId the expected celebrity id
	 * @param celebrityIdFound    the celebrity id found
	 * @param finalResult         the final result
	 */
	public FinderResponseDTO(
			FinderRequestDTO originalRequest, Integer expectedCelebrityId, 
			Integer celebrityIdFound, boolean finalResult) {

		this.originalRequest = originalRequest;
		this.exptectedCelebrityId = expectedCelebrityId;
		this.celebrityIdFound = celebrityIdFound;
		this.finalResult = finalResult;
	}

	/**
	 * Gets the original request.
	 *
	 * @return the original request
	 */
	public FinderRequestDTO getOriginalRequest() {

		return originalRequest;
	}

	/**
	 * Sets the original request.
	 *
	 * @param originalRequest the new original request
	 */
	public void setOriginalRequest(FinderRequestDTO originalRequest) {

		this.originalRequest = originalRequest;
	}

	/**
	 * Gets the expected celebrity id.
	 *
	 * @return the expected celebrity id
	 */
	public Integer getExpectedCelebrityId() {

		return exptectedCelebrityId;
	}

	/**
	 * Sets the expected celebrity id.
	 *
	 * @param exptectedCelebrityId the new expected celebrity id
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
