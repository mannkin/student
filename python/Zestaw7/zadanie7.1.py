from fracs import Frac
import unittest

v0 = Frac(0, 1)
v1 = Frac(0, 1)
v2 = Frac(2, 4)
v3 = Frac(7, 3)
v4 = Frac(2, 3)
v5 = Frac(-2, 3)
# v6 = Frac(3, 0)

class TestFrac(unittest.TestCase):

    def test_str(self):
        self.assertEqual(v0.__str__(), "0")
        self.assertEqual(v2.__str__(), "2/4")

    def test_repr(self):
        self.assertEqual(v0.__repr__(), "Frac(0, 1)")

    def test_eq(self):
        self.assertTrue(v0.__eq__(v1))
        self.assertFalse(v0.__eq__(v2))

    def test_add(self):
        self.assertEqual(v3.__add__(v4), Frac(9, 3))
        self.assertEqual(v3.__add__(2), Frac(13, 3))

    def test_radd(self):
        self.assertEqual(v4.__radd__(2), Frac(8, 3))

    def test_sub(self):
        self.assertEqual(v3.__sub__(v4), Frac(5, 3))
        self.assertEqual(v3.__sub__(2), Frac(1, 3))

    def test_rsub(self):
        self.assertEqual(v4.__rsub__(2), Frac(4, 3))

    def test_mul(self):
        self.assertEqual(v3.__mul__(v4), Frac(14, 9))
        self.assertEqual(v3.__mul__(2), Frac(14, 3))

    def test_rmul(self):
        self.assertEqual(v4.__rmul__(2), Frac(4, 3))

    def test_div(self):
        self.assertEqual(v3.__div__(v4), Frac(21, 6))
        self.assertEqual(v3.__div__(2), Frac(7, 6))

    def test_rdiv(self):
        self.assertEqual(v4.__rdiv__(2), Frac(6, 2))

    def test_pos(self):
        self.assertTrue(v4.__pos__())

    def test_neg(self):
        self.assertTrue(v5.__neg__())

    def test_invert(self):
        self.assertEqual(v5.__invert__(), Frac(3, -2))

    def test_float(self):
        self.assertEqual(v5.__float__(), float(-2/3))

if __name__ == '__main__':
    unittest.main()

