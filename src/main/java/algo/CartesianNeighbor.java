package algo;

public class CartesianNeighbor {
    public static int[][] cartesianNeighbor(int x, int y){
        int[][] cartesianPoint = new int[8][8];
        cartesianPoint[0] = new int[]{x - 1, y - 1};
        cartesianPoint[1]= new int[]{x - 1,y };
        cartesianPoint[2]= new int[]{x - 1, y + 1 };

        cartesianPoint[3]= new int[]{x, y - 1 };
        cartesianPoint[4]= new int[]{x, y + 1 };

        cartesianPoint[5]= new int[]{x + 1, y - 1 };
        cartesianPoint[6]= new int[]{x + 1, y};
        cartesianPoint[7]= new int[]{x + 1, y + 1};
        return cartesianPoint;
    }

}
