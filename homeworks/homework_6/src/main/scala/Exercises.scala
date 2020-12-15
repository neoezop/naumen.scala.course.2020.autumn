object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    seq.reverse
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    var a = 1
    var b = 1
    for (_ <- 2 until idx) {
      val temp = b
      b = a + b
      a = temp
    }

    if (idx == 0)
      return 0

    b
  }

  def fibonacci(idx: Int): Seq[Int] = {
    var a = 0;
    var b = 1;
    for (_ <- 0 to idx) yield {
      val temp = b
      val result = a
      b = a + b
      a = temp
      result
    }
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = ???


  def wordReverse(text: String): String = ???

}
