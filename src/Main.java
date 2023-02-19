public class Main {

    public static void main(String[] args) {
        SalesManager version = new SalesManager(new int[]{100, 200, 300});
        System.out.println(version.max());
        SalesManager salesManager = new SalesManager(version.sales);

        int min = salesManager.min();
        int average = salesManager.average();
        System.out.println(min);
        System.out.println(average);
    }
}