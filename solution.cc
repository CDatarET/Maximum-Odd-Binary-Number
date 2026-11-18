class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int z = 0;
        int o = 0;
        for(int i = 0; i < s.size(); i++){
            if(s[i] == '0') z++;
            else o++;
        }

        string ret(o - 1, '1');
        ret += string(z, '0');
        return ret + '1';
    }
};
