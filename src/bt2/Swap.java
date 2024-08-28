public class Swap {
    public static void main(String[] args) {
    int[] values = {7, 35};
    swap(values);
    System.out.println(values[0] + " " + values[1]);
}

public static void swap(int[] values) {
    int temp = values[0];
    values[0] = values[1];
    values[1] = temp;
}


}
