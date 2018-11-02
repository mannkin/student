import points
import unittest


v1 = points.Point(1, 2)
v2 = points.Point(1 ,2)
v3 = points.Point(3, 4)

class TestPoint(unittest.TestCase):

    def test_str(self):
        self.assertEqual(v1.__str__(), "(1, 2)")

    def test_repr(self):
        self.assertEqual(v1.__repr__(), "Point(1, 2)")

    def test_eq(self):
        self.assertTrue(v1.__eq__(v2))

    def test_ne(self):
        self.assertTrue(v1.__ne__(v3))

    def test_add(self):
        self.assertEqual(v1.__add__(v2), "Point(2, 4)")

    def test_sub(self):
        self.assertEqual(v3.__sub__(v2), "Point(2, 2)")

    def test_mul(self):
        self.assertEqual(v3.__mul__(v2), 11)

    def test_cross(self):
        self.assertEqual(v3.cross(v2), 2)

    def test_length(self):
        self.assertEqual(v3.length(), 5)

if __name__ == '__main__':
    unittest.main()
