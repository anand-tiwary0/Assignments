import sys
# print(__name__)
from ourownlib import hello  #here when we import the file the file will be searched and read line by line from top
#to bottom and left to right and it's __name__ will not be set to __main__ this time as it is not being run directly form
#command line
if len(sys.argv) == 2:
    hello(sys.argv[1])