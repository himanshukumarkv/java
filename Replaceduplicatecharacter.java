public class Replaceduplicatecharacter {
    

        static String rdc(String str) {
            StringBuilder result = new StringBuilder();
            int n = str.length();
    
            for (int i = 0; i < n; i++) {
                char currentChar = str.charAt(i);
                System.out.println(result.indexOf(String.valueOf(currentChar)));
                if (result.indexOf(String.valueOf(currentChar)) == -1) {
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
    
        public static void main(String[] args) {
            String str = "hello world";
            System.out.println(rdc(str));  // Output will be "bacdef"
        }
    }
    