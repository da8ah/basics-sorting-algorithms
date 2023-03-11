using System;

namespace MergeCS
{
    class Merge
    {
        static void Main(string[] args)
        {
            var watch = System.Diagnostics.Stopwatch.StartNew();
            int[] arr = { 5, 21, 44, 33, 18, 10 };
            merge(arr);
            watch.Stop();
            var elapsedMs = watch.Elapsed.TotalSeconds;
            Console.WriteLine("[" + string.Join(",", arr) + "] time: " + elapsedMs);
        }

        static void merge(int[] arr)
        {
            // Until there's only one or none elements within the arr
            if (arr.Length <= 1) return;

            // Recursively divide arr = (arr || left || right)
            int mid = (int)Math.Round((double)arr.Length / 2);
            int[] left = arr[..mid];
            int[] right = arr[mid..arr.Length];
            merge(left);
            merge(right);

            // Merge left & right into the arr for each divition's pair
            mergeSort(left, right, arr);
        }

        static void mergeSort(int[] left, int[] right, int[] arr)
        {
            // Iterate over left & right
            int indexArr = 0, indexL = 0, indexR = 0;
            while (indexL < left.Length && indexR < right.Length)
            {
                if (left[indexL] < right[indexR])
                {
                    // when left it's lower than right
                    arr[indexArr] = left[indexL]; // add left element to arr
                    // and advance one position arr & left
                    indexArr++;
                    indexL++;
                }
                else
                {
                    // otherwise
                    arr[indexArr] = right[indexR]; // add right element to arr
                    // and advance one position arr & right
                    indexArr++;
                    indexR++;
                }
            }

            // Add remaining left & right elements
            while (indexL < left.Length)
            {
                arr[indexArr] = left[indexL];
                indexArr++;
                indexL++;
            }
            while (indexR < right.Length)
            {
                arr[indexArr] = right[indexR];
                indexArr++;
                indexR++;
            }
        }
    }
}