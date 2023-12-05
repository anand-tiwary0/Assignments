class Node:
    def __init__(self, prev=None, data=None, next=None):
        self.prev = prev
        self.data = data
        self.next = next


class DLL:
    def __init__(self):
        self.head = None

    def insert_first(self, value):
        newNode = Node(data=value)
        if self.head is None:
            self.head = newNode
        else:
            newNode.next = self.head
            self.head.prev = newNode  # Correct order of assignments
            self.head = newNode
            newNode.prev = None  # Set prev to None for the new head

    def append(self, value):
        newNode = Node(data=value)
        if self.head is None:
            self.insert_first(value)
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = newNode
            newNode.prev = current

    def print(self):
        current = self.head
        while current:
            print(current.data, end="<-->")
            current = current.next
        print("NONE")


def main():
    my_list = DLL()
    my_list.insert_first(56)
    my_list.insert_first(67)
    my_list.insert_first(454)
    my_list.append(576)
    my_list.append(23)
    my_list.print()


if __name__ == '__main__':
    main()
