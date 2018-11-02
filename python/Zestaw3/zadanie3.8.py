s1 = [1,(2,3,4,5),6,(7,8),9]
s2 = [1,2,(5,6),7,9]
f1 = []
f2 = []

def flattenrek(sequence, L):
        for x in sequence:
                if isinstance(x, (list, tuple)):
                        flattenrek(x, L)
                else:
                        L.append(x)


flattenrek(s1, f1)
flattenrek(s2, f2)


print(list(set(f1).union(f2)))
print(list(set(f1) & set(f2)))
