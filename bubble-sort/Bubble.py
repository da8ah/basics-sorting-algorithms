import time


def insertion(arr):
    for i in range(0, len(arr)):
        for j in range(0, len(arr) - 1):
            if (arr[j] > arr[j + 1]):
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
    return arr


start = time.time()
arr = insertion([12, 31, 25, 8, 32, 17])
end = time.time()
print(arr, "time: " + str((end - start) * 10**3))
