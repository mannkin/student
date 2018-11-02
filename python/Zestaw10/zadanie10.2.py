import unittest
from stacks import Stack

stack = Stack()

stack.push(0)
stack.push(1)
stack.push(2)
stack.push(3)
stack.push(4)
stack.push(5)
stack.push(6)
stack.push(7)
stack.push(8)
stack.push(9)

stack1 = Stack()

stack2 = Stack()

stack3 = Stack()

stack2.push(3)


class TestStack(unittest.TestCase):

    def test_is_empty(self):
        self.assertTrue(stack1.is_empty())

    def test_is_full(self):
        self.assertTrue(stack.is_full())

    def test_push(self):
        with self.assertRaises(ValueError) : stack.push(3)
        with self.assertTrue(stack3.items[stack3.n-1] == 7) : stack3.push(7)

    def test_pop(self):
        with self.assertRaises(ValueError) : stack1.pop()
        self.assertEqual(stack2.pop(), 3)

if __name__ == '__main__':
    unittest.main()




