import java.util.HashSet;
import java.util.Scanner;

public class AftabGold {
    public static int countDistinctWordsByRemovingPairs(String message) {
        HashSet<String> hashSet = new HashSet<>();
        int len = message.length();
        char[] ch = message.toCharArray();

        for(int i=0; i<len-1; i++) {
            StringBuilder stb = new StringBuilder(len-2);
            for(int j=0; j<i; j++) {
                stb.append(ch[j]);
            }
            for(int j=i+2; j<len; j++) {
                stb.append(ch[j]);
            }
            hashSet.add(stb.toString());
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine().trim();
        int result = countDistinctWordsByRemovingPairs(message);
        System.out.println(result);

        scanner.close();
    }
}