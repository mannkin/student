import fracs
import unittest

class TestFractions(unittest.TestCase):

    def setUp(self):
        self.zero = [0 ,1]

    def test_add_frac(self):
        self.assertEqual(fracs.add_frac([1, 2], [1, 3]), [5, 6])

    def test_sub_frac(self):
        self.assertEqual(fracs.sub_frac([3, 5], [1, 5]), [2, 5])

    def test_mul_frac(self):
        self.assertEqual(fracs.mul_frac([1, 2], [5, 3]), [5, 6])

    def test_div_frac(self):
        self.assertEqual(fracs.div_frac([7, 4], [7, 2]), [14, 28])

    def test_is_positive(self):
        self.assertTrue(fracs.is_positive([2, 1]))

    def test_is_zero(self):
        self.assertTrue(fracs.is_zero([0, 3]))

    def test_cmp_frac(self):
        self.assertEqual(fracs.cmp_frac([1, 3], [1, 2]), -1)
        self.assertEqual(fracs.cmp_frac([1, 3], [1, 3]), 0)
        self.assertEqual(fracs.cmp_frac([1, 2], [1, 3]), 1)

    def test_frac2float(self):
        self.assertTrue(isinstance(fracs.frac2float([3, 7]), float))

if __name__ == '__main__':
    unittest.main()
	
