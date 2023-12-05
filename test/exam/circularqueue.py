import math


class circularqueue:
    def __init__(self,size=10):
        self.list = [0] * size
        self.front = 0  # removal from front
        self.rear = 0 # insertion at rear
        self.size = 0
    def is_empty(self):
        return self.size == 0
    def is_full(self):
        return self.size == len(self.list)
    def insert(self,value):
        if self.is_full():
            raise Exception("queue is full")
        else:
            self.list[self.rear] = value
            self.rear = (self.rear + 1) % len(self.list)
            self.size = self.size + 1

    def remove(self):
        if self.is_empty():
            raise Exception("can't remove from empty queue")
        else:
            removed = self.list[self.front]
            self.front = (self.front + 1) % len(self.list)
            self.size = self.size -1
        return removed

    def display(self):
        if self.size == 0:
            print("queue is empty")
            return

        temp = self.front
        while True:
            print(self.list[temp],end="<--")
            temp = (temp + 1) % len(self.list)
            if temp == self.rear:
                break
        print("END")


def main():
    # Create a circular queue with a size of 5
    queue = circularqueue(size=5)

    # Insert elements into the queue
    for i in range(1, 6):
        queue.insert(i)

    # Display the queue
    print("Initial Queue:")
    queue.display()

    # Remove elements from the queue
    removed1 = queue.remove()
    removed2 = queue.remove()

    # Display the updated queue
    print("\nQueue after removing two elements:")
    queue.display()

    # Insert more elements into the queue
    for i in range(6, 9):
        queue.insert(i)

    # Display the final queue
    print("\nFinal Queue:")
    queue.display()

if __name__ == '__main__':
    main()
































# class CircularQueue:
#     def __init__(self, size=10):
#         self.data = [0] * size
#         self.end = 0
#         self.front = 0
#         self.size = 0
#
#     def is_full(self):
#         return self.size == len(self.data)
#
#     def is_empty(self):
#         return self.size == 0
#
#     def insert(self, value):
#         if self.is_full():
#             raise Exception("Queue is full!!")
#         self.data[self.end] = value
#         self.end = (self.end + 1) % len(self.data)
#         self.size += 1
#         return True
#
#     def remove(self):
#         if self.is_empty():
#             raise Exception("Queue is empty!!")
#         removed = self.data[self.front]
#         self.front = (self.front + 1) % len(self.data)
#         self.size -= 1
#         return removed
#
#     def get_front(self):
#         if self.is_empty():
#             raise Exception("Queue is empty")
#         return self.data[self.front]
#
#     def display(self):
#         if self.is_empty():
#             print("EMPTY")
#             return
#         i = self.front
#         while True:
#             print(f"{self.data[i]} <--", end=" ")
#             i = (i + 1) % len(self.data)
#             if i == self.end:
#                 break
#         print("END")
#
#
# # Example Usage:
# cq = CircularQueue()
# cq.insert(1)
# cq.insert(2)
# cq.insert(3)
# cq.display()  # Output: 1 <-- 2 <-- 3 <-- END
#
# removed_value = cq.remove()
# print(f"Removed Value: {removed_value}")
# cq.display()  # Output: 2 <-- 3 <-- END
