import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> arr = new ArrayList<String>();
        int n,s,order;
        int count = 0;

        n = scan.nextInt();
        s = scan.nextInt();

        int tank = s;

        for (int i = 0; i < n; i++) arr.add(scan.next());

        for(String element : arr) {
            if (element.contains("L")) order = Integer.parseInt(element.substring(0,1)) + 1;
            else order = Integer.parseInt(element);

            if (tank >= order) {
                tank -= order;
            }
            else {
                tank = s;
                tank -= order;
                count++;
            }


        }
        System.out.println(count);

    }
}
