public class TypeConversation {
    public static void main(String[] args) {
        int ants = 1000;
        int purchasedBlocksOfCheese = 1;
        // 强制类型转换
        double blocksOfCheesePerAnt = (double)purchasedBlocksOfCheese / ants;
        System.out.println(blocksOfCheesePerAnt);

        double salary = 1234.56;
        int roundedSalary = (int) salary;
        System.out.println(roundedSalary);
    }
}
