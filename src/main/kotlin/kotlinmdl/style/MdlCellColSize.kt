package kotlinmdl.style

enum class MdlCellColSize : IMdlCellColSize {

    S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellColSize.values()[this.value - 1]
    override fun toPhone() = MdlPhoneCellColSize.values()[if (this.value > 3) 3 else this.value - 1]
    override fun toTablet() = MdlTabletCellColSize.values()[if (this.value > 7) 7 else this.value - 1]

    override fun toString() = "mdl-cell--$value-col"
}

enum class MdlDesktopCellColSize : IMdlDesktopCellColSize {

    S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12;

    override val value = this.ordinal + 1

    override fun toPhone() = MdlPhoneCellColSize.values()[if (this.value > 3) 3 else this.value - 1]
    override fun toStandard() = MdlCellColSize.values()[this.value - 1]
    override fun toTablet() = MdlTabletCellColSize.values()[if (this.value > 7) 7 else this.value - 1]

    override fun toString() = "mdl-cell--$value-col-desktop"
}

enum class MdlPhoneCellColSize : IMdlPhoneCellColSize {

    S1, S2, S3, S4;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellColSize.values()[this.value - 1]
    override fun toStandard() = MdlCellColSize.values()[this.value - 1]
    override fun toTablet() = MdlTabletCellColSize.values()[this.value - 1]

    override fun toString() = "mdl-cell--$value-col-phone"
}

enum class MdlTabletCellColSize : IMdlTabletCellColSize {

    S1, S2, S3, S4, S5, S6, S7, S8;

    override val value = this.ordinal + 1

    override fun toDesktop() = MdlDesktopCellColSize.values()[this.value - 1]
    override fun toPhone() = MdlPhoneCellColSize.values()[if (this.value > 3) 3 else this.value - 1]
    override fun toStandard() = MdlCellColSize.values()[this.value - 1]

    override fun toString() = "mdl-cell--$value-col-tablet"
}
