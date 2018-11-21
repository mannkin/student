import numpy as np
import random
import itertools

def createSquare(n):
    L = n*[None]
    for x in xrange(len(L)):
	    L[x]=[None]*n

    return L

def search(L, n):
    l = set(itertools.permutations([0,0,0,0,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4]))
        
    for z in l:
        fill(L, n , z)

def fill(L, n, z):
    x = 0
    for i in range(0, n):
                for j in range(0, n):
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
        return L[i][x] == L[i][j]
    for y in range(0, i):
        return L[y][j] == L[i][j]
    if i < 2 OR j < 2:
        return L[i][j] == L[0][0] OR L[i][j] == L[0][1] OR L[i][j] == L[1][0] OR L[i][j] == L[1][1]
    elif i < 2 OR j >= 2:
        return L[i][j] == L[0][2] OR L[i][j] == L[0][3] OR L[i][j] == L[1][2] OR L[i][j] == L[1][3]
    elif i >= 2 OR j < 2:
        return L[i][j] == L[2][0] OR L[i][j] == L[3][0] OR L[i][j] == L[2][1] OR L[i][j] == L[3][1]
    elif i >= 2 OR j >= 2:
        return L[i][j] == L[2][2] OR L[i][j] == L[2][3] OR L[i][j] == L[3][2] OR L[i][j] == L[3][3]

def printSquare(L):
    for i in L:
        print(i)

search(createSquare(4), 4)