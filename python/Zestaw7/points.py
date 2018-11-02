import math

class Point:

	def __init__(self, x, y):
		self.x = x
		self.y = y

	def __str__(self):
            return "({0:d}, {1:d})".format(self.x, self.y)

	def __repr__(self):
		return "Point({0:d}, {1:d})".format(self.x, self.y)

	def __eq__(self, other):
		if self.x == other.x and self.y == other.y:
			return True
		else:
			return False

	def __ne__(self, other):
                return not self == other

	def __add__(self, other):
		x = self.x + other.x
		y = self.y + other.y

		return Point(x, y)

        def __sub__(self, other):
                x = self.x - other.x
                y = self.y - other.y

                return Point(x, y)

        def __mul__(self, other):
                return self.x*other.x + self.y*other.y

        def cross(self, other):
                return self.x*other.y - self.y*other.x

        def length(self):
            return math.sqrt(pow(self.x, 2) + pow(self.y, 2))
