package Utilities;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

    static NumberFormat formatValues = new DecimalFormat("$#,##0.00");

    public static String doubleToString (Double value) {
        return Utils.formatValues.format(value);
    }

}
