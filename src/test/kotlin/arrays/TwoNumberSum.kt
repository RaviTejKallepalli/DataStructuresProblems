package arrays

/*
    array = [3,5,-4,8,11,1,-1,6]
    targetSum = 10
 */
fun main() {
    val output = twoNumberSum(intArrayOf(3, 5, -4, 8, 11, 1, -1, 6), 10)
    print(output.toList())
}

//Time complexity - O(n^2) Space Complexity - O(n)
fun twoNumberSum(input: IntArray, targetSum: Int): IntArray {

    (0 until input.size - 1).forEach { i ->
        (i + 1 until input.size).forEach { j ->
            if (input[i] + input[j] == targetSum) {
                return intArrayOf(input[i], input[j])
            }
        }
    }

    return intArrayOf()
}