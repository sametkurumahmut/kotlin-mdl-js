package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.label
import org.w3c.dom.Element
import org.w3c.dom.HTMLLabelElement
import kotlin.browser.document

open class MdlBasicCheckBox : MdlBasicCheckBoxBase<HTMLLabelElement> {

    constructor(
            element: HTMLLabelElement,
            id: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) : super(element, id, isChecked, null, hasRippleEffect, classes)

    constructor(
            id: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(document.create.label().also { it.htmlFor = id }, id, isChecked, hasRippleEffect, classes)

    constructor(
            element: HTMLLabelElement,
            id: String,
            labelText: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) : super(element, id, labelText, isChecked, hasRippleEffect, classes)

    constructor(
            id: String,
            labelText: String,
            isChecked: Boolean = false,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(document.create.label().also { it.htmlFor = id }, id, labelText, isChecked, hasRippleEffect, classes)

    protected constructor(
            element: HTMLLabelElement,
            id: String,
            isChecked: Boolean = false,
            label: IMdlCheckBoxLabel<Element>? = null,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) : super(element, id, isChecked, label, hasRippleEffect, classes)
}
