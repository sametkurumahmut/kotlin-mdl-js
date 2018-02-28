package kotlinmdl.style

interface IMdlBaseCellOffset : IMdlStyle {

    val value: Int
}

interface IMdlCellOffset : IMdlBaseCellOffset {

    fun toDesktop(): IMdlDesktopCellOffset
    fun toPhone(): IMdlPhoneCellOffset
    fun toTablet(): IMdlTabletCellOffset
}

interface IMdlDesktopCellOffset : IMdlBaseCellOffset {

    fun toPhone(): IMdlPhoneCellOffset
    fun toStandard(): IMdlCellOffset
    fun toTablet(): IMdlTabletCellOffset
}

interface IMdlPhoneCellOffset : IMdlBaseCellOffset {

    fun toDesktop(): IMdlDesktopCellOffset
    fun toStandard(): IMdlCellOffset
    fun toTablet(): IMdlTabletCellOffset
}

interface IMdlTabletCellOffset : IMdlBaseCellOffset {

    fun toDesktop(): IMdlDesktopCellOffset
    fun toPhone(): IMdlPhoneCellOffset
    fun toStandard(): IMdlCellOffset
}
