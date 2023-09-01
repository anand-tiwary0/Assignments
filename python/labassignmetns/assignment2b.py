#                  Implement circular link list
class CircularList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    class Node:
        def __init__(self, value):
            self.data = value
            self.next = None

    def append(self, value):
        node = CircularList.Node(value)
        if self.head is None:
            self.head = node
            self.tail = node
            node.next = self.head  # Make it circular
            self.size = self.size + 1
        else:
            current = self.head
            while current.next is not self.head:
                current = current.next
            current.next = node
            node.next = self.head
            self.tail = node
            self.size = self.size + 1

    def getlength(self):
        current = self.head
        count = 0
        while current is not self.tail:
            count = count + 1
            current = current.next
        if self.tail is not None:
            count = count + 1
        return count
    def display(self):
        if self.head is None:
            print("The circular list is empty.")
            return

        current = self.head
        while True:
            print(current.data, end=" -> ")
            current = current.next
            if current is self.head:  # Checking if we have reached to head
                break
        print(" (Head again)")

    def search(self,value):
        current = self.head
        count = 1
        if self.head is None:
            print("empty list element not found")
            return False

        while True:
            if current.data == value:
                print(f"{value} is present at position {count}")
                return True
            current = current.next
            count += 1

            if current is self.head:
                print("Element not found")
                return False
def main():
    circular_list = CircularList()
    circular_list.append(12)
    circular_list.append(34)
    circular_list.append(45)
    circular_list.append(56)
    circular_list.display()
    length = circular_list.getlength()
    print("length of given list :: ",length)
    x = int(input("enter element to serach for :: "))
    print(f"{x} is present? :: {circular_list.search(x)}")

if __name__ == '__main__':
    main()
