package kotlinmdl.material.style

open class MaterialIcon(override val name: String, override val ligature: String, override val codepoint: String)
    : IMaterialIcon {

    override val hexadecimalReference by lazy { "&#x$codepoint;" }
}
