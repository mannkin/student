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

factorial(4)
factorial(5)
factorial(6)
factorial(7)
factorial(8)
factorial(9)
factorial(10)
