# pyPI python package index packages are 3rd party library that can be installed on our pc to gain access to more functions
#pip is a python packge manager that allows us to install packges
# import cowsay
# import sys
#
# def main():
#     if len(sys.argv) == 2:
#         cowsay.cow("hello ," + sys.argv[1])


#API
#requests package allows us to make web requests using python code as if the code is browser itself
import requests
import sys
import json

def main():
    if len(sys.argv) != 2:
        sys.exit("too few arguments")
    response = requests.get("https://itunes.apple.com/search?entity=song&limit=10&term="+sys.argv[1])
    # print(json.dumps(response.json(),indent=2))
    o = response.json()  #this will extract the json content of response we get
    # print(json.dumps(o,indent=2))
    # print(type(o["results"]))
    # for result in o["results"]:
    #     print(type(result))
    #     print(result)
    for result in o["results"]:
        print(result["trackName"])

if __name__ == '__main__':
    main()