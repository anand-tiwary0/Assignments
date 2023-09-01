# def main():
#     student = get_student()   #we can unpack sequece of values returned via this syntax
#     #we can index into tuple numerically
#     # if student[0] == "padma":
#         # student[1] = "Ravenclaq"  #tuple does not support item assignment
#     # print("name = ",student[0]," house= ", student[1] )
#     print(f"{student['name']} from {student['house']}")  #dict are mutable and can be indexed via key values
#
# # tuple is a datatype in python that is basically a immutable list
#
# def get_name():
#     name = input("Name: ")
#     return name
#
# def get_house():
#     return input("House: ")
#
# def get_student():
#     # name = input("Name : ")
#     # house = input("House: ")
#     # return (name,house)   #this is returning actually tuple insise of that tuple there are two values here , tells python to do so
#     student = {}
#     student["name"] = input("Name : ")
#     student["house"] = input("House : ")
#     return student    #we are returning dict
#
# if __name__ == "__main__":
#     main()
import sys


#classes allows us to create our own type variable
class Student:
      # ...  #these dots indicate that we will define it later

      #if we provide default value to a var here in init method it become optional argument
      def __init__(self,name, house ,patronus):  #here by using this instance function we are adding instance var to object just like keys in dict
          self.name = name    #self keyword is used to store the passed values in the current object that have been instancitated self gives access to current object
                                #that was just created
          if not name:
              # print("Missing name")
              #   sys.exit("empty name provided")
            #raisning error
                raise ValueError("missing name")
          if house not in ['gre','df','dfdfdf','dsfasdfsad']:
              raise ValueError("Invalid house")

          self.house = house
          self.patronus = patronus

          #getter
          @property
          def house(self):
              return self.house
          #setter
          @house.setter
          def house(self,house):
              if house not in ["Gryffindor","Hufflepuff","Ravenclaw","Slytherin"]:
                  raise ValueError("Invalid house ")
              self.house = house


      def __str__(self):
          return f"{self.name} from {self.house} from {self.patronus}"


    #these user defined function can be called anytime
      def charm(self):
          match self.patronus:
              case "stag" :
                  return "stag emoji"
              case "otter":
                  return "otter emoji"
              case "jack russell terrier":
                  return "emoji for this"
              case _ :
                  return "////"



def main():
    student = get_student()
    # print(f"{student.name} from {student.house}")
#classes are mutable but we can also make them immutable in python
    print(student)
    print("expect patronusm")
    print(student.patronus)
def get_student():
    # student = Student()
    # student.name = input("Nmae : ")
    # student.house = input("House : ")
    name = input("Name : ")
    house = input("House : ")
    patronus = input("Patronus : ")
    # student = Student(name,house)  #constructor call consturcts a student object
    # return student
    # try:
    #     return Student(name,house)
    # except ValueError:
    #     ... #handel it in other way
    return Student(name,house,patronus)

if __name__ == '__main__':
    main()