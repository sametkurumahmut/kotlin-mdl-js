package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlBasicSwitchBase<out T : Element> protected constructor(
        element: T,
        id: String,
        isChecked: Boolean = false,
        label: IMdlSwitchLabel<Element>? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty) : MdlSwitchBase<T>(element, hasRippleEffect, classes), IMdlBasicSwitch<T> {

    protected constructor(
            element: T,
            id: String,
            labelText: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(element, id, isChecked, MdlSwitchLabel(labelText), hasRippleEffect, classes)

    override var input: IMdlSwitchInput<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlSwitchInput(id, isChecked))

    override var label: IMdlSwitchLabel<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = label)
}
