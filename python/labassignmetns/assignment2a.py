#        Implement the link list
class Linkedlist:
    def __init__(self):
        self.head = None

    class Node:
        def __init__(self,data):
            self.data = data
            self.next = None

    def append(self,data):
        node = Linkedlist.Node(data)
        if self.head is None:
            self.head = node
            return
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = node

    def display(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")

    def getlength(self):
        current = self.head
        count = 0
        while current:
            count = count + 1
            current = current.next
        return count
    def search(self,data):
        current = self.head
        count = 1
        while current:
            if(current.data == data):
                print(f"{data} is present at index(not 0 indexed) = {count}")
                return True
            count = count + 1
            current = current.next

def main():
    list = Linkedlist()
    list.append(12)
    list.append(10)
    list.append(34)
    list.append(56)
    list.display()
    x = int(input("enter data to search for :: "))
    print(f"{x} is present in list? :: {list.search(x)}")
    print("length of given linked list :: ",list.getlength())
    list.display()

if __name__ == '__main__':
    main()