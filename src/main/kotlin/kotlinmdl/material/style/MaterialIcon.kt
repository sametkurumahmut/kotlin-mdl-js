package kotlinmdl.material.style

open class MaterialIcon(override val name: String, override val ligature: String, override val hexCharacterCode: String)
    : IMaterialIcon {

    override val hexCharacterReference by lazy { "&#x$hexCharacterCode;" }
}
