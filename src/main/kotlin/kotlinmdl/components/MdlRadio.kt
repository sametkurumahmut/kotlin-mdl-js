package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.label
import org.w3c.dom.HTMLLabelElement
import kotlin.browser.document

open class MdlRadio(
        element: HTMLLabelElement,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty) : MdlRadioBase<HTMLLabelElement>(element, hasRippleEffect, classes) {

    constructor(htmlFor: String, hasRippleEffect: Boolean = MdlConfig.hasRippleEffect, classes: String = String.empty)
            : this(document.create.label().also { it.htmlFor = htmlFor }, hasRippleEffect, classes)
}
