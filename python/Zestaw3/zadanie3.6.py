x = input()
y = input()

# X = '+'
# Y = '|'

# for number in range(x):
# 	X += '---+'
# 	Y += '   |'

# print(X)

# for number in range(y):
# 	print(Y)
# 	print(X)

a = []
b = []

for number in range(x):
	a += "+"
	b += "|"

G = "---".join(a)
H = "   ".join(b)

for number in range(y-1):
	print(G)
	print(H)

print(G)
