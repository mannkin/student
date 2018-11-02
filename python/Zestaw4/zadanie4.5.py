L = [0,1,2,3,4,5,6,7,8,9]

def odwracanieit(L, left, right):
    for x in range(abs(right-left)):
        print(x)
        tmp = L[left+x]
        L[left+x] = L[right-x]
        L[right-x] = tmp

def odwracanierek(L, left, right):
        tmp = L[left]
        L[left] = L[right]
        L[right] = tmp
        if abs(right-left) != 0 :
            odwracanierek(L, left+1, right-1)

print(L)

odwracanierek(L, 2, 8)

print(L)

odwracanieit(L, 2, 8)

print(L)
