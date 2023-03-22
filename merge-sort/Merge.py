import time
import math


def merge(arr):
    mid = math.ceil(len(arr) / 2)
    if len(arr) < 2:
        return arr

    left = arr[0:mid]
    right = arr[mid:len(arr)]
    return mergeSort(merge(left), merge(right))


def mergeSort(left, right):
    arr = []
    while len(left) and len(right):
        if left[0] < right[0]:
            arr.append(left[0])
            left = left[1:]
        else:
            arr.append(right[0])
            right = right[1:]

    return arr + left + right


start = time.time()
arr = merge([5, 21, 44, 33, 18, 10])
end = time.time()
print(arr, "time: " + str((end - start) * 10**3))
