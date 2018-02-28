package kotlinmdl.style

enum class MdlCellOrder : IMdlCellOrder {

    O1, O2, O3, O4, O5, O6, O7, O8, O9, O10, O11, O12;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellOrder.values()[this.value - 1]
    override fun toPhone() = MdlPhoneCellOrder.values()[if (this.value > 3) 3 else this.value - 1]
    override fun toTablet() = MdlTabletCellOrder.values()[if (this.value > 7) 7 else this.value - 1]

    override fun toString() = "mdl-cell--order-$value"
}

enum class MdlDesktopCellOrder : IMdlDesktopCellOrder {

    O1, O2, O3, O4, O5, O6, O7, O8, O9, O10, O11, O12;

    override val value = this.ordinal + 1

    override fun toPhone() = MdlPhoneCellOrder.values()[if (this.value > 3) 3 else this.value - 1]
    override fun toStandard() = MdlCellOrder.values()[this.value - 1]
    override fun toTablet() = MdlTabletCellOrder.values()[if (this.value > 7) 7 else this.value - 1]

    override fun toString() = "mdl-cell--order-$value-desktop"
}

enum class MdlPhoneCellOrder : IMdlPhoneCellOrder {

    O1, O2, O3, O4;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellOrder.values()[this.value - 1]
    override fun toStandard() = MdlCellOrder.values()[this.value - 1]
    override fun toTablet() = MdlTabletCellOrder.values()[this.value - 1]

    override fun toString() = "mdl-cell--order-$value-phone"
}

enum class MdlTabletCellOrder : IMdlTabletCellOrder {

    O1, O2, O3, O4, O5, O6, O7, O8;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellOrder.values()[this.value - 1]
    override fun toStandard() = MdlCellOrder.values()[this.value - 1]
    override fun toPhone() = MdlPhoneCellOrder.values()[if (this.value > 3) 3 else this.value - 1]

    override fun toString() = "mdl-cell--order-$value-tablet"
}
