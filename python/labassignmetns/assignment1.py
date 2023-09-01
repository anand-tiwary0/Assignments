"""                                     assignment 1
                Write a Python program to perform the following operation.
                i) Create an Array.
                ii) Insert an element to a specific location in an existing array.
                iii) Append an element in an existing array.
                iv) Remove an element from a specific location of an existing array.
                v) Split an existing array in two specific length.
                vi) Determine the frequency of a given element in an existing array.
"""
import array


#creating custom class to implement all these properties and functions

class Customarray:
    def __init__(self,datatype):
        self.arr = array.array(datatype)
    def create_array(self,elements):
        self.arr = array.array(self.arr.typecode,elements)
    def insert_element(self,index,element):
        self.arr.insert(index,element)
    def append_element(self,element):
        self.arr.append(element)
    def remove_element(self,index):
        if 0<= index < len(self.arr):
            self.arr.remove(index)
        else:
            print("Invalid Index")
    def split_array(self,length1,length2):
        if length1+length2 ==len(self.arr):
            arrpart1 = self.arr[:length1]
            arrpart2 = self.arr[length1:length1+length2]
            return arrpart1,arrpart2
        else:
            print("Invalid array length")

    def frequency_of_element(self,element):
        count = 0
        for _ in self.arr:
            if(_ == element):
                count = count + 1
        return count
    def getlength(self):
        return self.arr.buffer_info()
    def __str__(self):
        return str(self.arr)

def main():
    arrobj = Customarray('i')  #creating customarray object
    arrobj.create_array([23,45,2,2,2,1,4,5])
    print("array before insertion :: ",arrobj)
    arrobj.insert_element(2,400)
    print("array after insertion :: ",arrobj)
    arrobj.append_element(500)
    arrobj.remove_element(2)
    print("array after these operations",arrobj)
    print("length of arrobj = ",arrobj.getlength())
    y = int(input("enter the length to split upon :: "))
    tupleofsplittedarray = arrobj.split_array(y,arrobj.getlength()[1]-y)
    for i in tupleofsplittedarray:
        print(i)
    x = int(input("enter the numbet to find it's frequency :: "))
    frequency = arrobj.frequency_of_element(x)
    print(f"frequency of {x} is {frequency}")

if __name__ == '__main__':
    main()