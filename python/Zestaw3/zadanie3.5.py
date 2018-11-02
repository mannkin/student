x = raw_input()
top = '|'
bot = ''

for number in range(int(x)):
	top += '....|'
	bot += str(number)
	if 0 <= number <= 9:
		bot += '    '
	if 10 <= number <= 100:
		bot += '   '

top = top[:-5]
print(top)
print(bot)
