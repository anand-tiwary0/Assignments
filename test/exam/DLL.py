# first define a node
class Node:
    def __init__(self,prev=None,data=None,next=None):
        self.prev = prev
        self.data = data
        self.next = next


class DLL:
    def __init__(self):
        self.head = None
    def insert_first(self,value):
        newNode = Node(data=value)
        if self.head is None:
            self.head = newNode
        else:
            newNode.next = self.head
            self.head.prev = newNode
            self.head = newNode
            newNode.prev = None

    def append(self, value):
        newNode = Node(data=value)
        if self.head is None:
            self.insert_first(value)
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            # now current indicates last node of existing list
            current.next = newNode
            newNode.prev = current

    def print(self):
        current = self.head
        while current:
            print(current.data, end="<-->")
            current = current.next
        print("NONE")

    def insertafter(self,prev_data,new_data):
        newNode = Node(data=new_data)
        if self.head is None:
            self.insert_first(new_data)
        else:
            current = self.head
            while current.data != prev_data and current:
                current = current.next
            if not current:
                print("no node with given value found")
            else:
                newNode.next = current.next
                current.next.prev = newNode
                newNode.prev = current
                current.next = newNode

    def insertafterNode(self,prev_node,new_data):
        newNode = Node(data=new_data)
        if prev_node is None:
            print("can't insert")
        else:
            newNode.next = prev_node.next
            prev_node.next.prev = newNode
            newNode.prev = prev_node
            prev_node.next = newNode


def main():
    list = DLL()
    list.append(3535)
    list.insert_first(56)
    list.insert_first(67)
    list.insert_first(454)
    list.insertafter(454,43534)
    list.insertafterNode(list.head,454545)
    list.append(57)
    list.append(23)
    list.append(344)
    list.print()


if __name__ == '__main__':
    main()
