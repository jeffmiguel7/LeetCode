def lengthOfLongestSubstring(s):
        chars_map = {}
        window_start = 0
        max_length = 0

        for i in range(len(s)):
            end_char = s[i]
            if end_char in chars_map and chars_map[end_char] >= window_start:
                window_start = chars_map[end_char] + 1
            
            chars_map[end_char] = i
            print("windowStart: {}".format(str(window_start)))
            max_length = max(max_length, i - window_start + 1)
        return max_length

def bruteLengthOfLongestSubstring(s, n):      

    for Len in range(1,n + 1): 
        for i in range(n - Len + 1): 
            j = i + Len - 1
            for k in range(i,j + 1): 
                print(s[k],end='') 
            print() 
              
Str = "abc"
bruteLengthOfLongestSubstring(Str,len(Str)) 