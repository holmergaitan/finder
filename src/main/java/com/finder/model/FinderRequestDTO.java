package com.finder.model;

/**
 * Represents the object used by {@link FinderSrvice} and
 * {@link FinderController} to perform operations
 * 
 * @version 0.1
 * @author holmer.gaitan
 */
public class FinderRequestDTO {

	/** The expected celebrity id. */
	private Integer expectedCelebrityId;

	/** The content size. */
	private Integer contentSize;

	/** The content. */
	private String content;

	/**
	 * Gets the expected celebrity id.
	 *
	 * @return the expected celebrity id
	 */
	public Integer getExptectedCelebrityId() {

		return expectedCelebrityId;
	}

	/**
	 * Sets the expected celebrity id.
	 *
	 * @param expectedCelebrityId the new expected celebrity id
	 */
	public void setExpectedCelebrityId(Integer expectedCelebrityId) {

		this.expectedCelebrityId = expectedCelebrityId;
	}

	/**
	 * Gets the content size.
	 *
	 * @return the content size
	 */
	public Integer getContentSize() {

		return contentSize;
	}

	/**
	 * Sets the content size.
	 *
	 * @param contentSize the new content size
	 */
	public void setContentSize(Integer contentSize) {

		this.contentSize = contentSize;
	}

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {

		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(String content) {

		this.content = content;
	}
}
