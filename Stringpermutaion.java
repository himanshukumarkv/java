public class Stringpermutaion {
    static int permutation(String str)
    {
        int temp = 0, count = 0, perm = 1;
        int[] a = new int[256];  // Frequency array

        for (int i = 0; i < str.length(); i++) {
            // char c = str.charAt(i);
            if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                  str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') && a[str.charAt(i)] == 0) {
                count++; 
            } else if (a[str.charAt(i)] != 0) {
                temp++;
            }
            a[str.charAt(i)]++;
        }

        // Calculate factorial for permutations
        for (int j = 1; j <= count; j++) {
            perm *= j;
        }

        return (perm + temp);
    }
    public static void main(String[] args) {
        String str="abcdef";
        System.out.printf("perm=%d",permutation(str));
    }
}
