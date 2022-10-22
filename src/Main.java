public class Main {
        public static void main(String[] args) {

        int[] amount = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] amount = new int[30];
        int maxAmount = 0;
        int minAmount = 0;
        for (int index = 0; index < amount.length; index++) {
            amount[index] = random.nextInt(100_000) + 100_000;
            minAmount = amount[index];
            //maxAmount = minAmount;
            //for (index = 1; index < amount.length; ++index) {
            if (amount[index] > maxAmount) maxAmount = amount[index];
            if (amount[index] < minAmount) minAmount = amount[index];
        }
        System.out.println("Максимальная сумма трат за день составила   " + maxAmount);
        System.out.println("Минимальная сумма трат за день составила   " + minAmount);
        return amount;
    }}





