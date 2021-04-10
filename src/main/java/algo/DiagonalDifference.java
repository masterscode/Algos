package algo;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public Address address;

    public DiagonalDifference() {
        address = new Address("ajah", (short) 3022, "lekki", "lagos", "nigeria");
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        return 0;
    }

    public Address getAddress(String field) {
        return address;
    }

    /**
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     * <p>
     * For example, the square matrix  is shown below:
     * <p>
     * 1 2 3
     * 4 5 6
     * 9 8 9
     *
     * @param
     * @return int
     */

    private class Address {
        public String town, localGovernment, state, country;
        short post_code;

        public Address(String town, short postal_code, String localGovernment, String state, String country) {
            this.town = town;
            this.post_code = postal_code;
            this.localGovernment = localGovernment;
            this.state = state;
            this.country = country;
        }
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int counter = 0;
        Math.pow(3,4);
        return counter;
    }

}