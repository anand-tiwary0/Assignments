def quicksort(arr, start, right):
    if start < right:  # as we don't have to do any sorting for array with 1 element
        pivot_pos = position(arr, start, right)  # this will give us the position of the pivot element
        # quicksort left half which contains elements less then pivot
        quicksort(arr, start, pivot_pos - 1)
        quicksort(arr, pivot_pos + 1, right)


def position(arr, start, right):
    i = start  # this will look for element which are greater then pivot
    j = right - 1  # this will look for elements which are less then pivot
    p = arr[right]

    # we will keep moving i to right and j to left until they cross each other
    while i < j:
        while arr[i] < p and i < right:
            i += 1
        while arr[j] > p and j > start:
            j -= 1
        if i < j:
            arr[i], arr[j] = arr[j], arr[i]
    # now they have crossed each other then stop and it ith position is greater then pivot swap
    if arr[i] > p:
        arr[i], arr[right] = arr[right], arr[i]

    return i


def main():
    arr = [3, 5, 8, 1, 20, 12, 34, 5, 67, 89, 23, 1, 0]
    print("before sort")
    print(arr)
    quicksort(arr, 0, len(arr) - 1)
    print("after sorting")
    print(arr)


if __name__ == '__main__':
    main()
