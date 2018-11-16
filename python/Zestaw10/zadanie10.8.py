import random

class RandomQueue:

    def __init__(self, size=5):
        self.n = size + 1        
        self.items = self.n * [None]
        self.head = 0           
        self.tail = 0          

    def is_empty(self):
        return self.head == self.tail

    def is_full(self):
        return (self.head + self.n-1) % self.n == self.tail

    def insert(self, data):
        if not self.is_full():
            self.items[self.tail] = data
            self.tail = (self.tail + 1) % self.n
        else:
            raise ValueError('Queue is full')

    def remove(self):
        if not self.is_empty():
            rnd = random.randrange(self.head, self.tail, 1)
            data = self.items[rnd]
            self.items[rnd] = None
            self.items = filter(None, self.items)
            self.tail = len(self.items)
            return data
        else:
            raise ValueError('Queue is empty')

rndq = RandomQueue()          

rndq.insert(1)
rndq.insert(2)
rndq.insert(3)
rndq.insert(4)
rndq.insert(5)

print(rndq.remove())
print(rndq.remove())
print(rndq.remove())
print(rndq.remove())
print(rndq.remove())
