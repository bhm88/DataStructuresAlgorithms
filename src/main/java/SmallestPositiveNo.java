public class SmallestPositiveNo {
    public static int solution(int arr[]) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                present[i] = true;
            }
        }

        for (int i = 1; i < n; i++) {
            if (!present[i])
                return i;
        }
        return n + 1;
    }

    public static void main(String[] args) {

        int A[] = {0, 10, 2, -10, -20};
        System.out.println(solution(A));
    }
}
