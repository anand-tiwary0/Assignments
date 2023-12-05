def linearsearch(arr,tosearch):
    i = 0
    for element in arr:
        if element == tosearch:
            return i
        else:
            i = i + 1




def main():
    arr = [3, 5, 8, 1, 20, 12, 34, 5, 67, 89, 23, 1, 0]
    print(arr)
    index = linearsearch(arr,0)
    print(f"0 is at {index}")

if __name__ == '__main__':
    main()