package settwo

class SolutionSet2 {

    fun q1() {
        //Write a function merge to 2 integer arrays. input 2 arrays, output merged array

        fun mergeTwo(arr1 : IntArray, arr2: IntArray) {
            val merged = intArrayOf( *arr1, *arr2) // spread operator
            println(merged.contentToString())
        }

        mergeTwo(
            arr1 = intArrayOf(1, 2, 3),
            arr2 =intArrayOf(3, 4, 5)
        )
    }
}