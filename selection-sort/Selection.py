import time


def selection(arr):
    for i in range(0, len(arr) - 1):
        min = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min]:
                min = j
        if min != i:
            arr[i], arr[min] = arr[min], arr[i]  # swap values
    return arr


start = time.time()
arr = selection([12, 31, 25, 8, 32, 17])
end = time.time()
print(arr, "time: " + str((end - start) * 10**3))
