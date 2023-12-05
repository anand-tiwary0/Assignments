def mergesort(arr):
    if len(arr) > 1:  # as when it's equal to 1 need not do any thing
        # arr division done at mid
        left_arr = arr[:len(arr) // 2]
        right_arr = arr[len(arr) // 2:]
        # recursively calling merge sort on right and left half
        mergesort(left_arr)
        mergesort(right_arr)

        # now we have to merge these two sorted halves
        i = 0  # indicates element for left array
        j = 0  # indicates elements for right array
        k = 0
        while i < len(left_arr) and j < len(left_arr):
            if left_arr[i] < right_arr[j]:
                arr[k] = left_arr[i]
                i = i + 1
            else:
                arr[k] = right_arr[j]
                j = j + 1
            k = k + 1
        while i < len(left_arr):
            arr[k] = left_arr[i]
            i = i + 1
            k = k + 1
        while j < len(right_arr):
            arr[k] = right_arr[j]
            j = j + 1
            k = k + 1
        return arr


def main():
    arr = [3, 5, 8, 1, 20, 12, 34, 5, 67, 89, 23, 1, 0]
    print(arr)
    arr = mergesort(arr)
    print("after sorting")
    print(arr)


if __name__ == '__main__':
    main()
