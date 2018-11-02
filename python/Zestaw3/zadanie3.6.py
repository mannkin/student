x = input()
y = input()

X = '+'
Y = '|'

for number in range(x):
	X += '---+'
	Y += '   |'

print(X)

for number in range(y):
	print(Y)
	print(X)
	
