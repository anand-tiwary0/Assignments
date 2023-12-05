class Node:
    def __init__(self, value):
        self.data = value
        self.next = None


class CLL:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def insert_first(self, value):
        #create a node
        new_node = Node(value)
        if self.tail is not None:
            new_node.next = self.tail.next
            self.tail.next = new_node
        else:
            self.head = new_node
            new_node.next = self.head
            self.tail = new_node
        self.size = self.size + 1



    def insert_last(self, value):
        new_node = Node(value)
        if self.size == 0:
            self.insert_first(value)
        else:
            new_node.next = self.head
            self.tail.next = new_node
            self.tail = new_node

    def print(self):
       if not self.head:
           print("empty list")
           return
       else:
           current = self.head
           while True:
               print(current.data, end="<==>")
               current = current.next
               if current == self.head:
                   print("to start")
                   return

def main():
    list = CLL()
    list.insert_first(56)
    list.insert_first(78)
    list.insert_last(676)
    list.print()

if __name__ == '__main__':
    main()


