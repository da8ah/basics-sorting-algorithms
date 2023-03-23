fun insertion(arr: IntArray): IntArray {
    var current: Int
    var i: Int
    for (j in 0..arr.lastIndex - 1) {
        i = j + 1
        current = arr[i]
        while (i > 0 && current < arr[i - 1]) {
            arr[i] = arr[i - 1]
            i--
        }
        arr[i] = current
    }
    return arr
}

fun main() {
    val start = System.currentTimeMillis()
    val arr = insertion(intArrayOf(5, 21, 44, 33, 18, 10))
    val end = System.currentTimeMillis()
    println(arr.contentToString() + " time: " + ((end - start) / 1000.0))
}
