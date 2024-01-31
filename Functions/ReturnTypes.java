public class ReturnTypes {

    public static double calculateTotalMealPrice(double listesPrice, double tipRate, double taxRate) {

        double tip = tipRate * listesPrice;
        double tax = taxRate * listesPrice;
        double result = listesPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealCost = calculateTotalMealPrice(100, 0.2, 0.08);
        System.out.println(groupTotalMealCost);

        double individualTotalMealCost = groupTotalMealCost / 5;
        System.out.println(individualTotalMealCost);
    }
}