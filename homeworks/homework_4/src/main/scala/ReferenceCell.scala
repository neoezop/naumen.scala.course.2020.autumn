class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell{

  def getNextCell: Option[Cell] = table.getCell(ix, iy)

  override def toString: String = {
    getNextCell match {
      case Some(cell: ReferenceCell) =>
        if (cell.getNextCell == Option(this)) {
          "cyclic"
        }
        else {
          cell.toString
        }
      case Some(cell: Cell) => cell.toString
      case None => "outOfRange"
    }
  }
}
