x = None

while x != 'stop':
	try:
		x = raw_input()
		print(pow(int(x), 3))
	except ValueError:
		print('Blad')
