package arrays

fun main() {

    print(isValidSubSequenceSolution2(arrayListOf(5,1,22,25,6,-1,8,10), arrayListOf(1,6,-1,10)))
}

fun isValidSubSequence(array: List<Int>, sequence: List<Int>): Boolean {

    if (sequence.size > array.size) return false

    var currentArrayIndex = 0

    repeat((sequence.indices).count()) {
        var isMatch = false

        while (currentArrayIndex < array.size) {
            if (array[currentArrayIndex] == sequence[it]) {
                isMatch = true
                currentArrayIndex++
                break
            } else {
                currentArrayIndex++
            }
        }

        if (!isMatch) return false
    }

    return true
}

fun isValidSubSequenceSolution2(array: List<Int>, sequence: List<Int>): Boolean {

    if (sequence.size > array.size) return false

    var arrIndex = 0
    var seqIndex = 0

    while(arrIndex < array.size && seqIndex < sequence.size) {
        if (array[arrIndex] == sequence[seqIndex]) seqIndex++
        arrIndex++
    }

   return seqIndex == sequence.size
}