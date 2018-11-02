from queues import Queue
import unittest

queue1 = Queue()

queue2 = Queue()

queue2.put(0)
queue2.put(1)
queue2.put(2)
queue2.put(3)
queue2.put(4)

queue3 = Queue()

queue4 = Queue()

queue4.put(2)

class TestQueue(unittest.TestCase):

    def test_is_empty(self):
        self.assertTrue(queue1.is_empty())

    def test_is_full(self):
        self.assertTrue(queue2.is_full())

    def test_put(self):
        with self.assertRaises(ValueError) : queue2.put(5)
        with self.assertTrue(queue3.items[0] == 3) : queue3.put(3)

    def test_get(self):
        with self.assertRaises(ValueError): queue1.get()
        self.assertEqual(queue4.get(), 2)

if __name__ == '__main__':
    unittest.main()
