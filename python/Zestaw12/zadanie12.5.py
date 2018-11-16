from collections import Counter
import random

L = []

for i in range(30):
    L.append(random.randrange(10))

counter = Counter(L).most_common(1)

print(counter)