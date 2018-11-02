class Frac:

    def __init__(self, x=0, y=1):
       	self.x = x
	self.y = y
	if y == 0:
		raise ValueError('y=0')

    def __str__(self):
        if self.y == 1:
            return "{0:d}".format(self.x)
        else:
            return "{0:d}/{1:d}".format(self.x, self.y)

    def __repr__(self):
        return "Frac({0:d}, {1:d})".format(self.x, self.y)

    def __eq__(self, other):
        if self.x == other.x and self.y == other.y:
            return True
        else:
            return False

    def __add__(self, other):
        x = 0
        y = 0
        if isinstance(other, int):
            x = self.x + other*self.y
            y = self.y
        else:
            if self.y == other.y:
                x = self.x + other.x
                y = self.y
            else:
                x = self.x*other.y + other.x*self.y
                y = self.y*other.y

        return Frac(x, y)

    def __radd__(self, other):
        return Frac(self.y*other + self.x, self.y)

    def __sub__(self, other):
        x = 0
        y = 0
        if isinstance(other, int):
            x = self.x - other*self.y
            y = self.y
        else:
            if self.y == other.y:
                x = self.x - other.x
                y = self.y
            else:
                x = self.x*other.y - other.x*self.y
                y = self.y*other.y

        return Frac(x, y)

    def __rsub__(self, other):
        return Frac(self.y*other - self.x, self.y)

    def __mul__(self, other): 
        x = 0
        y = 0
        if isinstance(other, int):
            x = self.x*other
            y = self.y
        else:
            x = self.x*other.x
            y = self.y*other.y

        return Frac(x, y)

    def __rmul__(self, other):
        return Frac(self.x*other, self.y)

    def __div__(self, other):
        x = 0
        y = 0
        if isinstance(other, int):
            x = self.x
            y = self.y*other
        else:
            x = self.x*other.y
            y = self.y*other.x

        return Frac(x, y)

    def __rdiv__(self, other):
        return Frac(self.y*other, self.x)

    def __pos__(self):
        if self.x*self.y > 0:
            return True
        else:
            return False

    def __neg__(self):
        if self.x*self.y < 0:
            return True
        else:
            return False

    def __invert__(self):
        return Frac(self.y, self.x)

    def __float__(self):
        return float(self.x/self.y)
