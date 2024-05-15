/**
 * The ErrorHandling class provides methods for handling different types of errors.
 */
/**
 * The ErrorHandling class provides methods for performing various error handling checks.
 */
public class ErrorHandling {
    /**
     * Types of error checks:
     * - Length check: Input is between a specified length (i.e. min / max chars)
     * - Range check: Input is between a defined range (i.e. age is a positive integer)
     * - Type check: Input data is of the expected type (numerical / String, etc.)
     * - Format check: Input data is in the correct format (valid UK postcode / valid phone number, etc.)
     * - Presence check: Test that input is made by the user (not just an empty String)
     * - Existence check: Validate against a stored list of allowed values.
     */

    /**
     * Checks if the length of the input string is within the specified range.
     *
     * @param input The input string to check.
     * @param min   The minimum length allowed.
     * @param max   The maximum length allowed.
     * @return true if the length of the input string is between min and max (inclusive), false otherwise.
     */
    public static boolean lengthCheck(String input, int min, int max) {
        return input.length() >= min && input.length() <= max;
    }

    /**
     * Checks if the input integer is within the specified range.
     *
     * @param input The input integer to check.
     * @param min   The minimum value allowed.
     * @param max   The maximum value allowed.
     * @return true if the input integer is between min and max (inclusive), false otherwise.
     */
    public static boolean rangeCheck(int input, int min, int max) {
        return input >= min && input <= max;
    }

    /**
     * Checks if the input object is of the expected type.
     *
     * @param input The input object to check.
     * @param type  The expected type of the input object.
     * @return true if the input object is of the expected type, false otherwise.
     */
    public static boolean typeCheck(Object input, Class<?> type) {
        return input.getClass().equals(type);
    }

    /**
     * Checks if the input string matches the specified regular expression pattern.
     *
     * @param input The input string to check.
     * @param regex The regular expression pattern to match against.
     * @return true if the input string matches the regex pattern, false otherwise.
     */
    public static boolean formatCheck(String input, String regex) {
        return input.matches(regex);
    }

    /**
     * Checks if the input string is not null and not empty.
     *
     * @param input The input string to check.
     * @return true if the input string is not null and not empty, false otherwise.
     */
    public static boolean presenceCheck(String input) {
        return input != null && !input.isEmpty();
    }

    /**
     * Checks if the input string exists in the provided list of allowed values.
     *
     * @param input         The input string to check.
     * @param allowedValues The list of allowed values.
     * @return true if the input string exists in the allowed values list, false otherwise.
     */
    public static boolean existenceCheck(String input, List<String> allowedValues) {
        return allowedValues.contains(input);
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Divides the dividend by the divisor.
     *
     * @param dividend The dividend.
     * @param divisor  The divisor.
     * @return The result of the division.
     * @throws ArithmeticException if the divisor is zero.
     */
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
}