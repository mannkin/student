import random

L = []

def fill(L, n, k):
    for i in range(0, n):
        L.append(random.randrange(0, k-1))

def linear_search(L, k):
    x = random.randrange(0, k-1)
    counter = L.count(x)
    pos = []
    for i in range(0, len(L)):
        if x == L[i]:
            pos.append(i)
    return (x, pos, counter)

fill(L, 100, 10)
print(linear_search(L, 10))
