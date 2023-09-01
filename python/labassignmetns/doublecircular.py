#         Implement double circular linked list
class Dcl:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0
    class Node:
        def __init__(self,value):
            self.value = value
            self.next = None
            self.prev = None

    def append(self,value):
        node = Dcl.Node(value)
        if self.head is None:
            self.head = node
            node.next = self.head
            node.prev = self.head
            self.size = self.size + 1
        else:
            current = self.head
            while current.next is not self.head:
                current = current.next
            current.next = node
            node.next = self.head
            node.prev = current
            self.head.prev = node
            self.size = self.size + 1

    def display(self):
        if self.head is None:
            print("Empty list !!!")
            return
        current = self.head
        while True:
            print(current.value, end=" <-> ")
            current = current.next
            if current is self.head:
                break
        print("reached head again")

    def getlength(self):
        current = self.head
        count = 0
        while True:
            if self.head is None:
                print("empty list")
                return
            count = count + 1
            current = current.next
            if current is self.head:
                break
        return count

    def search(self,value):
        if self.head is None:
            print("empty string")
            return
        count = 1
        current = self.head
        while True:
            if current.value == value:
                print(f"{value} is present at {count}")
                return True
            count = count + 1
            current = current.next

            if current is self.head:
                print("element not found")
                return False

def main():
    list = Dcl()
    list.append(12)
    list.append(14)
    list.append(16)
    list.append(35)
    print(f"length of given list is :: {list.getlength()} ")
    list.display()
    x = int(input("enter element to search for :: "))
    print(f"{x} is present in list?? :: {list.search(x)}")

if __name__ == '__main__':
    main()