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

print(lengthOfLongestSubstring("abba"))