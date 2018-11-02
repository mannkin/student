L = [321,42,12,4,1,7,21,421,99,111,42,2]
line = ''

for number in L:
    line += str(number).zfill(3)
    line += ' '

print(line)
