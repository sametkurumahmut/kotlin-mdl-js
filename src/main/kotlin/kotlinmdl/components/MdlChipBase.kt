package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlChipBase<out T : Element> protected constructor(
        element: T,
        hasContact: Boolean = false,
        isDeletable: Boolean = false,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlChip.BLOCK_NAME) }, classes), IMdlChip<T> {

    override var hasContact by this.toggleClassOfThis(element, IMdlChip.CONTACT_MODIFIER_NAME, hasContact)
    override var isDeletable by this.toggleClassOfThis(element, IMdlChip.DELETABLE_MODIFIER_NAME, isDeletable)
}
