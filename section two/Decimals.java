public class Decimals {
    public static void main(String[] args) {
        double percentage = 73.5;
        System.out.println(percentage + " of percentages are made up on the spot.");
        
        // 尽量使用double去进行数学计算，因为会转换类型为double，精度更高，不会出现小数丢失得到情况
        double wallet = 20.000000;
        int people = 3;
        System.out.println(wallet / people);
    }
}
