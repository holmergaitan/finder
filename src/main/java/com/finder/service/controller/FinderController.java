package com.finder.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finder.model.FinderRequestDTO;
import com.finder.model.FinderResponseDTO;
import com.finder.service.FinderService;

/**
 * Exposes a REST service to find a celebrity.
 * 
 * @version 0.1
 * @author holmer.gaitan
 */
@RestController
@RequestMapping("/finder")
public class FinderController {

	/** The finder service. */
	private FinderService finderService;

	/**
	 * Instantiates a new finder controller.
	 *
	 * @param finderService the finder service
	 */
	@Autowired
	public FinderController(final FinderService finderService) {

		this.finderService = finderService;
	}

	/**
	 * Find a celebrity based on a string content, expected celebrity id and content
	 * size, that will be used to create the matrix with stored combinations.
	 *
	 * @param finderDTO the finder DTO
	 * @return the finder response DTO
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public FinderResponseDTO findCelebrity(final @RequestBody FinderRequestDTO finderDTO) {

		final Integer[][] matrixContent = finderService.buildMatrixContent(finderDTO.getContentSize(),
				finderDTO.getContent());

		final Integer result = finderService.findCelebrity(finderDTO.getContentSize(), matrixContent);

		return new FinderResponseDTO(finderDTO, finderDTO.getExptectedCelebrityId(), result,
				result.equals(finderDTO.getExptectedCelebrityId()));
	}
}
