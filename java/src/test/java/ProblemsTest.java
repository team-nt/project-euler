package test.java;

/*
 * test that all problems have correct solutions 
 */

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.*; // problems (P001, P002, etc.)

public class ProblemsTest {
	
	private Problem p = null;
	
	@Test 
	public void testP001() { 
		p = new P001();
		assertEquals(p.solve(), "233168");
		p.time();
	}
	
	@Test
	public void testP002() {
		p = new P002();
		assertEquals(p.solve(), "4613732");
		p.time();	
	}
	
	@Test
	public void testP003() {
		p = new P003();
		assertEquals(p.solve(), "6857");
		p.time();	
	}
	
	@Test
	public void testP004() {
		p = new P004();
		assertEquals(p.solve(), "906609");
		p.time();	
	}
	
	@Test
	public void testP005() {
		p = new P005();
		assertEquals(p.solve(), "232792560");
		p.time();
	}
	
	@Test
	public void testP006() {
		p = new P006();
		assertEquals(p.solve(), "25164150");
		p.time();
	}
	
	@Test
	public void testP007() {
		p = new P007();
		assertEquals(p.solve(), "104743");
		p.time();
	}
	
	@Test
	public void testP008() {
		p = new P008();
		assertEquals(p.solve(), "23514624000");
		p.time();
	}
	
	@Test
	public void testP009() {
		p = new P009();
		assertEquals(p.solve(), "31875000");
		p.time();
	}
	
	@Test
	public void testP010() {
		p = new P010();
		assertEquals(p.solve(), "142913828922");
		p.time();
	}
	
	@Test
	public void testP011() {
		p = new P011();
		assertEquals(p.solve(), "70600674");
		p.time();
	}
	
	@Test
	public void testP012() {
		p = new P012();
		assertEquals(p.solve(), "76576500");
		p.time();
	}
	
	@Test
	public void testP013() {
		p = new P013();
		assertEquals(p.solve(), "5537376230");
		p.time();
	}
	
	@Test
	public void testP014() {
		p = new P014();
		assertEquals(p.solve(), "837799");
		p.time();
	}
	
	@Test
	public void testP015() {
		p = new P015();
		assertEquals(p.solve(), "137846528820");
		p.time();
	}
	
	@Test
	public void testP016() {
		p = new P016();
		assertEquals(p.solve(), "1366");
		p.time();
	}
	
	@Test
	public void testP017() {
		p = new P017();
		assertEquals(p.solve(), "21124");
		p.time();
	}
	
	@Test
	public void testP018() {
		p = new P018();
		assertEquals(p.solve(), "1074");
		p.time();
	}
	
	@Test
	public void testP019() {
		p = new P019();
		assertEquals(p.solve(), "171");
		p.time();
	}
	
	@Test
	public void testP020() {
		p = new P020();
		assertEquals(p.solve(), "648");
		p.time();
	}
	
	@Test
	public void testP021() {
		p = new P021();
		assertEquals(p.solve(), "31626");
		p.time();
	}
	
	@Test
	public void testP022() {
		p = new P022();
		assertEquals(p.solve(), "871198282");
		p.time();
	}

}
