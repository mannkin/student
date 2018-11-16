import numpy as np
import random
import itertools

def createSquare(n):
    L = n*[None]
    for x in xrange(len(L)):
	    L[x]=[None]*n

    for i in range(0, n):
        L[0][i] = i
    for j in range(1, n):
        L[j][0] = j
        
    return L

def fill(L, n):
    l = []
    if n == 3:
        l = list(itertools.permutations([0,0,1,2]))
        for z in l:
            k = z
            x = 0
            for i in range(1, n):
                for j in range(1, n):
                    L[i][j] = k[x]
                    x += 1
    elif n == 4:
        l = [0,0,0,1,1,2,2,3,3]
        for i in range(1, n):
            for j in range(1, n):
                L[i][j] = l[random.randrange(0, 4)]

    return L

def search(L, n):
    if n == 3:
    
    elif n == 4:



print(createSquare(3))
print(fill(createSquare(3), 3))