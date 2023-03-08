fun bubble(arr: IntArray): IntArray {
    for (i in 0..arr.lastIndex) {
        for (j in 0..arr.lastIndex - 1) {
            if (arr[j] > arr[j + 1]) {
                var temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}

fun main() {
    val start = System.currentTimeMillis()
    val arr = bubble(intArrayOf(12, 31, 25, 8, 32, 17))
    val end = System.currentTimeMillis()
    println(arr.contentToString() + " time: " + ((end - start) / 1000.0))
}
