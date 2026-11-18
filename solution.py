class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        z = 0
        o = 0
        for c in s:
            if c == '0':
                z += 1
            else:
                o += 1
        
        ret = ""
        for i in range(o - 1):
            ret += '1'
        
        for i in range(z):
            ret += '0'
        
        return ret + '1'
