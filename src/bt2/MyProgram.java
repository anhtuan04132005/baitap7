public class MyProgram {

    public static void main(String[] args) {
        int[] iq = {126, 84, 149, 167, 95};

        int sum = 0;
        for (int value : iq) {
            sum += value;
        }

        double avg = (double) sum / iq.length;

        System.out.println("Average IQ = " + avg);
    }
}
