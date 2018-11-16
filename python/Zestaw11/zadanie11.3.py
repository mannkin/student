from fracs import Frac
import random

L = []

for i in range(0, 10):
    L.append(Frac(random.randrange(10), random.randrange(1, 10)))

print(L)

def insertsort(L, left, right, cmpfunc=cmp):
    for i in range(left+1, right+1):
        for j in range(i, left, -1):
            if cmpfunc(L[j-1], L[j]) > 0:
                L[j], L[j-1] = L[j-1], L[j]

insertsort(L, 0, 9, cmpfunc=lambda x, y: -cmp(x.y, y.y)) # sortowanie ulamkow po wartosci mianownika

print(L)