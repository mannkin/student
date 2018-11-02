import math

dict = {}

def P(i, j, dict):

	if i == 0 and j == 0:
		x = 0.5
	if i > 0 and j == 0:
		x =  0.0
	if i == 0 and j > 0:
		x = 1.0
	else:
        	x = 0.5 * (P(i-1, j, dict) + P(i, j-1, dict))

	dict.update({'{0:2d}, {1:2d}'.format(i, j):x})

P(1, 1, dict)

print(dict)
