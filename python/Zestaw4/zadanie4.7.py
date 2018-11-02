seq = [1, (2,3), [], [4,(5,6,7)],8,[9]]
L = []

def flattenit(sequence):
	L = []
	for x in sequence:
		if isinstance(x, (list, tuple)):
			for y in x:
				if isinstance(y, (list, tuple)):
					for z in y:
						L.append(z)
				else:
					L.append(y)
		else:
			L.append(x)			
		
	return L

def flattenrek(sequence, L):
	for x in sequence:
		if isinstance(x, (list, tuple)):
			flattenrek(x, L)
		else:
			L.append(x)

print isinstance(seq, (list,tuple))

print(seq)

print(flattenit(seq))

flattenrek(seq, L)

print(L)
