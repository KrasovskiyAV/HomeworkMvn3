public class Main {

    public static void main(String[] args) {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sumSales = 0;
        for (long s : sales) {
            sumSales = sumSales + s;
        }
        System.out.println(sumSales);
        System.out.println();

        long averageSales = sumSales / sales.length;
        System.out.println(averageSales);
        System.out.println();

        int maxSaleMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSaleMonth]) {
                maxSaleMonth = i;
            }
        }
        System.out.println(maxSaleMonth + 1);
        System.out.println();

        int minSaleMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSaleMonth]) {
                minSaleMonth = i;
            }
        }
        System.out.println(minSaleMonth + 1);
        System.out.println();
    }
}

