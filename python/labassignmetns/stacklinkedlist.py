# #             implementation of stack using linked list
# import assignment2a as linkedlist
# class StackLinked:
#     def __init__(self):
#         self.list = linkedlist.Linkedlist()
#         self.end = -1
#         self.size = 0
#     def insert(self,value):
#         self.list.append(value)
#         self.end = self.end +1
#         self.size = self.size + 1
#     def remove(self):
#         if self.size == 0:
#             raise Exception("can't remove from an empty stack")
#         temp = self.list.head
#         if temp is None:
#             return
#         else:
#             i = 1
#             while i < self.size:
#                 temp = temp.next
#             temp.next = None
#         return temp.data
#
#     def display(self):
#         self.list.display()
#
#
# def main():
#     list = StackLinked()
#     list.insert(34)
#     list.insert(90)
#     list.insert(934)
#     list.insert(900)
#     list.insert(99)
#
#     list.display()
#
#     #removing elments
#     print(list.remove())
#     print(list.remove())
#     list.display()
#
# if __name__ == '__main__':
#     main()
from labassignmetns import assignment2b, assignment2a


class StackLinked:
    def __init__(self):
        self.list = assignment2a.Linkedlist()
        self.size = 0

    def push(self, value):
        newnode = assignment2a.Linkedlist.Node(value)
        if self.size == 0:
            self.list.head = newnode
            self.size = self.size + 1
        else:
            newnode.next = self.list.head
            self.list.head = newnode
            self.size = self.size + 1
    def pop(self):
        if self.size == 0:
            raise Exception("can't pop from empty stack")
        else:
            removeditem = self.list.head.data
            self.list.head = self.list.head.next
            self.size = self.size - 1
        return removeditem
    def display(self):
        current = self.list.head
        # print("None -->",end="")
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("head")
def main():
    list = StackLinked()
    list.push(3445)
    list.push(5)
    list.push(34)
    list.push(45)
    list.push(3)
    print("origianl stack")
    list.display()
    print("popped items :: ")
    print(list.pop())
    print(list.pop())
    print("stack after pop operation")
    list.display()

if __name__ == '__main__':
    main()