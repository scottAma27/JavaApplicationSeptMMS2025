public class RandomRanges5_12 {
    public static void main(String[] args) {
        // a) 1 ≤ n ≤ 2  rangeSize = 2
        int n1 = (int)(Math.random() * 2) + 1;
        
        // b) 1 ≤ n ≤ 100  rangeSize = 100
        int n2 = (int)(Math.random() * 100) + 1;
        
        // c) 0 ≤ n ≤ 9  rangeSize = 10
        int n3 = (int)(Math.random() * 10);
        
        // d) 1000 ≤ n ≤ 1112  rangeSize = 113
        int n4 = (int)(Math.random() * 113) + 1000;
        
        // e) –1 ≤ n ≤ 1  rangeSize = 3
        int n5 = (int)(Math.random() * 3) - 1;
        
        // f) –3 ≤ n ≤ 11  rangeSize = 15
        int n6 = (int)(Math.random() * 15) - 3;
        
        System.out.println(n1 + " + n2 + " + n3 + " + n4 + " + n5 + " + n6");
    }
}