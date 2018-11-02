import math

L = [[],[4],(1,2),[3,4],(5,6,7)]

def sum(sequence):
    S = []
    k = 0
    for x in sequence:
        S.append(math.fsum(x))

    return S

print(sum(L))
