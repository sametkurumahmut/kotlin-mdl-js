package kotlinmdl.style

enum class MdlShadow : IMdlShadow {

    DP2 {
        override val value = 2
    },
    DP3 {
        override val value = 3
    },
    DP4 {
        override val value = 4
    },
    DP6 {
        override val value = 6
    },
    DP8 {
        override val value = 8
    },
    DP16 {
        override val value = 16
    },
    DP24 {
        override val value = 24
    };

    override fun toString() = "mdl-shadow--${value}dp"
}
