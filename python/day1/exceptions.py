# print("hello, world")
def main():
    x = get_int("what's x? ")
    print(f"x is {x}")






def get_int(prompt):
    while True:
        try:
            x = int(input(prompt))
        except ValueError:
            # print("x is not an integer")
            pass   #statement just ignore the exception even when we are catching it
        else:
            return x
            # break
              #else is executed only when try block succeeded
    # return x


if __name__ == '__main__':
    main()