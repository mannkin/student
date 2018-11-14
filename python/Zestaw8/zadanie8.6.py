import math

def P(i, j):

	if i == 0 and j == 0:
		return 0.5
	if i > 0 and j == 0:
		return 0.0
	if i == 0 and j > 0:
		return 1.0
	else:
        	return 0.5 * (P(i-1, j) + P(i, j-1))

print(P(2, 5))

