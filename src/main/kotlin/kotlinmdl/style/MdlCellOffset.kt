package kotlinmdl.style

enum class MdlCellOffset : IMdlCellOffset {

    O1, O2, O3, O4, O5, O6, O7, O8, O9, O10, O11;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellOffset.values()[this.value - 1]
    override fun toPhone() = MdlPhoneCellOffset.values()[if (this.value > 2) 2 else this.value - 1]
    override fun toTablet() = MdlTabletCellOffset.values()[if (this.value > 6) 6 else this.value - 1]

    override fun toString() = "mdl-cell--$value-offset"
}

enum class MdlDesktopCellOffset : IMdlDesktopCellOffset {

    O1, O2, O3, O4, O5, O6, O7, O8, O9, O10, O11;

    override val value = this.ordinal + 1

    override fun toPhone() = MdlPhoneCellOffset.values()[if (this.value > 2) 2 else this.value - 1]
    override fun toStandard() = MdlCellOffset.values()[this.value - 1]
    override fun toTablet() = MdlTabletCellOffset.values()[if (this.value > 6) 6 else this.value - 1]

    override fun toString() = "mdl-cell--$value-offset-desktop"
}

enum class MdlPhoneCellOffset : IMdlPhoneCellOffset {

    O1, O2, O3;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellOffset.values()[this.value - 1]
    override fun toStandard() = MdlCellOffset.values()[this.value - 1]
    override fun toTablet() = MdlTabletCellOffset.values()[this.value - 1]

    override fun toString() = "mdl-cell--$value-offset-phone"
}

enum class MdlTabletCellOffset : IMdlTabletCellOffset {

    O1, O2, O3, O4, O5, O6, O7;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellOffset.values()[this.value - 1]
    override fun toStandard() = MdlCellOffset.values()[this.value - 1]
    override fun toPhone() = MdlPhoneCellOffset.values()[if (this.value > 2) 2 else this.value - 1]

    override fun toString() = "mdl-cell--$value-offset-tablet"
}
