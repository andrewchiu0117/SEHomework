import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class mainTest {
	private main mainchecker;
	@Before
	public void setUp() throws Exception {
		mainchecker = new main();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test01() {
		assertEquals('X',main.letterGrade(105));
		assertEquals('A',main.letterGrade(95));
		assertEquals('B',main.letterGrade(85));
		assertEquals('C',main.letterGrade(75));
		assertEquals('D',main.letterGrade(65));
		assertEquals('F',main.letterGrade(55));
		assertEquals('F',main.letterGrade(45));
		assertEquals('F',main.letterGrade(35));
		assertEquals('F',main.letterGrade(25));
		assertEquals('F',main.letterGrade(15));
		assertEquals('F',main.letterGrade(5));
		assertEquals('X',main.letterGrade(-5));
	}
	@Test
	public void test02() {
		assertEquals('X',main.letterGrade(999));
		assertEquals('X',main.letterGrade(101));
		assertEquals('A',main.letterGrade(100));
		assertEquals('A',main.letterGrade(90));
		assertEquals('B',main.letterGrade(89));
		assertEquals('B',main.letterGrade(80));
		assertEquals('C',main.letterGrade(79));
		assertEquals('C',main.letterGrade(70));
		assertEquals('D',main.letterGrade(69));
		assertEquals('D',main.letterGrade(60));
		assertEquals('F',main.letterGrade(59));
		assertEquals('F',main.letterGrade(0));
		assertEquals('X',main.letterGrade(-1));
		assertEquals('X',main.letterGrade(-999));
	}

}
