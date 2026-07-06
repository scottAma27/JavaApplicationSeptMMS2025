// 6_13
// Row 0: [0,0]=1 [0,1]=2 [0,2]=3 [0,3]=4 [0,4]=5
// Row 1: [1,0]=6 [1,1]=7 [1,2]=8 [1,3]=9 [1,4]=10
// Row 2: [2,0]=11 [2,1]=12 [2,2]=13 [2,3]=14 [2,4]=15

public class ProductCalc6_13And6_14{
    public static int product(int... numbers) {
        int result = 1;
        for(int n : numbers) result *= n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(product(2, 3)); // 6
        System.out.println(product(1, 2, 3, 4)); // 24
        System.out.println(product(5, 6, 7)); // 210
    }
}