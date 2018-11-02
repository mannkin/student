class Node:

    def __init__(self, data=None, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

    def __str__(self):
        return str(self.data)

    def insert(self, data):
        if self.data < data:      # na prawo
            if self.right:
                self.right.insert(data)
            else:
                self.right = Node(data)
        elif self.data > data:    # na lewo
            if self.left:
                self.left.insert(data)
            else:
                self.left = Node(data)
        else:
            pass

    def count(self):
        counter = 1
        if self.left:
            counter += self.left.count()
        if self.right:
            counter += self.right.count()
        return counter

    def search(self, data):
        if self.data == data:
            return self
        if data < self.data:
            if self.left:
                return self.left.search(data)
        else:
            if self.right:
                return self.right.search(data)
        return None


class BinarySearchTree:

    def __init__(self):
        self.root = None

    def insert(self, data):
        if self.root:
            self.root.insert(data)
        else:
            self.root = Node(data)

    def count(self):
        if self.root:
            return self.root.count()
        else:
            return 0

    def search(self, data):   # zwraca node lub None
        if self.root:
            return self.root.search(data)
        else:
            return None


def  bst_max(top):
	
    if top:
        if top.right:
                if top.right.data > top.data:
		    bst_max(top.right)
                else:
                    return top.data
	else:
		return top.data
    else:
        raise ValueError('bst empty')
    
def bst_min(top):

    if top:
        if top.left:
                if top.left.data < top.data:
		    bst_min(top.left)
                else:
                    return top.data
	else:
		return top.data
    else: 
        raise ValueError('bst empty')

bst = BinarySearchTree()
bst.insert(8)
bst.insert(9)
bst.insert(421)
bst.insert(2)
bst.insert(13)

print(bst.count)
print(bst.root)
print(bst_min(bst.root))
print(bst_max(bst.root))
