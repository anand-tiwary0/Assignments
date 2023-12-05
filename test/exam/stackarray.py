import array


class CustomStack:
    def __init__(self):
        self.listarray = array.array('i')
        self.tos = -1
        self.size = 0
    def push(self,value):
        self.tos = self.tos + 1
        self.listarray.insert(self.tos,value)
        self.size = self.size + 1
    def pop(self):
        if self.size == 0:
            raise Exception("can't pop from empty stack")
        else:
            removed = self.listarray.pop(self.tos)
            self.size = self.size -1
            self.tos = self.tos -1
        return removed
    def print(self):
        for i in range(len(self.listarray)):
            print(self.listarray[i], end="-->")
        print("TOS")

    def get_length(self):
        return self.size


def main():
    stack = CustomStack()
    stack.push(45)
    stack.push(343)
    stack.push(56)
    stack.print()
    remvoed = stack.pop()
    print(f"removed item = {remvoed}")
    stack.print()

if __name__ == '__main__':
    main()