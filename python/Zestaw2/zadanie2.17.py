line = 'jeden dwa trzy cztery piec szesc siedemdziesiat'
words = line.split()

print(sorted(words))
print(sorted(words, key=len))

