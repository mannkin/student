import math

def solve1(a, b, c):
    d = (b**2) - (4*a*c)

    sol1 = (-b-math.sqrt(d))/(2*a)
    sol2 = (-b+math.sqrt(d))/(2*a)

    print("x1 = {0:f}, x2 = {1:f}".format(sol1, sol2))

solve1(3, 5, 2)
