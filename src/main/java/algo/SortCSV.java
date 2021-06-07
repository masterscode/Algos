package algo;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SortCSV {
    public static void main(String[] args) {
       String sorted =  sortCsvColumns("Adam,Beth,Charles,Danielle,Eric\n3907,17945,10091,10088,10132\n48,2,12,13,11");
        System.out.println(sorted);
    }
    public static String sortCsvColumns( String csv_data ) {
        Map<String, List<String>> graph = new HashMap<>();
        String[] headers = csv_data.substring(0, csv_data.indexOf("\n")).split(",");

        String sortedHeaders = Arrays.stream(headers).sorted().reduce((i, n)-> i + ","+ n).orElseThrow();
        if (sortedHeaders.equals(csv_data.substring(0, csv_data.indexOf("\n")))){
            System.out.println(sortedHeaders);
            return csv_data;
        }

        System.out.println(sortedHeaders);

        String[] columns = csv_data.substring(csv_data.indexOf("\n")).split("\n,");


        return Arrays.toString(columns);
    }
}
