package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.MdlButtonColor
import kotlinx.html.dom.create
import kotlinx.html.js.a
import org.w3c.dom.HTMLAnchorElement
import kotlin.browser.document

open class MdlColoredRaisedButtonLink(
        element: HTMLAnchorElement,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlRaisedButtonBase<HTMLAnchorElement>(element, MdlButtonColor.COLORED, hasRippleEffect, classes) {

    constructor(
            href: String? = null,
            target: String? = null,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) : this(document.create.a(href, target), hasRippleEffect, classes)
}
