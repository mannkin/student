line = 'jeden dwa trzy cztery piec szesc siedemdziesiat'
words = line.split()
word = max(words, key=len)

print( word, len(word))
