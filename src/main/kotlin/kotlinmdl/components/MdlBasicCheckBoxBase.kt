package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlBasicCheckBoxBase<out T : Element> protected constructor(
        element: T,
        id: String,
        isChecked: Boolean = false,
        label: IMdlCheckBoxLabel<Element>? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlCheckBoxBase<T>(element, hasRippleEffect, classes), IMdlBasicCheckBox<T> {

    protected constructor(
            element: T,
            id: String,
            labelText: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(element, id, isChecked, MdlCheckBoxLabel(labelText), hasRippleEffect, classes)

    override var input: IMdlCheckBoxInput<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlCheckBoxInput(id, isChecked))

    override var label: IMdlCheckBoxLabel<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = label)
}
