class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        s = s.replaceAll("-", "");
        s = s.toUpperCase();
        
        // loop through the string backwards
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        
        for(int x = s.length() - 1; x >= 0; x--) {
            if(counter == k) {
                sb.append('-');
                counter = 0;
            }
            sb.append(s.charAt(x));
            counter++;
        }
        
        return sb.reverse().toString();
    }
    
    
}