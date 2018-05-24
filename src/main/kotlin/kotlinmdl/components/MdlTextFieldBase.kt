package kotlinmdl.components

import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlTextFieldBase<out T : Element> protected constructor(
        element: T,
        hasFloatingLabel: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty)
    : MdlComponent<T>(element, classes attributeSeparator IMdlTextField.BLOCK_NAME), IMdlTextField<T> {

    override var hasFloatingLabel
            by this.toggleClassOfThis(element, IMdlTextField.HAS_FLOATING_LABEL_MODIFIER_NAME, hasFloatingLabel)

    override var isAlignRightEnabled by this.toggleClassOfThis(element, IMdlTextField.ALIGN_RIGHT_MODIFIER_NAME)
    override var isExpandable by this.toggleClassOfThis(element, IMdlTextField.EXPANDABLE_MODIFIER_NAME, isExpandable)
}
