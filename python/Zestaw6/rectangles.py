from points import Point

class Rectangle:

    def __init__(self, x1, y1, x2, y2):
        self.pt1 = Point(x1, y1)
        self.pt2 = Point(x2, y2)

    def __str__(self):
        return "[({0:d}, {1:d}), ({2:d}, {3:d})]".format(self.pt1.x, self.pt1.y, self.pt2.x, self.pt2.y)

    def __repr__(self):
        return "Rectangle({0:d}, {1:d}, {2:d}, {3:d})".format(self.pt1.x, self.pt1.y, self.pt2.x, self.pt2.y)

    def __eq__(self, other):
        if abs(self.pt2.x - self.pt1.x) == abs(other.pt2.x - other.pt1.x) and abs(self.pt2.y - self.pt1.y) == abs(other.pt2.y - other.pt1.y):
            return True
        else:
            return False

    def __ne__(self, other):
        return not self == other

    def center(self):
        x = (self.pt2.x + self.pt1.x)/2
        y = (self.pt2.y + self.pt1.y)/2

        return "({0:d}, {1:d})".format(x, y)

    def area(self):
        w = abs(self.pt2.x - self.pt1.x)
        h = abs(self.pt2.y - self.pt1.y)

        return w*h

    def move(self, x, y):
        self.pt1.x += x
        self.pt2.x += x
        self.pt1.y += y
        self.pt2.y += y
 
        return "Rectangle({0:d}, {1:d}, {2:d}, {3:d})".format(self.pt1.x, self.pt1.y, self.pt2.x, self.pt2.y)
