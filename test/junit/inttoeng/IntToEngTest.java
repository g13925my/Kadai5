package junit.inttoeng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateで１をoneに変更するメソッド() {
		IntToEng num = new IntToEng();
		String expected = "one";
		String actual = num.translateEng(1);
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
	}
	public void translateで100をonehundretに変更できるメソッド() {
		IntToEng number = new IntToEng();
		String expected = "onehundret";
		String actual = number.translateEng(100);
		assertThat(actual,is(expected));
	}
	public void test() {
		fail("Not yet implemented");
	}

}
