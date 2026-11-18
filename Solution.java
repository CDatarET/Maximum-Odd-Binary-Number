class Solution {
    public String maximumOddBinaryNumber(String s) {
        int z = 0;
        int o = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                z++;
            }
            else{
                o++;
            }
        }

        String ret = String.valueOf('1').repeat(o - 1);
        ret += String.valueOf('0').repeat(z);
        return ret + "1";
    }
}
