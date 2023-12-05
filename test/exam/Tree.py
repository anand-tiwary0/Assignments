class Node:
    def __init__(self, value):
        self.data = value
        self.left = None
        self.right = None


class Tree:
    def __init__(self):
        self.root = None

    def is_empty(self):
        return self.root is None

    def insert(self, value):
        self.root = self.insert_util(value, self.root)

    def insert_util(self, value, node):
        if node is None:
            return Node(value)
        elif value <= node.data:
            node.left = self.insert_util(value, node.left)
        else:
            node.right = self.insert_util(value, node.right)
        return node

    def search(self, value):
        return self._search(value, self.root)

    def _search(self, value, node):
        if node is None or node.data == value:
            return node
        if value < node.data:
            return self._search(value, node.left)
        else:
            return self._search(value, node.right)

    def preorder(self, node):
        if node is None:
            return
        print(node.data, end=" ")
        self.preorder(node.left)
        self.preorder(node.right)

    def inorder(self, node):
        if node is None:
            return
        self.inorder(node.left)
        print(node.data, end=" ")
        self.inorder(node.right)

    def postorder(self, node):
        if node is None:
            return
        self.postorder(node.left)
        self.postorder(node.right)
        print(node.data, end=" ")


def main():
    tree = Tree()

    # Insert elements into the tree
    values_to_insert = [5, 3, 7, 2, 4, 6, 8]
    for value in values_to_insert:
        tree.insert(value)

    # Display the tree using different traversal methods
    print("Preorder Traversal:")
    tree.preorder(tree.root)
    print("\n")

    print("Inorder Traversal:")
    tree.inorder(tree.root)
    print("\n")

    print("Postorder Traversal:")
    tree.postorder(tree.root)
    print("\n")

    search_value = 144
    found_node = tree.search(search_value)
    if found_node:
        print(f"Element {search_value} found in the tree.")
    else:
        print(f"Element {search_value} not found in the tree.")


if __name__ == '__main__':
    main()
