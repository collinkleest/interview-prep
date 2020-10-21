package leetcode.easy;

public class E1232 {

    public static boolean checkStraightLine(int[][] coords){
        if (coords.length <= 1) return false;
        if (coords.length == 2) return true;

        for (int i = 0; i < coords.length - 1; i++){
            if ((coords[i][0] + 1) != coords[i+1][0] || ((coords[i][1]+1) != coords[i+1][1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1,2}, {2,3}, {3,4}, {4,5}, {5, 6}, {6,7}};
        System.out.println(checkStraightLine(coordinates));
    }

}
