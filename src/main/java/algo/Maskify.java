package algo;

public class Maskify {

    public static void main(String[] args) {
        System.out.println(maskify("victo"));
    }
    public static String maskify( String cc ) {
        if(cc.isEmpty() || cc.length() < 4) return cc;
           // "church";
        int startCharacters = cc.length() - 4;
        String allHashes = "#".repeat(startCharacters);

        String stringToReplace = cc.substring(0, startCharacters);

       return cc.replace( stringToReplace, allHashes);

    }
}
