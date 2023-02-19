public class Main {

    public static void main(String[] args) {
        SalesManager version = new SalesManager(new long[]{100, 200, 300});
        System.out.println(version.max());
        SalesManager salesManager = new SalesManager(version.sales);

        long min = salesManager.min();
        long average = salesManager.average();
        System.out.println(min);
        System.out.println(average);
    }
}