package kotlinmdl.style

enum class MdlCellVerticalAlignment : IMdlCellVerticalAlignment {

    STRETCH {
        override val value = "mdl-cell--stretch"
    },
    TOP {
        override val value = "mdl-cell--top"
    },
    MIDDLE {
        override val value = "mdl-cell--middle"
    },
    BOTTOM {
        override val value = "mdl-cell--bottom"
    };

    override fun toString() = this.value
}
