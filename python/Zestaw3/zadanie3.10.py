def roman_to_int(s):
    ROMAN = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    int_val = 0
    for i in range(len(s)):
        if i > 0 and ROMAN[s[i]] > ROMAN[s[i - 1]]:
            int_val += ROMAN[s[i]] - 2 * ROMAN[s[i - 1]]
        else:
            int_val += ROMAN[s[i]]
    return int_val

print(roman_to_int(raw_input()))
