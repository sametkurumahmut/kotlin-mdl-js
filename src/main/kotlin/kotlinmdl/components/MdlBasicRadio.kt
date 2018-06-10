package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.label
import org.w3c.dom.Element
import org.w3c.dom.HTMLLabelElement
import kotlin.browser.document

open class MdlBasicRadio : MdlBasicRadioBase<HTMLLabelElement> {

    constructor(
            element: HTMLLabelElement,
            id: String,
            buttonName: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) : super(element, id, buttonName, isChecked, null, hasRippleEffect, classes)

    constructor(
            id: String,
            buttonName: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) :
            this(document.create.label().also { it.htmlFor = id }, id, buttonName, isChecked, hasRippleEffect, classes)

    constructor(
            element: HTMLLabelElement,
            id: String,
            labelText: String,
            buttonName: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : super(element, id, buttonName, labelText, isChecked, hasRippleEffect, classes)

    constructor(
            id: String,
            labelText: String,
            buttonName: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) :
            this(
                    document.create.label().also { it.htmlFor = id },
                    id,
                    buttonName,
                    labelText,
                    isChecked,
                    hasRippleEffect,
                    classes)

    protected constructor(
            element: HTMLLabelElement,
            id: String,
            buttonName: String,
            isChecked: Boolean = false,
            label: IMdlRadioLabel<Element>? = null,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) : super(element, id, buttonName, isChecked, label, hasRippleEffect, classes)
}
