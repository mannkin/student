from rectangles import Rectangle
from points import Point
import unittest

v1 = Rectangle(0, 0, 1, 1)
v2 = Rectangle(0, 0, 1, 1)
v3 = Rectangle(1, 1, 3, 3)
v4 = Rectangle(2, 2, 4, 4)

class TestRectangle(unittest.TestCase):

    def test_str(self):
        self.assertEqual(v1.__str__(), "[(0, 0), (1, 1)]")

    def test_repr(self):
        self.assertEqual(v1.__repr__(), "Rectangle(0, 0, 1, 1)")

    def test_eq(self):
        self.assertTrue(v1.__eq__(v2))

    def test_ne(self):
        self.assertTrue(v1.__ne__(v3))

    def test_center(self):
        self.assertEqual(v3.center(), Point(2, 2))

    def test_area(self):
        self.assertEqual(v3.area(), 4)

    def test_move(self):
        self.assertEqual(v3.move(2, 2), Rectangle(3, 3, 5, 5))

    def test_intersection(self):
        self.assertEqual(v3.intersection(v4), Rectangle(2, 2, 3, 3))

    def test_cover(self):
        self.assertEqual(v3.cover(v4), Rectangle(1, 1, 4, 4))

    def test_make4(self):
        self.assertEqual(v4.make4(), (Rectangle(2, 2, 3, 3), Rectangle(3, 3, 4, 4), Rectangle(2, 3, 3, 4), Rectangle(3, 2, 4, 3)))

if __name__ == '__main__':
    unittest.main()
