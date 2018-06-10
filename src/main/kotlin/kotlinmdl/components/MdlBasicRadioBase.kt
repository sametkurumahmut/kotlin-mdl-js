package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlBasicRadioBase<out T : Element> protected constructor(
        element: T,
        id: String,
        buttonName: String,
        isChecked: Boolean = false,
        label: IMdlRadioLabel<Element>? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty) : MdlRadioBase<T>(element, hasRippleEffect, classes), IMdlBasicRadio<T> {

    protected constructor(
            element: T,
            id: String,
            labelText: String,
            buttonName: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(element, id, buttonName, isChecked, MdlRadioLabel(labelText), hasRippleEffect, classes)

    override var button: IMdlRadioButton<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlRadioButton(id, isChecked, name = buttonName))

    override var label: IMdlRadioLabel<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = label)
}
