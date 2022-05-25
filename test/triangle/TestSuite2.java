package triangle;

import junit.framework.TestCase;

/**
 * @author Han Ruiqian
 * @date 2022/3/30
 */
public class TestSuite2 extends TestCase {
	public void test1() {
		assertEquals (triangle.UpgradedTriangle.area(0,1301,1), 0, 0.01);
	}
	public void test2() {
		assertEquals (triangle.UpgradedTriangle.area(1108,1,1), 0, 0.01);
	}
	public void test3() {
		assertEquals (triangle.UpgradedTriangle.area(1,0,-665), 0, 0.01);
	}
	public void test4() {
		assertEquals (triangle.UpgradedTriangle.area(1,1,0), 0, 0.01);
	}
	public void test5() {
		assertEquals (triangle.UpgradedTriangle.area(582,582,582), 146671.79, 0.01);
	}
	public void test6() {
		assertEquals (triangle.UpgradedTriangle.area(1,1088,15), 0, 0.00);
	}
	public void test7() {
		assertEquals (triangle.UpgradedTriangle.area(1,2,450), 0, 0.00);
	}
	public void test8() {
		assertEquals (triangle.UpgradedTriangle.area(1663,1088,823), 386411.66, 0.01);
	}
	public void test9() {
		assertEquals (triangle.UpgradedTriangle.area(1187,1146,1), 0, 0.00);
	}
	public void test10() {
		assertEquals (triangle.UpgradedTriangle.area(1640,1640,1956), 1287516.10, 0.01);
	}
	public void test11() {
		assertEquals (triangle.UpgradedTriangle.area(784,784,1956), 0, 0.00);
	}
	public void test12() {
		assertEquals (triangle.UpgradedTriangle.area(1,450,1), 0, 0.00);
	}
	public void test13() {
		assertEquals (triangle.UpgradedTriangle.area(1146,1,1146), 572.99, 0.01);
	}
	public void test14() {
		assertEquals (triangle.UpgradedTriangle.area(1640,1956,1956), 1456172.24, 0.01);
	}
	public void test15() {
		assertEquals (triangle.UpgradedTriangle.area(-1,1,1), 0, 0.01);
	}
	public void test16() {
		assertEquals (triangle.UpgradedTriangle.area(1,-1,1), 0, 0.01);
	}
	public void test17() {
		assertEquals (triangle.UpgradedTriangle.area(1,2,3), 0, 0.01);
	}
	public void test18() {
		assertEquals (triangle.UpgradedTriangle.area(2,3,1), 0, 0.01);
	}
	public void test19() {
		assertEquals (triangle.UpgradedTriangle.area(3,1,2), 0, 0.01);
	}
	public void test20() {
		assertEquals (triangle.UpgradedTriangle.area(1,1,2), 0, 0.01);
	}
	public void test21() {
		assertEquals (triangle.UpgradedTriangle.area(1,2,1), 0, 0.01);
	}
	public void test22() {
		assertEquals (triangle.UpgradedTriangle.area(2,1,1), 0, 0.01);
	}
	public void test23() {
		assertEquals (triangle.UpgradedTriangle.area(1,1,1), 0.43, 0.01);
	}
	public void test24() {
		assertEquals (triangle.UpgradedTriangle.area(0,1,1), 0, 0.01);
	}
	public void test25() {
		assertEquals (triangle.UpgradedTriangle.area(1,0,1), 0, 0.01);
	}
	public void test26() {
		assertEquals (triangle.UpgradedTriangle.area(1,2,-1), 0, 0.01);
	}
	public void test27() {
		assertEquals (triangle.UpgradedTriangle.area(1,1,-1), 0, 0.01);
	}
	public void test28() {
		assertEquals (triangle.UpgradedTriangle.area(0,0,0), 0, 0.01);
	}
	public void test29() {
		assertEquals (triangle.UpgradedTriangle.area(3,4,5), 6, 0.01);
	}

}

