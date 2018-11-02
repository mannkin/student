def fibonacci(n):

    a = 0
    b = 1
    c = 0

    for i in range(0, n):
        c = a + b 
        a = b
        b = c
    print(c)

fibonacci(3)
fibonacci(4)
fibonacci(5)
fibonacci(6)
fibonacci(7)
fibonacci(8)
fibonacci(9)
fibonacci(10)
