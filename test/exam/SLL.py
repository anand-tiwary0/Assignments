import sys


class Node:
    def __init__(self,value=None,next=None):
        self.data = value
        self.next = next

class SLL:
    def __init__(self):
        self.head = None

    def insert_first(self,value):
        #create node
        node = Node(value)
        node.next = self.head
        self.head = node
    def insert_last(self,value):
        node = Node(value)
        if self.head is None:
            self.insert_first(value)
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            #now temp is at last place
            temp.next = node

    def printSLL(self):
        if self.head is None:
            print("empty list")
            return
        else:
            temp = self.head
            while temp is not None:
                print(temp.data,end="-->")
                temp = temp.next
            print("None")

    def getLength(self):
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
            if current.data == data:
                print(f"{data} is present at index = {count}")
            else:
                count = count + 1
            current = current.next
    #Write an algorithm to insert a node after the given node in a double linked list.

    #when the data is given
    def insertafter(self,prev_data,new_data):
        newnode = Node(new_data)

        if self.head is None:
            self.insert_first(new_data)
        else:
            current = self.head
            while current.data != prev_data and current:
                current = current.next
            if not current:
                print("no node with given value is found")
            else:
                newnode.next = current.next
                current.next = newnode
    def insertafternode(self,pre_node,new_data):
        new_node = Node(new_data)
        if not pre_node:
            sys.exit("NOne found")
        else:
            new_node.next = pre_node.next
            pre_node.next = new_node

def main():
    list = SLL()
    list.insert_first(45)
    list.insert_first(34)
    list.insert_first(23)
    list.insert_last(90)
    list.insert_last(56)
    list.insert_first(89)
    list.insertafter(89,70)
    list.insertafternode(list.head,67)
    list.search(90)
    print(list.getLength())
    list.printSLL()

if __name__ == '__main__':
    main()
