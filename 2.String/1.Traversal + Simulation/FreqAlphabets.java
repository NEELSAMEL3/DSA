class FreqAlphabets {
    public String freqAlphabets(String s) {
        
        StringBuilder ans = new StringBuilder();
        
        int i = s.length() - 1;
        
        while(i >= 0){
            
            if(s.charAt(i) == '#'){
                
                int num = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
                ans.append((char)('a' + num - 1));
                i -= 3;
            }
            else{
                int num = s.charAt(i) - '0';
                ans.append((char)('a' + num - 1));
                i--;
            }
        }
        
        return ans.reverse().toString();
    }
}