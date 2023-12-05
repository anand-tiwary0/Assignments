class Node:
    def __int__(self,value):
        self.data = value
        self.next = None

class ll:
    def __init__(self):
        self.head = None
    def insert_last(self,value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new_node
    def delete_last(self):
        if self.head is None:
            raise Exception("empty")
        else:
            current = self.head
            while current.next is None:
                current = current.next