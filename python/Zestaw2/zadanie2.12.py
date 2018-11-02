import re

line = 'jeden dwa trzy cztery piec szesc siedem'
words = re.findall('\w+', line)
firstletters = ''
lastletters = ''

for word in words:
    firstletters += word[0]
    lastletters += word[len(word)-1:]
print(firstletters)
print(lastletters)
