package kotlinmdl.style

interface IMdlBaseCellColSize : IMdlStyle {

    val value: Int
}

interface IMdlCellColSize : IMdlBaseCellColSize {

    fun toDesktop(): IMdlDesktopCellColSize
    fun toPhone(): IMdlPhoneCellColSize
    fun toTablet(): IMdlTabletCellColSize
}

interface IMdlDesktopCellColSize : IMdlBaseCellColSize {

    fun toPhone(): IMdlPhoneCellColSize
    fun toStandard(): IMdlCellColSize
    fun toTablet(): IMdlTabletCellColSize
}

interface IMdlPhoneCellColSize : IMdlBaseCellColSize {

    fun toDesktop(): IMdlDesktopCellColSize
    fun toStandard(): IMdlCellColSize
    fun toTablet(): IMdlTabletCellColSize
}

interface IMdlTabletCellColSize : IMdlBaseCellColSize {

    fun toDesktop(): IMdlDesktopCellColSize
    fun toPhone(): IMdlPhoneCellColSize
    fun toStandard(): IMdlCellColSize
}
