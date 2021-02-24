// Given a string, return the length of the longest substring without
// repeating characters.
// --- Example
// lengthOfLongestSubstring("abcabcbb") --> 3 since length of "abc"
// lengthOfLongestSubstring("bbbbb") --> 1 since length of "b"

function lengthOfLongestSubstring(s) {
  let windowCharsMap = {};
  let windowStart = (temp = maxLength = 0);

  for (let i = 0; i < s.length; i++) {
    let curr = s[i];
    if (curr in windowCharsMap && windowCharsMap[curr] >= windowStart) {
      windowStart = windowCharsMap[curr] + 1;
      windowCharsMap[curr] = i;
    } else {
      windowCharsMap[curr] = i;
    }
    temp = i - windowStart + 1;
    maxLength = temp > maxLength ? temp : maxLength;
  }

  return maxLength;
}

module.exports = lengthOfLongestSubstring;
