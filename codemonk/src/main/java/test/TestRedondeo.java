package test;

import java.math.BigDecimal;
import java.util.Formatter;

public class TestRedondeo {

	public static void main(String[] args) {

		BigDecimal value = new BigDecimal(225.79);
		BigDecimal ivaPc = BigDecimal.valueOf(12);

		BigDecimal valorIva = value.multiply(ivaPc);

		//System.out.println(valorIva.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP));
		//System.out.println(valorIva.divide(new BigDecimal(100), 2, BigDecimal.ROUND_CEILING));
		// System.out.println(valorIva.divide(new BigDecimal(100), 2,
		// BigDecimal.ROUND_FLOOR));
		// System.out.println(valorIva.divide(new BigDecimal(100), 2,
		// BigDecimal.ROUND_HALF_EVEN));
		// System.out.println(valorIva.divide(new BigDecimal(100), 2,
		// BigDecimal.ROUND_UNNECESSARY));
		// System.out.println(valorIva.divide(new BigDecimal(100), 2,
		// BigDecimal.ROUND_UP));
		
		decimalFormat();

	}

	private static void decimalFormat() {
		
		Formatter fmt = new Formatter();
		int numero = 1;
		System.out.println(fmt.format("%03d",numero));

	}

}
