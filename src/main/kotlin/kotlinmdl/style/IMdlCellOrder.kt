package kotlinmdl.style

interface IMdlBaseCellOrder : IMdlStyle {

    val value: Int
}

interface IMdlCellOrder : IMdlBaseCellOrder {

    fun toDesktop(): IMdlDesktopCellOrder
    fun toPhone(): IMdlPhoneCellOrder
    fun toTablet(): IMdlTabletCellOrder
}

interface IMdlDesktopCellOrder : IMdlBaseCellOrder {

    fun toPhone(): IMdlPhoneCellOrder
    fun toStandard(): IMdlCellOrder
    fun toTablet(): IMdlTabletCellOrder
}

interface IMdlPhoneCellOrder : IMdlBaseCellOrder {

    fun toDesktop(): IMdlDesktopCellOrder
    fun toStandard(): IMdlCellOrder
    fun toTablet(): IMdlTabletCellOrder
}

interface IMdlTabletCellOrder : IMdlBaseCellOrder {

    fun toDesktop(): IMdlDesktopCellOrder
    fun toPhone(): IMdlPhoneCellOrder
    fun toStandard(): IMdlCellOrder
}
