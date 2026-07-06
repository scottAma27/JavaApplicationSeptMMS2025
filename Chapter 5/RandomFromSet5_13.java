public class RandomFromSet5_13 {
    public static void main(String[] args) {
        // a) 2, 4, 6, 8, 10  → formula: 2 * n where n = 1 to 5
        int[] setA = {2, 4, 6, 8, 10};
        int a = setA[(int)(Math.random() * 5)];
        
        // b) 3, 5, 7, 9, 11  → formula: 2 * n + 1 where n = 1 to 5
        int[] setB = {3, 5, 7, 9, 11};
        int b = setB[(int)(Math.random() * 5)];
        
        // c) 6, 10, 14, 18, 22  → formula: 4 * n + 2 where n = 1 to 5
        int[] setC = {6, 10, 14, 18, 22};
        int c = setC[(int)(Math.random() * 5)];
        
        System.out.printf("a: %d  b: %d  c: %d\n", a, b, c);
    }
}