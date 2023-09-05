#        Stack using simple array
import array
class DCustomStack:
    def __init__(self):
        self.arr = array.array('i')
        self.size = 0
        self.head = -1  #this will be used to point to top of stack

    def insert(self,value):  #this is called push
        self.head = self.head + 1
        self.arr.insert(self.head,value)
        self.size = self.size + 1
    def remove(self):  #this is called pop
        if self.size == 0:
            raise Exception("can't remove from empty stack")
        removed = self.arr.pop(self.head)
        self.head = self.head -1
        self.size = self.size -1
        return removed
    def display(self):
        for i in range(len(self.arr)):
            print(self.arr[i] ," -->> ",end=" ")
        print("END")

    def length(self):
        return self.size


def main():
    stack = DCustomStack()
    stack.insert(34)
    stack.insert(332)
    stack.insert(2)
    stack.insert(1)
    stack.insert(10)
    stack.insert(199)
    stack.display()
    print(stack.remove())
    print(f"current size of stack is {stack.length()}")
    stack.display()

if __name__ == '__main__':
    main()