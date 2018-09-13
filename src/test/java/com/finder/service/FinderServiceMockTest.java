package com.finder.service;

import java.util.Arrays;
import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.finder.service.FinderService;

/**
 * The Class FinderServiceMockTest.
 */
public class FinderServiceMockTest {

	/** The finder service. */
	private FinderService finderService;
	
	/**
	 * Sets up the FinderService
	 */
	@BeforeTest
	private void setUp() {
		
		finderService = new FinderService();
	}
	
	/**
	 * Find celebrity test.
	 */
	@Test
	public void findCelebrityTest() {
		
		final Integer [][] matrix = { 
				{ 0, 1, 1},
				{ 1, 0, 1},
				{ 0, 0, 0 } };
		
		final Integer celebrityId = finderService.findCelebrity(3, matrix);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(2).equals(celebrityId));
	}
	
	/**
	 * Find celebrity test 2.
	 */
	@Test
	public void findCelebrityTest2() {
		
		final Integer [][] matrix = { 
				{ 0, 1, 0, 1 },
				{ 0, 0, 0, 0 },
				{ 1, 1, 0, 1 }, 
				{ 0, 1, 1, 0 } };
		
		final Integer celebrityId = finderService.findCelebrity(4, matrix);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(1).equals(celebrityId));
	}
	
	/**
	 * Find celebrity test 3.
	 */
	@Test
	public void findCelebrityTest3() {
		
		final Integer [][] testM = { 
				{ 0, 1, 1, 1, 0 },
				{ 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 }, 
				{ 1, 1, 1, 0, 1 },
				{ 0, 1, 1, 0, 0 }};
		
		final Integer celebrityId = finderService.findCelebrity(5, testM);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(2).equals(celebrityId));
	}
	
	/**
	 * Find celebrity test 4.
	 */
	@Test
	public void findCelebrityTest4() {
		
		final Integer [][] matrix = { 
				{ 0, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 1 }, 
				{ 1, 1, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1 },
				{ 0, 1, 1, 0, 1, 0 }};
		
		final Integer celebrityId = finderService.findCelebrity(6, matrix);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(4).equals(celebrityId));
	}
	
	/**
	 * Find celebrity test 5.
	 */
	@Test
	public void findCelebrityTest5() {
		
		final Integer [][] matrix = { 
				{ 0, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 1, 1, 1 }, 
				{ 1, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0, 1, 1 },
				{ 0, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		
		final Integer celebrityId = finderService.findCelebrity(7, matrix);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(6).equals(celebrityId));
	}
	
	/**
	 * Builds the matrix content test.
	 */
	@Test
	public void buildMatrixContentTest() {
		
		final Integer size = Integer.valueOf(4);
		final Integer [][] test = finderService.buildMatrixContent(size, "0101000011010110");
		final LinkedList<String> list = new LinkedList<>(Arrays.asList("0101000011010110".split("")));
		for(int i = 0; i < size; i++) {
		
			for(int j = 0; j < size; j++) {
				
				Assert.assertTrue(test[i][j].equals(Integer.valueOf(list.pollFirst())));
			}
		}
	}
}
