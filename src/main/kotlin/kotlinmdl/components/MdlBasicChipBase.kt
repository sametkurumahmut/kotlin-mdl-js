package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlBasicChipBase<out T : Element> protected constructor(
        element: T,
        hasContact: Boolean = false,
        isDeletable: Boolean = false,
        classes: String = String.empty) : MdlChipBase<T>(element, hasContact, isDeletable, classes), IMdlBasicChip<T>
