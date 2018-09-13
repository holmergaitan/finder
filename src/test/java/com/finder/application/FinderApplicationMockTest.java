package com.finder.application;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.finder.service.FinderService;

public class FinderApplicationMockTest {

	private FinderService finderService;
	
	@BeforeTest
	private void setUp() {
		
		finderService = new FinderService();
	}
	
	@Test
	public void findCelebrityTest() {
		
		final Integer [][] testM = { 
				{ 0, 1, 1},
				{ 1, 0, 1},
				{ 0, 0, 0 } };
		
		final Integer celebrityId = finderService.findCelebrity(3, testM);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(0).equals(celebrityId));
	}
	
	@Test
	public void findCelebrityTest2() {
		
		final Integer [][] testM = { 
				{ 0, 1, 0, 1 },
				{ 0, 0, 0, 0 },
				{ 1, 1, 0, 1 }, 
				{ 0, 1, 1, 0 } };
		
		final Integer celebrityId = finderService.findCelebrity(4, testM);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(1).equals(celebrityId));
	}
	
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
	
	@Test
	public void findCelebrityTest4() {
		
		final Integer [][] testM = { 
				{ 0, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 1 }, 
				{ 1, 1, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 1 },
				{ 0, 1, 1, 0, 1, 0 }};
		
		final Integer celebrityId = finderService.findCelebrity(6, testM);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(4).equals(celebrityId));
	}
	
	@Test
	public void findCelebrityTest5() {
		
		final Integer [][] testM = { 
				{ 0, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 0, 0, 0, 1 },
				{ 0, 0, 0, 0, 1, 1, 1 }, 
				{ 1, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0, 1, 1 },
				{ 0, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0, 0, 0 }};
		
		final Integer celebrityId = finderService.findCelebrity(7, testM);
		System.out.println(celebrityId);
		Assert.assertTrue(Integer.valueOf(6).equals(celebrityId));
	}
	
	@Test
	public void test10() {
		
		final Integer [][] test = finderService.buildMatrixContent(4, "0101000011010110");
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < 4; j++) {
				
				System.out.println(String.format("[%s]", test[i][j]));
			}
			
			System.out.println("\n");
		}
	}
}
