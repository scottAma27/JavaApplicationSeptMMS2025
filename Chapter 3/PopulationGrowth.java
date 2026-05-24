// 3.39 World Population Growth
public class PopulationGrowth{
    public static void main(String[] args){
        double currentPop = 7.9e9; // approx current population
        double growthRate = 0.01; // 1% growth rate example
        int years = 75;

        System.out.println("Year\tPopulation\tIncrease");
        for (int i = 1; i <= years; i++) {
            double increase = currentPop * growthRate;
            System.out.printf("%d\t%.2f\t%.2f%n", i, currentPop, increase);
            currentPop += increase;
        }
    }
}