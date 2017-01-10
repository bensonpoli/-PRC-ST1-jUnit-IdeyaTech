package com.ideyatech.ut.StringCalcu;
import org.junit.*;
import static org.junit.Assert.*;

public class StringCalcuTest {
	StringCalculator sc;
	
	@Before
	public void init(){
		sc=new StringCalculator();
	}
	@Test 
	public void testCase1(){
		assertEquals("White Space",0,sc.calculate("      "));
	}	
	@Test
	public void testCase2(){
		assertEquals("Single Number",33,sc.calculate("33"));
	}		
	@Test
	public void testCase3(){
		assertEquals("Multple Number Delimited by Comma",93,sc.calculate("30,20,10,33"));
	}		
	@Test(expected = IllegalArgumentException.class)
	public void testCase4(){//With Negative
		sc.calculate("-10");
	}		
	@Test
	public void testCase5(){
		assertEquals("Greater than 1000 with many Numbers",93,sc.calculate("30,20,10,33,1001"));
	}			
	@Test
	public void testCase5_1(){
		assertEquals("Greater than 1000",0,sc.calculate("1001"));
	}				
	@Test
	public void testCase6(){
		assertEquals("New Delimiter",60,sc.calculate("//=30=20=10"));
	}				
	@Test
	public void testCase7(){
		assertEquals("New Delimiter with bracket",60,sc.calculate("//[==]30==20==10"));
	}					
	@Test(expected = IllegalArgumentException.class)
	public void testCase8(){//New Delimiter with bracket with Negative
		sc.calculate("//[==]30==-20==10==1001");
	}					
	@Test
	public void testCase9(){
		assertEquals("New Delimiter with bracket",62,sc.calculate("//[>>]30>>22>>10"));
	}		
	
	
}
