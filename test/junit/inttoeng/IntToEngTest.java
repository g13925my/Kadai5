package junit.inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.tutorial.Calculator;

public class IntToEngTest {

	@Test
	public void translateで1をoneに変更できるメソッド() {
		IntToEng number = new IntToEng();
		String expected = "one";
		int actual = number.translateEng(1);
		assertThat(actual,is(expected));
	}
	public void test() {
		fail("Not yet implemented");
	}

}
