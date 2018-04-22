package kotlinmdl.style

enum class MdlButtonColor : IMdlButtonColor {

    COLORED {
        override val value = "mdl-button--colored"
    },
    PRIMARY {
        override val value = "mdl-button--primary"
    },
    ACCENT {
        override val value = "mdl-button--accent"
    };

    override fun toString() = this.value
}
