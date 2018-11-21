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

def search(L, n):
    if n == 3:
        l = set(itertools.permutations([0,0,1,2]))
    elif n == 4:
        l = set(itertools.permutations([0,0,0,1,1,2,2,3,3]))
    elif n == 5:
        l = set(itertools.permutations([0,0,0,0,1,1,1,2,2,2,3,3,3,4,4,4]))
        
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
    if x == (n-1)**2:
        print("znaleziono znormalizowany kwadrat lacinski")
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


# ls_list = []

# while current > start:
#     #find next
#     row_s = current/n
#     latin_square[current] += 1
#     while ls[current] in ls[row_s*n:current] and ls[current] < n:
#         latin_square[current]+=1

#     if ls[current] > n:
#         #back track
#         ls[current] = 0
#         current-=1
#     elif checkLatin(ls, current,n):
#         if current < size-1:
#             current+=1
#         else:
#             ls_list.append(ls[:]) 

#         def checkLatin(ls, current, n):
#     row = current/n
#     column = current % n

#     for i in range(row):
#             if ls[i * n + column] == ls[current]:
#                     return False

#     return True