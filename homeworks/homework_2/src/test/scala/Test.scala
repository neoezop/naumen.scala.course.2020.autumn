import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(1, 100) == 2418)
            assert(Exercises.sumOfDivBy3Or5(-100, 100) == 0)
            assert(Exercises.sumOfDivBy3Or5(-1000000, 2000000) == 699999500000L)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(100) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(33) == Seq(3, 11))
            assert(Exercises.primeFactor(256) == Seq(2))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(5, 3), Vector2D(2, 7), Vector2D(3, 4), Vector2D(9, 10)) == 98.0)
            assert(Exercises.sumScalars(Vector2D(6, 3), Vector2D(14, 22), Vector2D(5, 1), Vector2D(3, 100)) == 265.0)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Vector2D(12, 6), Vector2D(7, 33), Vector2D(11, 13), Vector2D(2, 4)) == 1.5947446096894458)
            assert(Exercises.sumCosines(Vector2D(2, 8), Vector2D(3, 12), Vector2D(4, 16), Vector2D(3, 4)) == 1.9216353751380653)
        }
        'test_sortByHeavyWeight -{
            assert(Exercises.sortByHeavyweight() == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium",
                                                        "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper",
                                                        "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium",
                                                        "Magnesium", "Potassium", "Graphite"))
        }
    }
}
