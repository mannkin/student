import math

L = [0,1,3,(4,5,6),7,8,9]

def sum_seq(sequence):
    k = 0
    for x in sequence:
        if isinstance(x, tuple):
            s = math.fsum(x)
        else:
            k += x
    k += s
    print(k)

print(isinstance(L, (list, tuple)))

print(sum_seq(L))
