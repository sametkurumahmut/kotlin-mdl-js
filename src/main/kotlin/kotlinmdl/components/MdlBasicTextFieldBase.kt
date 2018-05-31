package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlBasicTextFieldBase<out T : Element> protected constructor(
        element: T,
        hasFloatingLabel: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty)
    : MdlTextFieldBase<T>(element, hasFloatingLabel, isExpandable, classes), IMdlBasicTextField<T>
