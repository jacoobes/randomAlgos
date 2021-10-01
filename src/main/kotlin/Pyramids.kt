class Pyramids {

    companion object {
        fun stepPyramid (base : Int = 5) {
            for ( i in 1..base) {
                for(j in 1..i ) {
                    print("* ")
                }
                println()
            }
        }

        fun fullPyramid (base : Int = 5) {
            val pattern = " *"

            for (rows in 1 .. base) {
                for ( spaces in base - rows downTo 0) {
                    print(" ")
                }
                for (stars in 1 .. rows) {
                    print(pattern)
                }
                println()
            }
        }

    }
}