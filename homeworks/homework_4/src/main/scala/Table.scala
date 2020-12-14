import scala.collection.mutable

class Table(width: Int, height: Int) {
  private val table = mutable.Map[(Int, Int), Cell]()
  private def createEmptyTable() = {
    for { x <- 0 to width
          y <- 0 to height }
      table((x, y)) = new EmptyCell
  }
  createEmptyTable()

  def getCell(ix: Int, iy: Int): Option[Cell] =
    if (isInRange(ix, iy)) {
      Option(table((ix, iy)))
    }
    else {
     None
    }

  def setCell(ix: Int, iy: Int, cell: Cell): Option[Unit] =
    if (isInRange(ix, iy)) {
      Option(table((ix, iy)) = cell)
    }
    else {
      None
    }

  private def isInRange(ix: Int, iy: Int): Boolean =
      ix >= 0 && ix < width &&
      iy >= 0 && iy < height
}