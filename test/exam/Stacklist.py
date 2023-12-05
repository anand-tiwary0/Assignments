class Stack:
    def __init__(self):
        self.list = []
    def is_empty(self):
        return len(self.list) == 0
    def push(self,data):
        self.list.append(data)
    def pop(self):
        if not self.is_empty():
            return self.list.pop()
        else:
            raise Exception("emtpy stack")
    def peek(self):
        if not self.is_empty():
            return self.list[-1]
        else:
            raise Exception("peek from empty stack")
