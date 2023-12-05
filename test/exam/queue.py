# class Customqueue:
#     def __init__(self, size):
#         self.list = [0] * size
#         self.end = -1  # element will always be inserted at end
#         self.size = 0
#
#     def is_full(self):
#         return self.size == len(self.list)
#
#     def is_empty(self):
#         return self.size == 0
#
#     def enque(self, value):
#         if self.is_full():
#             raise Exception("can't insert in full queue")
#         else:
#             self.end = self.end + 1
#             self.list[self.end] = value
#             self.size += 1
#
#     def dequeue(self):
#         if self.is_empty():
#             raise Exception("queue is empty")
#         else:
#             removed = self.list[0]
#             for i in range(1, self.end+1):
#                 self.list[i - 1] = self.list[i]
#                 self.end = self.end - 1
#                 self.size = self.size - 1
#         return removed
#     def get_size(self):
#         return self.size
#
#     def display(self):
#         for i in range(self.end):
#             print(self.list[i], end="<--")
#         print("end")
#
#
# def main():
#     queue = Customqueue(10)
#     queue.enque(43)
#     queue.enque(343)
#     queue.enque(34)
#     queue.enque(8776)
#     queue.enque(3344)
#     queue.enque(4)
#     queue.display()
#     print(queue.dequeue())
#     queue.display()
#
#
# if __name__ == '__main__':
#     main()

class CustomQueue:
    def __init__(self, size=10):
        self.data = [0] * size
        self.end = 0

    def is_full(self):
        return self.end == len(self.data)

    def is_empty(self):
        return self.end == 0

    def insert(self, item):
        if self.is_full():
            return False
        self.data[self.end] = item
        self.end += 1
        return True

    def remove(self):
        if self.is_empty():
            raise Exception("Queue is empty!!")
        removed = self.data[0]
        for i in range(1, self.end):
            self.data[i - 1] = self.data[i]
        self.end -= 1
        return removed

    def get_front(self):
        if self.is_empty():
            raise Exception("Queue is empty")
        return self.data[0]

    def display(self):
        for i in range(self.end):
            print(f"{self.data[i]} <-- ", end="")
        print("END")


# Example Usage:
cq = CustomQueue()
cq.insert(1)
cq.insert(2)
cq.insert(3)
cq.display()  # Output: 1 <-- 2 <-- 3 <-- END

removed_value = cq.remove()
print(f"Removed Value: {removed_value}")
cq.display()  # Output: 2 <-- 3 <-- END
