import re

cnt = 0
line = 'jeden dwa trzy cztery piec szesc siedem'
words = re.findall('\w+', line)

for word in words:
    cnt += 1
print(cnt)
