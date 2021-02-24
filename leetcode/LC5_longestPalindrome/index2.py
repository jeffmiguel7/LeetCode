
def longestPalindrome(s):
    curr_pal = ""
    long_pal = ""
    for i in range(len(s)):
        sub1 = get_sub(s, i, i)
        sub2 = get_sub(s, i, i + 1)
        curr_pal = sub1 if len(sub1) > len(sub2) else sub2
        long_pal = curr_pal if len(curr_pal) > len(long_pal) else long_pal
    return long_pal

def get_sub(s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l+1:r]

print(longestPalindrome("babbacc"))