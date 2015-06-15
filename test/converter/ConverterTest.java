package converter;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConverterTest {

	private int _input;
	private String _output;

	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, "I" }, { 2, "II" },
				{50, "L"},{100, "C"}, {500, "D"}, {10, "X"}, {999, "CMXCIX"},{563, "DLXIII"} });
	}

	public ConverterTest(final int input, final String output) {
		_input = input;
		_output = output;
	}

	@Test
	public void test() {
		assertEquals(_output, Converter.convert(_input));
	}

}
