import rectangles
import unittest

v0 = rectangles.Rectangle(5, 5, 8, 8)
v1 = rectangles.Rectangle(0, 0, 1, 1)
v2 = rectangles.Rectangle(1, 1, 2, 2)
v3 = rectangles.Rectangle(2, 2, 4, 4)
v4 = rectangles.Rectangle(3, 2, 4, 6)
class TestRectngle(unittest.TestCase):

    def test_str(self):
        self.assertEqual(v0.__str__(), "[(5, 5), (8, 8)]")

    def test_repr(self):
        self.assertEqual(v0.__repr__(), "Rectangle(5, 5, 8, 8)")

    def test_eq(self):
        self.assertTrue(v1.__eq__(v2))

    def test_ne(self):
        self.assertTrue(v1.__ne__(v3))

    def test_center(self):
        self.assertEqual(v3.center(), "(3, 3)")

    def test_area(self):
        self.assertEqual(v3.area(), 4)

    def test_move(self):
        self.assertEqual(v4.move(2, 2), "Rectangle(5, 4, 6, 8)")

if __name__ == '__main__':
    unittest.main()
