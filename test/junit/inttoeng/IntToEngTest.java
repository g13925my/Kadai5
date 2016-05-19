package junit.inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateで1をoneに変更できるメソッド() {
		IntToEng number = new IntToEng();
		String expected = "one";
		String actual = number.translateEng(1);
		assertThat(actual,is(expected));
	}
	public void translateで30をthirtyに変更できるメソッド() {
		IntToEng number = new IntToEng();
		String expected = "thirty";
		String actual = number.translateEng(30);
		assertThat(actual,is(expected));
	}
	public void translateで21をtwentyoneに変更できるメソッド() {
		IntToEng number = new IntToEng();
		String expected = "twentyone";
		String actual = number.translateEng(21);
		assertThat(actual,is(expected));
		System.out.println(number.translateEng(21));
	}
	public void test() {
		fail("Not yet implemented");
	}

}
