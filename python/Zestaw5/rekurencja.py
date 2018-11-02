def factorial(n):

    x = 1;

    if n == 0:
        print(1)
    if n == 1:
        print(1)
    else:
        for i in range(2, n+1):
            x *= i
        print(x)

def fibonacci(n):

    a = 0
    b = 1
    c = 0

    for i in range(0, n):
        c = a + b
        a = b
        b = c
    print(c)
