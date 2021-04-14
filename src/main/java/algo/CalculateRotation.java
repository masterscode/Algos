package algo;

public class CalculateRotation {
    public static void main(String[] args) {
        shiftedDiff("coffee", "eeffoc");
    }
    public static int shiftedDiff(String first, String second) {
        int rotateCount = 0;
       String otherChar =  first.substring(1);
        String firstchar =  first.substring(0,1);

        String shift = otherChar+firstchar;


//        if(first.equalsIgnoreCase(second) || first.length() != second.length()) System.out.println(0);;
            while(true){
                if(shift.equalsIgnoreCase(second))  return rotateCount + 1;

                if(!(shift.equalsIgnoreCase(second))){
                    shift = shift.substring(1) + shift.substring(0,1);
                    rotateCount +=1;
                    if(shift.equalsIgnoreCase(second)) {
                    return rotateCount;
                    }
                }
                System.out.println(shift);
            }

    }
}
