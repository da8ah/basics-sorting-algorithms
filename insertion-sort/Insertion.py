import time


def insertion(arr):
    i = 1
    for j in range(0, len(arr) - 1):
        current = arr[i]
        while (j >= 0 and current < arr[j]):
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = current
        i += 1
    return arr


start = time.time()
arr = insertion([5, 21, 44, 33, 18, 10])
end = time.time()
print(arr, "time: " + str((end - start) * 10**3))
