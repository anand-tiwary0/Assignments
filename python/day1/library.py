# No, modules and libraries in Python are not the same, but they are related concepts.
#
# 1. **Modules:** Modules are individual Python files that contain reusable code. These files can define functions,
# classes, and variables that can be imported and used in other Python scripts. Modules help organize code and make it
# more modular and maintainable. You can create your own modules by simply creating a Python file with a `.py` extension
# and then import and use its contents in other scripts.
#
#     For example, if you have a file named `my_module.py` with some functions, you can import and use those functions in another Python script like this:
#
#     ```python
#     import my_module
#
#     result = my_module.my_function()
#     ```
#
# 2. **Libraries (or Packages):** Libraries or packages in Python are collections of related modules that provide functionality for specific tasks.
# These packages often include a variety of modules, classes, and functions designed to solve particular problems or address specific domains.
# Python's standard library is a collection of built-in modules, while there are numerous third-party libraries and packages available for various purposes.
#
#     For instance, the `math` module is part of the Python standard library, while the `NumPy` library is a third-party package that provides powerful tools
#     for numerical computing. To use them:
#
#     ```python
#     import math
#     import numpy
#     ```
#
# In summary, modules are individual Python files containing code, while libraries (or packages) are collections of modules that offer functionality for specific tasks
# or domains. You can import and use both modules and libraries in your Python programs, but libraries are typically more extensive and specialized in their purpose.

import random  #it imports entire module randon.py to use function in it we have to relate functions to it's scope using random.choice() or random.whwateven()
#from random import choice #it imports function named choice in our current name space         #it is more specific
import statistics
def main():
    coin = random.choice(["heads","tails"])  #return one of item with equal probablity
    print(coin)
    random_num = random.randint(1,10)   #1 and 10 inclusive
    print(random_num)
    cards = ["jack", "king","queen"]
    random.shuffle(cards)   # it returns list shuffled inplace
    print(cards)
    for card in cards:
        print(card,end="")
        print(",",end=" ")
    mean = statistics.mean([100,90])
    print(mean)







if __name__ == '__main__':
    main()
