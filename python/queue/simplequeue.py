## queue implementation using arrays
import array


class queue:
    def __init__(self,size):
        self.arr = array.array('i', [0]*size)
        self.front = -1
        self.maxsize = size
        self.end = -1  # this will point to last inserted element

    def isfull(self):
        return self.end == self.maxsize-1 or self.front>self.end

    def isempty(self):
        return self.front == -1 and self.end == -1

    def enqueue(self, value):
        if (self.isfull()):
            raise Exception("can't insert in full queue - overflow")
        else:
            if self.isempty():
                self.front = 0
            self.end = self.end + 1
            self.arr.insert(self.end, value)

    def dequeue(self):
        if (self.isempty()):
            raise Exception("trying to remove from empty queue - underflow")
        else:
            removed = self.arr[self.front]
            if self.end == self.front:
                self.front = -1
                self.end = -1
            else:
                self.front = self.front + 1

        if self.front>self.end:
            self.front = -1
            self.end = -1
            print("queue had no elements but was full sometimes now it's empty cheers!")
        return removed

    def display(self):
        if self.isempty():
            print("queue is empty")
        else:
            for i in range(self.front,self.end + 1):
                print(self.arr[i]," << ",end="")
        print()

    def len(self):
        return len(self.arr)


def main():
    size = int(input("enter the size of queue :: "))
    que = queue(size)
    for i in range(1, 10):
        que.enqueue(i)
    que.display()
    print(que.dequeue())
    print(f"queue after deletion operation")
    que.display()


if __name__ == '__main__':
    main()
