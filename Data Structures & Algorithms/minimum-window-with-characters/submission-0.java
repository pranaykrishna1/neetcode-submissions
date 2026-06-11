class Solution {
    public String minWindow(String s, String t) {
        int need = 0;
        int current = 0;
        int[] tAplha = new int[128];
        int[] window = new int[128];
        String result = "";
        for(char c : t.toCharArray()){
            if(tAplha[c] == 0) need++;
            tAplha[c]++;
        }
        int size = Integer.MAX_VALUE;
        int l = 0;
        for(int r = 0 ; r < s.length() ; r++){
            window[s.charAt(r)]++;
            if(window[s.charAt(r)] == tAplha[s.charAt(r)]) {
                current++;
            }
            // window left move
            while(need == current){
                if(r - l + 1 < size) {
                    size = r - l + 1;
                    result = s.substring(l , r + 1);
                }
                window[s.charAt(l)]--;
                if(window[s.charAt(l)] < tAplha[s.charAt(l)]){
                    current--;
                }
                l++;
            }
        }
        return result;

    }
}
