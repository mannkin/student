import math

def heron(a, b, c):
    if a+b < c or a+c < b or b+c < a:
        raise ValueError
    
    else:
        p = (a+b+c)/2
        S =  math.sqrt(p*(p-a)*(p-b)*(p-c))

    return S

print(heron(3, 4, 5))
