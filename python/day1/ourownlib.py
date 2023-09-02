def main():
    hello("world")
    goodbye('world')


def hello(name):
    print(f"hello,{name}")

def goodbye(name):
    print(f"goodbye, {name}")



 # __name__ is a special var whose value is automatically set by python to "__main__" when we run file from command line
 #but when we import a file it's value is set to module name itself so main() function will not be called
if __name__ == "__main__":
    main()   #here we are calling main simply so it will run whenever this module gets called or imported i.e. whenever it is loaded by python main will be called for sure
