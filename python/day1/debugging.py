def main():
    x = int(input("enter number of cols:: "))
    printpattern(x)


def printpattern(x):
    for i in range(x):
        for j in range(x):
            if j < x-i-1:
                print(" ",end="")
            else:
                print("#",end="")
        print()

if __name__ == '__main__':
    main()