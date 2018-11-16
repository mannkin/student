def factorial(x):
    result = 1
    for i in xrange(2, x + 1):
        result *= i
    return result

print(factorial(4))
print(factorial(5))
print(factorial(6))
print(factorial(7))
print(factorial(8))
print(factorial(90))
print(factorial(10))
