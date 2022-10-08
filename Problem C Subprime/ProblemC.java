import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = Integer.parseInt(scan.next());
        int h = Integer.parseInt(scan.next());
        String p = scan.next();

        int start = 0;
        int counter = 0;

        List<String> arr = new ArrayList<String>();
        arr.add(null);


        while (arr.size() <= h) {
            if (isPrime(start)) arr.add(String.valueOf(start));
            start++;
        }

        for (int i = l; l <= h; l++) {
            String temp = arr.get(l);
            if (temp.contains(p)) counter += 1;

        }
        System.out.println(counter);




    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i*i <= n; i+=6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}