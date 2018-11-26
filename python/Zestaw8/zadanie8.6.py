import math

d = {(0,0):0.5}                                                                  
def P(i, j):                                                            
	if (i,j) in d:                                                               
		return d[(i,j)]    
	if i > 0 and j == 0:
		d[(i,j)] = 0.0
		return d[(i,j)]
	if i == 0 and j > 0:
		d[(i,j)] = 1.0
		return d[(i,j)]
	else:
		d[(i,j)] = 0.5 * (P(i-1, j) + P(i, j-1))
		return d[(i,j)]

print(P(2, 5))
print(d)