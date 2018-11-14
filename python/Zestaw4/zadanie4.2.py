def zad5():
    x = raw_input()
    top = '|'
    bot = ''
    string = ''

    for number in range(int(x)):
      	top += '....|'
	bot += str(number)
	if 0 <= number <= 9:
               	bot += '    '
       	if 10 <= number <= 100:
               	bot += '   '

    top = top[:-5]
    top += '\n'
    string += top
    string += bot

    return string

def zad6():
    x = input()
    y = input()

    X = '+'
    Y = '|'
    string = ''

    for number in range(x):
       	X += '---+'
       	Y += '   |'

    string += X
    string += '\n'	

    for number in range(y):
        string += Y
	string += '\n'
       	string += X
	string += '\n'

    return 	string

print(zad5())
print(zad6())
