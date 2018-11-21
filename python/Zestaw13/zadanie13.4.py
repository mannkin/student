import numpy as np
import random
import itertools

def createSquare(n):
    L = n*[None]
    for x in xrange(len(L)):
	    L[x]=[None]*n

    # for i in range(0, n):
    #     L[0][i] = i
    # for j in range(1, n):
    #     L[j][0] = j
        
    return L

def search(L, n):
    l = set(itertools.permutations([0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4]))
        
    for z in l:
        fill(L, n , z)

def fill(L, n, z):
    x = 0
    for i in range(1, n):
                for j in range(1, n):
                    L[i][j] = z[x]
                    if check(L, i, j):
                        return
                    else:
                        x += 1
    if x == n**n:
        print("znaleziono rozwiazanie sudoku")
        printSquare(L)

def check(L, i, j):
    for x in range(0, j):
        if L[i][x] == L[i][j]:
            return True
    for y in range(0, i):
        if L[y][j] == L[i][j]:
            return True

def printSquare(L):
    for i in L:
        print(i)

search(createSquare(4), 4)