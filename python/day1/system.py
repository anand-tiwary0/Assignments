import sys

def main():
    #sys.argv #argument vector list of all of the words humans typed in at the prompt
    # try:
    #     print("hello , my name is ",sys.argv[1])
    # except IndexError:
    #     print("too few args")
    if len(sys.argv)<2:
        # print("too few args")
        sys.exit("too few args")
    # elif len(sys.argv)>2:
    #     sys.exit("too many args")
    # else:
    #     print("hello , my name is ", sys.argv[1])
    for arg in sys.argv[1:]:
        print("hello , my name is ",arg)

if __name__ == '__main__':
    main()