public class RemoveConsecutiveCharacter {
    
        static String rc(String str) {
            StringBuilder result = new StringBuilder();
            int n = str.length();
    
            for (int i = 0; i < n; i++) {
                if (i == n - 1 || str.charAt(i) != str.charAt(i + 1)) {
                    result.append(str.charAt(i));
                }
            }
    
            return result.toString();
        }
    
        public static void main(String[] args) {
            String str = "heello world";
            System.out.println(rc(str));  
        }
    }
    

