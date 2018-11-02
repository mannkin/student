import re
import collections 

cnt = collections.Counter()

x = 90103040042140402150464300320
number = str(x)

for letter in number:
    cnt[letter] += 1
print(cnt)

