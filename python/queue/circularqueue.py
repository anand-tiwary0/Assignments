## implementatin of cicular queue using array
import array


class circularqueue:
    def __init__(self,size):
        self.arr = array.array('i',[0]*size)
        self.front = -1
        self.end = -1
    def is_empty(self):
        return self.end == -1 == self.front or self.end < self.front
    def is_full(self):
        return