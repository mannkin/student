l = [2,4,1,5,2,24,2,663,3,4325,2]

def remove_head(node):
	
	old = node.pop(0)
	new = node[0]

	return new, old

def remove_tail(node):

	old = node.pop()
	new = node[-1]

	return new, old

print(l)

print(remove_head(l))

print(remove_tail(l))
