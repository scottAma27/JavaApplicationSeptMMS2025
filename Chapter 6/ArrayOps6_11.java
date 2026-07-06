public class ArrayOps6_11{
    public static void main(String[] args) {
        // a) Set 10 elements to zero
        int[] counts = new int[10];
        for(int i = 0; i < counts.length; i++) counts[i] = 0;

        // b) Add one to each of 15 elements
        int[] bonus = new int[15];
        for(int i = 0; i < bonus.length; i++) bonus[i]++;

        // c) Display 5 values in column format
        int[] bestScores = {85, 92, 78, 90, 88};
        for(int score : bestScores) {
            System.out.println(score);
        }
    }
}