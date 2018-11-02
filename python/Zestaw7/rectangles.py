from points import Point

class Rectangle:

    def __init__(self, x1, y1, x2, y2):
        self.pt1 = Point(x1, y1)
        self.pt2 = Point(x2, y2)

    def __str__(self):
        return "[({0:d}, {1:d}), ({2:d}, {3:d})]".format(self.pt1.x, self.pt1.y, self.pt2.x, self.pt2.y)

    def __repr__(self):
        return "Rectangle({0:d}, {1:d}, {2:d}, {3:d})".format(self.pt1.x, self.pt1.y, self.pt2.x, self.pt2.y)

        # return type(self).__name__+repr(tuple(self)

    def __eq__(self, other):
        if abs(self.pt2.x - self.pt1.x) == abs(other.pt2.x - other.pt1.x) and abs(self.pt2.y - self.pt1.y) == abs(other.pt2.y - other.pt1.y):
            return True
        else:
            return False

        # return isinstance(other, Rectangle) and tuple(self) == tuple(other)

    def __ne__(self, other):
        return not self == other

    def center(self):
        x = (self.pt2.x + self.pt1.x)/2
        y = (self.pt2.y + self.pt1.y)/2

        return Point(x, y)

    def area(self):
        w = abs(self.pt2.x - self.pt1.x)
        h = abs(self.pt2.y - self.pt1.y)

        return w*h

    def move(self, x, y):
        self.pt1.x += x
        self.pt2.x += x
        self.pt1.y += y
        self.pt2.y += y
 
        return Rectangle(self.pt1.x, self.pt1.y, self.pt2.x, self.pt2.y) # type(self)

    def intersection(self, other):
        a, b = self, other
        x1 = max(min(a.pt1.x, a.pt2.x), min(b.pt1.x, b.pt2.x))
        y1 = max(min(a.pt1.y, a.pt2.y), min(b.pt1.y, b.pt2.y))
        x2 = min(max(a.pt1.x, a.pt2.x), max(b.pt1.x, b.pt2.x))
        y2 = min(max(a.pt1.y, a.pt2.y), max(b.pt1.y, b.pt2.y))

        return Rectangle(x1, y1, x2, y2)

    def cover(self, other):
        a, b = self, other
        x1 = min(a.pt1.x, b.pt1.x)
        y1 = min(a.pt1.y, b.pt1.y)
        x2 = max(a.pt2.x, b.pt2.x)
        y2 = max(a.pt2.y, b.pt2.y)

        return Rectangle(x1, y1, x2, y2)

    def make4(self):
        center = self.center()
        x1 = (self.pt2.x + self.pt1.x)/2
        y1 = (self.pt2.y + self.pt1.y)/2 

        r1 = Rectangle(self.pt1.x, self.pt1.y, center.x, center.y)
        r2 = Rectangle(center.x, center.y, self.pt2.x, self.pt2.y)
        r3 = Rectangle(self.pt1.x, y1, x1, self.pt2.y)
        r4 = Rectangle(x1, self.pt1.y, self.pt2.x , y1)

        return r1, r2, r3, r4
