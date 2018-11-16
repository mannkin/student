import random
import numpy

def listA(n):
    return random.sample(range(0, n, 1), n)

def listB(n):
    numbers = [] 

    if n >= 100:
        x = int(n//10)
    elif n >= 10:
        x = 10
    else:
        x = 4

    for i in range(0, x):
        numbers += random.sample(range(i*int(n//x), (i+1)*int(n//x)), int(n//x))
    return numbers

def listC(n):
    L = listB(n)
    return L[::-1]

def listD(m, s, n):
    a = numpy.random.normal(m, s, n)
    return a

def listE(n, k):
    return numpy.random.choice(k, n, replace=True)

print(listA(20))
print(listB(20))
print(listC(20))
print(listD(0, 0.2, 20))
print(listE(20,10))

