def bubblesort(arr):
    for i in range(len(arr)-1):
        flag = True
        for j in range(len(arr)-1-i):
            if arr[j]>arr[j+1]:
                temp = arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
                flag = False
        if flag is True:
            return
    return arr


def main():
    arr = [3, 5, 8, 1, 20, 12, 34, 5, 67, 89, 23, 1, 0]
    print("before sort")
    print(arr)
    bubblesort(arr)
    print("after sorting")
    print(arr)


if __name__ == '__main__':
    main()
