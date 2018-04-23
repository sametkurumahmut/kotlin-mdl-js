package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.IMdlButtonColor
import kotlinx.html.dom.create
import kotlinx.html.js.a
import org.w3c.dom.HTMLAnchorElement
import kotlin.browser.document

open class MdlButtonLink(
        element: HTMLAnchorElement,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlButtonBase<HTMLAnchorElement>(element, buttonColor, hasRippleEffect, classes) {

    constructor(
            href: String? = null,
            target: String? = null,
            buttonColor: IMdlButtonColor? = null,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty)
            : this(document.create.a(href, target), buttonColor, hasRippleEffect, classes)
}
