package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class MagicSquareTest {
	
	private MagicSquare magicSquare;
	
	private void setupScenary1() {
	}
	
	private void setupScenary2() {
		magicSquare = new MagicSquare(5,4,1);
	}
	
	private void setupScenary3() {
		magicSquare = new MagicSquare(5,1,1);
	}
	
	private void setupScenary4() {
		magicSquare = new MagicSquare(5,2,1);
	}
	
	private void setupScenary5() {
		magicSquare = new MagicSquare(5,3,1);
	}
	
	private void setupScenary6() {
		magicSquare = new MagicSquare(5,1,2);
	}
	
	private void setupScenary7() {
		magicSquare = new MagicSquare(5,2,2);
	}
	
	private void setupScenary8() {
		magicSquare = new MagicSquare(5,3,2);
	}
	
	private void setupScenary9() {
		magicSquare = new MagicSquare(5,4,2);
	}
	
	private void setupScenary10() {
		magicSquare = new MagicSquare(3,1,3);
	}
	
	private void setupScenary11() {
		magicSquare = new MagicSquare(3,2,3);
	}
	
	private void setupScenary12() {
		magicSquare = new MagicSquare(3,3,3);
	}
	
	private void setupScenary13() {
		magicSquare = new MagicSquare(3,4,3);
	}
	
	private void setupScenary14() {
		magicSquare = new MagicSquare(3,1,4);
	}
	
	private void setupScenary15() {
		magicSquare = new MagicSquare(3,2,4);
	}
	
	private void setupScenary16() {
		magicSquare = new MagicSquare(3,3,4);
	}
	
	private void setupScenary17() {
		magicSquare = new MagicSquare(3,4,4);
	}
	
	
	@Test
	void testMagicSquare() {
		setupScenary1();
		int order=5;
		int sense = 4;
		int centralBox = 1;
		
		MagicSquare magicSquare = new MagicSquare(order,sense,centralBox);
		
		assertNotNull("The magic square is null",magicSquare);
		assertTrue("The order of the magic square is incorrect", (order == magicSquare.getOrder()));
		assertTrue("The sense of the magic square is incorrect", (sense == magicSquare.getSense()));
		assertTrue("The centralBox of the magic square is incorrect", (centralBox == magicSquare.getCentralBox()));
	}
	
	@Test
	void testCalculateMagicConstanst() {
		setupScenary2();
		assertTrue("The magic constant is incorrect",(((magicSquare.getOrder()*((magicSquare.getOrder()*magicSquare.getOrder())+1))/2)) == magicSquare.calculateMagicConstant());
		
	}
	
	@Test
	void testFull() {
		setupScenary2();
		assertEquals("The magic square is not counting correctly how many elemnts are equals to 0",25,magicSquare.full());
	}
	
	@Test
	void testFillBoxRight() {
		setupScenary2();
		magicSquare.fillBoxRight(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",11, magicSquare.getSquare()[0][0]); assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[2][3]);
		assertEquals("The magic square is not filled correctly",10, magicSquare.getSquare()[0][1]); assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[2][4]);
		assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[0][2]); assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[3][0]);
		assertEquals("The magic square is not filled correctly",23, magicSquare.getSquare()[0][3]); assertEquals("The magic square is not filled correctly",21, magicSquare.getSquare()[3][1]);
		assertEquals("The magic square is not filled correctly",17, magicSquare.getSquare()[0][4]); assertEquals("The magic square is not filled correctly",20, magicSquare.getSquare()[3][2]);
		assertEquals("The magic square is not filled correctly",18, magicSquare.getSquare()[1][0]); assertEquals("The magic square is not filled correctly",14, magicSquare.getSquare()[3][3]);
		assertEquals("The magic square is not filled correctly",12, magicSquare.getSquare()[1][1]); assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[3][4]);
		assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[1][2]); assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[4][0]);
		assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[1][3]); assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[4][1]);
		assertEquals("The magic square is not filled correctly",24, magicSquare.getSquare()[1][4]); assertEquals("The magic square is not filled correctly",22, magicSquare.getSquare()[4][2]);
		assertEquals("The magic square is not filled correctly",25, magicSquare.getSquare()[2][0]); assertEquals("The magic square is not filled correctly",16, magicSquare.getSquare()[4][3]);
		assertEquals("The magic square is not filled correctly",19, magicSquare.getSquare()[2][1]); assertEquals("The magic square is not filled correctly",15, magicSquare.getSquare()[4][4]);
		assertEquals("The magic square is not filled correctly",13, magicSquare.getSquare()[2][2]);
	}
	
	@Test
	void testFillBoxRight1() {
		setupScenary3();
		magicSquare.fillBoxRight(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxRight2(){
		setupScenary4();
		magicSquare.fillBoxRight(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[0][0]); assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[2][3]);
		assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[0][1]); assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[2][4]);
		assertEquals("The magic square is not filled correctly",22, magicSquare.getSquare()[0][2]); assertEquals("The magic square is not filled correctly",18, magicSquare.getSquare()[3][0]);
		assertEquals("The magic square is not filled correctly",16, magicSquare.getSquare()[0][3]); assertEquals("The magic square is not filled correctly",12, magicSquare.getSquare()[3][1]);
		assertEquals("The magic square is not filled correctly",15, magicSquare.getSquare()[0][4]); assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[3][2]);
		assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[1][0]); assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[3][3]);
		assertEquals("The magic square is not filled correctly",21, magicSquare.getSquare()[1][1]); assertEquals("The magic square is not filled correctly",24, magicSquare.getSquare()[3][4]);
		assertEquals("The magic square is not filled correctly",20, magicSquare.getSquare()[1][2]); assertEquals("The magic square is not filled correctly",11, magicSquare.getSquare()[4][0]);
		assertEquals("The magic square is not filled correctly",14, magicSquare.getSquare()[1][3]); assertEquals("The magic square is not filled correctly",10, magicSquare.getSquare()[4][1]);
		assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[1][4]); assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[4][2]);
		assertEquals("The magic square is not filled correctly",25, magicSquare.getSquare()[2][0]); assertEquals("The magic square is not filled correctly",23, magicSquare.getSquare()[4][3]);
		assertEquals("The magic square is not filled correctly",19, magicSquare.getSquare()[2][1]); assertEquals("The magic square is not filled correctly",17, magicSquare.getSquare()[4][4]);
		assertEquals("The magic square is not filled correctly",13, magicSquare.getSquare()[2][2]);
	}
	
	@Test 
	void testFillBoxRight3(){
		setupScenary5();
		magicSquare.fillBoxRight(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxLeft(){
		setupScenary6();
		magicSquare.fillBoxLeft(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",15, magicSquare.getSquare()[0][0]); assertEquals("The magic square is not filled correctly",19, magicSquare.getSquare()[2][3]);
		assertEquals("The magic square is not filled correctly",16, magicSquare.getSquare()[0][1]); assertEquals("The magic square is not filled correctly",25, magicSquare.getSquare()[2][4]);
		assertEquals("The magic square is not filled correctly",22, magicSquare.getSquare()[0][2]); assertEquals("The magic square is not filled correctly",24, magicSquare.getSquare()[3][0]);
		assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[0][3]); assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[3][1]);
		assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[0][4]); assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[3][2]);
		assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[1][0]); assertEquals("The magic square is not filled correctly",12, magicSquare.getSquare()[3][3]);
		assertEquals("The magic square is not filled correctly",14, magicSquare.getSquare()[1][1]); assertEquals("The magic square is not filled correctly",18, magicSquare.getSquare()[3][4]);
		assertEquals("The magic square is not filled correctly",20, magicSquare.getSquare()[1][2]); assertEquals("The magic square is not filled correctly",17, magicSquare.getSquare()[4][0]);
		assertEquals("The magic square is not filled correctly",21, magicSquare.getSquare()[1][3]); assertEquals("The magic square is not filled correctly",23, magicSquare.getSquare()[4][1]);
		assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[1][4]); assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[4][2]);
		assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[2][0]); assertEquals("The magic square is not filled correctly",10, magicSquare.getSquare()[4][3]);
		assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[2][1]); assertEquals("The magic square is not filled correctly",11, magicSquare.getSquare()[4][4]);
		assertEquals("The magic square is not filled correctly",13, magicSquare.getSquare()[2][2]);
	}
	
	@Test 
	void testFillBoxLeft1(){
		setupScenary7();
		magicSquare.fillBoxLeft(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxLeft2(){
		setupScenary8();
		magicSquare.fillBoxLeft(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",17, magicSquare.getSquare()[0][0]); assertEquals("The magic square is not filled correctly",19, magicSquare.getSquare()[2][3]);
		assertEquals("The magic square is not filled correctly",23, magicSquare.getSquare()[0][1]); assertEquals("The magic square is not filled correctly",25, magicSquare.getSquare()[2][4]);
		assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[0][2]); assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[3][0]);
		assertEquals("The magic square is not filled correctly",10, magicSquare.getSquare()[0][3]); assertEquals("The magic square is not filled correctly",14, magicSquare.getSquare()[3][1]);
		assertEquals("The magic square is not filled correctly",11, magicSquare.getSquare()[0][4]); assertEquals("The magic square is not filled correctly",20, magicSquare.getSquare()[3][2]);
		assertEquals("The magic square is not filled correctly",24, magicSquare.getSquare()[1][0]); assertEquals("The magic square is not filled correctly",21, magicSquare.getSquare()[3][3]);
		assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[1][1]); assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[3][4]);
		assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[1][2]); assertEquals("The magic square is not filled correctly",15, magicSquare.getSquare()[4][0]);
		assertEquals("The magic square is not filled correctly",12, magicSquare.getSquare()[1][3]); assertEquals("The magic square is not filled correctly",16, magicSquare.getSquare()[4][1]);
		assertEquals("The magic square is not filled correctly",18, magicSquare.getSquare()[1][4]); assertEquals("The magic square is not filled correctly",22, magicSquare.getSquare()[4][2]);
		assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[2][0]); assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[4][3]);
		assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[2][1]); assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[4][4]);
		assertEquals("The magic square is not filled correctly",13, magicSquare.getSquare()[2][2]);
	}
	
	@Test 
	void testFillBoxLeft3(){
		setupScenary9();
		magicSquare.fillBoxLeft(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxAbove(){
		setupScenary10();
		magicSquare.fillBoxAbove(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[0][0]); 
		assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[0][1]); 
		assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[0][2]);
		assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[1][0]); 
		assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[1][1]);
		assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[1][2]);
		assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[2][0]);
		assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[2][1]);
		assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[2][2]);
		}
	
	@Test 
	void testFillBoxAbove1(){
		setupScenary11();
		magicSquare.fillBoxAbove(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[0][0]); 
		assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[0][1]); 
		assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[0][2]);
		assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[1][0]); 
		assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[1][1]);
		assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[1][2]);
		assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[2][0]);
		assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[2][1]);
		assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[2][2]);
	}
	
	@Test 
	void testFillBoxAbove2(){
		setupScenary12();
		magicSquare.fillBoxAbove(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxAbove3(){
		setupScenary13();
		magicSquare.fillBoxAbove(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxDown(){
		setupScenary14();
		magicSquare.fillBoxDown(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxDown1(){
		setupScenary15();
		magicSquare.fillBoxDown(magicSquare.getOrder(), magicSquare.getSense());
	}
	
	@Test 
	void testFillBoxDown2(){
		setupScenary16();
		magicSquare.fillBoxDown(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[0][0]); 
		assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[0][1]); 
		assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[0][2]);
		assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[1][0]); 
		assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[1][1]);
		assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[1][2]);
		assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[2][0]);
		assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[2][1]);
		assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[2][2]);
	}
	
	@Test 
	void testFillBoxDown3(){
		setupScenary17();
		magicSquare.fillBoxDown(magicSquare.getOrder(), magicSquare.getSense());
		assertEquals("The magic square is not filled correctly",4, magicSquare.getSquare()[0][0]); 
		assertEquals("The magic square is not filled correctly",9, magicSquare.getSquare()[0][1]); 
		assertEquals("The magic square is not filled correctly",2, magicSquare.getSquare()[0][2]);
		assertEquals("The magic square is not filled correctly",3, magicSquare.getSquare()[1][0]); 
		assertEquals("The magic square is not filled correctly",5, magicSquare.getSquare()[1][1]);
		assertEquals("The magic square is not filled correctly",7, magicSquare.getSquare()[1][2]);
		assertEquals("The magic square is not filled correctly",8, magicSquare.getSquare()[2][0]);
		assertEquals("The magic square is not filled correctly",1, magicSquare.getSquare()[2][1]);
		assertEquals("The magic square is not filled correctly",6, magicSquare.getSquare()[2][2]);
	}
	
	

}
