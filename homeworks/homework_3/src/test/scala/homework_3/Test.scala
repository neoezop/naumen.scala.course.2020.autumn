package homework_3

import utest._

object Test extends TestSuite{

    def test_prettyBooleanFormatterTestSetRun(formatter: Function[Any, String]) {
        val trueStr = "правда"
        val falseStr = "ложь"
        assert(formatter(true) == trueStr)
        assert(formatter(false) == falseStr)
        assert(formatter(5) == "5")
        assert(formatter(Seq(1,12)) == "List(1, 12)")
    }


    val tests = Tests{
        'test_prettyBooleanFormatter - {
            test_prettyBooleanFormatterTestSetRun(Exercises.prettyBooleanFormatter1)
            test_prettyBooleanFormatterTestSetRun(Exercises.prettyBooleanFormatter2)
            test_prettyBooleanFormatterTestSetRun(Exercises.prettyBooleanFormatter3)
        }
        'test_max1 - {
            assert(Exercises.max1(Seq()) == 0)
            assert(Exercises.max1(Seq(5,5,5)) == 5)
            assert(Exercises.max1(Seq(1,2,3,4,5)) == 5)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(5,5,5)) == Seq(5))
            assert(Exercises.max2(Seq(1,2,3,4,5)) == Seq(5))
        }
        'test_max3 - {
            assert(Exercises.max3(Seq()) == Option.empty)
            assert(Exercises.max3(Seq(5,5,5)) == Option(5))
            assert(Exercises.max3(Seq(1,2,3,4,5)) == Option(5))
        }
        'sum1 - {
            assert(Exercises.sum1(20, 12) == 32)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(-100, -3) == -103)
        }
        'sum2 - {
            assert(Exercises.sum2(20, 12) == 32)
            assert(Exercises.sum2(0, 0) == 0)
            assert(Exercises.sum2(-100, -3) == -103)
        }
        'sum3 - {
            assert(Exercises.sum3(20, 12) == 32)
            assert(Exercises.sum3(0, 0) == 0)
            assert(Exercises.sum3(-100, -3) == -103)
        }
    }
}
