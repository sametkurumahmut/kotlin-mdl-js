package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlChip<out T : Element> : IMdlComponent<T> {

    var hasContact: Boolean
    var isDeletable: Boolean

    companion object {

        const val BLOCK_NAME = "mdl-chip"
        const val CONTACT_MODIFIER_NAME = "mdl-chip--contact"
        const val DELETABLE_MODIFIER_NAME = "mdl-chip--deletable"
    }
}
