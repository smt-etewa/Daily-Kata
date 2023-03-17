package com.smt.kata.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Test;

/****************************************************************************
 * <b>Title</b>: FindOddTest.java
 * <b>Project</b>: Daily-Kata
 * <b>Description: </b> Tests the FindOdd class
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Shashank Kuchibhotla
 * @version 3.0
 * @since Mar 16, 2023
 * @updates:
 ****************************************************************************/
public class FindOddTest {
	
	FindOdd odd = new FindOdd();
	
	@Test
	public void testNull() throws Exception {
		assertEquals(0, odd.findIt(null));
	}
	
	@Test
	public void testEmptyArray() throws Exception {
		assertEquals(0, odd.findIt(new int[]{}));
	}
	
	@Test
	public void testSimpleOne() throws Exception {
		assertEquals(1, odd.findIt(new int[]{1}));
	}
	
	@Test
	public void testSimpleTest() throws Exception {
	   	assertEquals(10, odd.findIt(new int[]{10}));
	}
	
	@Test
	public void testTrios() throws Exception {
		assertEquals(1, odd.findIt(new int[]{1,2,2}));
	}
	
	@Test
	public void testQuad() throws Exception {
		assertEquals(1, odd.findIt(new int[]{1,2,1,2,1}));
	}
	
	@Test
	public void testSimpleLarge() throws Exception {
		assertEquals(4, odd.findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
	}
	
//    assertEquals(oddMan, FindOdd.findIt(randArr));
	@Test
	public void testNegativeSmall() throws Exception {
		assertEquals(-1, odd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
	}
	
	@Test
	public void testNegativeLarge() throws Exception {
		assertEquals(5, odd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
	}
	
	@Test
	public void testLarge1() throws Exception {
	    assertEquals(1, odd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
	}
	
	@Test
   	public void testLarge2() throws Exception {
   		assertEquals(5, odd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
   	}
    
   	@Test
  	public void testAll1sExcept10() throws Exception {
  	   	assertEquals(10, odd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
  	}
  	
  	@Test
  	public void testRandomArray() throws Exception {
		Random rng = new Random();
	    int size = rng.nextInt(1000) + 50;
	    if (size % 2 == 0) size++;
	    
	    ArrayList<Integer> list = new ArrayList<Integer>(size);
	    for (int i = 0; i < size - 1; i+=2) {
	    	int even = rng.nextInt(1000);
	      list.add(even);
	      list.add(even);
	    }
	    
	    int oddMan = rng.nextInt(1000);
	   
	    list.add(oddMan);
	    Collections.shuffle(list);
	    int[] randArr = new int[size];
	    int j = 0;
	    for (int i : list) {
	    	randArr[j++] = i;
	    }
	    
	    assertEquals(oddMan, odd.findIt(randArr));
  	}
}
