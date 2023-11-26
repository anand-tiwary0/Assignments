 """
Create a single linked list with data and address with following functions:
    1. Traverse each node of the list
    2. Insert a node at the particular position
    3. Delete a node at the particular position
    4. Check if the list is empty
    5. Count the number of nodes in the list
    6. Find the node for the given key
    7. Deletion of a node for the given key
    8. Deletion of a key at given position
    9. Sort the list
    10. Reverse the list.
(Write the program, execute and specify the output)
"""
import sys


class Node:
    def __init__(self, value):
        self.data = value
        self.next = None


class CustomLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def appendtolist(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
            self.tail = new_node
        else:
            """traverse till end and then append or use tail"""
            self.tail.next = new_node
            self.tail = new_node
        self.size = self.size + 1

    def is_empty(self):
        return self.head is None

    def number_of_node(self):
        return self.size

    def traverse_each_node(self):
        if self.head is None:
            print("list is empty")
        else:
            temp = self.head
            while temp is not None:
                print(temp.data, end="-->")
                temp = temp.next
            print("END")

    # insert node at particular position
    def insert_node_at_position(self, position, value):
        new_node = Node(value)
        if self.is_empty():
            self.head = new_node
            self.tail = new_node
            self.size += 1
        elif position > self.size:
            sys.exit("wrong position choice")
        elif position == self.size:
            self.appendtolist(value)
        else:
            temp = self.head
            count = 0
            while count < position - 1 and temp.next is not None:
                temp = temp.next
                count += 1
            new_node.next = temp.next
            temp.next = new_node
            self.size += 1

    def delete_node_at_position(self, position):
        if self.head is None:
            sys.exit("list is empty deletion will cause underflow")
        if position == 0:
            deleted_value = self.head.data
            self.head = self.head.next
            self.size -= 1
            if self.size == 0:
                self.tail = None
            return deleted_value
        elif position > self.size:
            sys.exit("wrong choice of position")
        else:
            temp = self.head
            count = 0
            while count < position - 1 and temp.next is not None:
                temp = temp.next
                count += 1
            if temp.next is not None and temp.next.next is None:
                deleted_value = self.tail.data
                self.tail = temp
                self.tail.next = None
                self.size -= 1
                return deleted_value
            elif temp.next is not None:
                deleted_value = temp.next.data
                temp.next = temp.next.next
                self.size -= 1
                return deleted_value

    def find_node_by_key(self, key):
        node_array = []
        if self.head is None:
            sys.exit("list is empty")
        temp = self.head
        index = -1
        while temp is not None:
            index = index + 1
            if temp.data == key:
                node_array.append(index)
            temp = temp.next
        if index == -1:
            sys.exit("the given key is not present in any node of this list")
        return node_array

    #deletion of node for a given key
    def deletion_of_node_for_key(self,key):
        array_deleted_index= []
        if self.head is None:
            sys.exit("list is empty .. aborting!!")
        temp = self.head
        index = 0
        while temp is not None:
            if temp.data == key:
                array_deleted_index.append(index)
                self.delete_node_at_position(index)
                index -= 1# adjusting index
            temp = temp.next
            index += 1
        return array_deleted_index

    # deletion of key at a give position -- here key will set to None at given position
    def deletion_of_key_at_position(self, position):
        if self.head is None:
            sys.exit("list is empty")
        temp = self.head
        count = 0
        while count < position and temp.next is not None:
            temp = temp.next
            count += 1
        deleted_data = temp.data
        temp.data = None
        self.traverse_each_node()
        return deleted_data

    def reverse_list(self):
        self.tail = self.reverse_list_helper(self.head, None)

    def reverse_list_helper(self, current, previous):
        if current.next is None:
            self.head = self.tail
            self.head.next = previous
            previous.next = None
            return previous
        current.next = self.reverse_list_helper(current.next, current)
        current.next.next = current
        current.next = None
        return current

    def get_position_for_node(self, node_value):
        if self.head is None:
            return -1  # List is empty, node not found

        current = self.head
        position = -1  # Initialize position to -1 (not found)
        current_position = 0  # Initialize current_position to 0

        while current is not None:
            if current.data == node_value:
                position = current_position  # Update the position
            current = current.next
            current_position += 1
        return position

    def sort_list(self):
        if self.size <= 1:
            return self

        sorted_list = CustomLinkedList()
        current = self.head

        while not self.is_empty():
            smallest_node = self.head
            current = self.head

            while current is not None:
                if current.data < smallest_node.data:
                    smallest_node = current
                current = current.next

            sorted_list.appendtolist(smallest_node.data)
            self.delete_node_at_position(self.get_position_for_node(smallest_node.data))

        return sorted_list


def main():
    # creating a linked list
    list = CustomLinkedList()
    # appending data items
    print("performing insertion operation ... ")
    list.appendtolist(12)
    list.appendtolist(12)
    list.appendtolist(23)
    list.appendtolist(16)
    list.appendtolist(655)
    list.appendtolist(90)
    list.appendtolist(67)
    print("list after various appends :: ")
    list.traverse_each_node()
    # insertion of elements at particular positions indexing used 0
    print("performing positional insertion operation ... ")
    list.insert_node_at_position(0,45)
    list.insert_node_at_position(list.number_of_node(),900)
    print("list after position specific insertion operations :: ")
    list.traverse_each_node()
    # traversing each node of list and printing
    list.traverse_each_node()
    # deletion of nodes
    print("performing some deletion operations ... ")
    deleted_value = list.delete_node_at_position(2)
    deleted_value2 = list.delete_node_at_position(4)
    print(f"{deleted_value,deleted_value2} containing nodes were deleted")
    # again printing list after deletion operation
    print("list after deletion operation :: ")
    list.traverse_each_node()
    print("adding few elements for testing purpose :: ")
    list.appendtolist(12)
    list.insert_node_at_position(1,12)
    list.insert_node_at_position(3,12)
    list.traverse_each_node()
    print("checking if list is empty or not ... ")
    print(list.is_empty())
    print("number of nodes/length of list ... ")
    print(list.number_of_node())
    print("-----------------------------")
    key = int(input("enter key value to search for :: "))
    found_nodes = list.find_node_by_key(key)
    print(f"{key} is present at these indexes :: ")
    print(found_nodes)
    print("------------------------------")
    key_to_delete = int(input("enter a key value for deletion operation :: "))
    deleted_nodes = list.deletion_of_node_for_key(key_to_delete)
    print("deleted nodes were at index :: ")
    print(deleted_nodes)
    print("list is being reversed ... ")
    list.reverse_list()
    print("result after reversal :: ")
    list.traverse_each_node()

    print("list is begin sorted ... ")
    sorted_list = list.sort_list()
    print("list after sorting operation :: ")
    sorted_list.traverse_each_node()
    print(":: >>>> end of testing various operations <<<< ::")

if __name__ == '__main__':
    main()
