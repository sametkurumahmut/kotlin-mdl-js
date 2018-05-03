package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.MdlButtonColor
import kotlinx.html.dom.create
import kotlinx.html.js.a
import org.w3c.dom.Element
import org.w3c.dom.HTMLAnchorElement
import kotlin.browser.document

open class MdlColoredMiniFloatingActionButtonLink(
        element: HTMLAnchorElement,
        icon: IMdlMaterialIcon<Element>? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty)
    : MdlMiniFloatingActionButtonBase<HTMLAnchorElement>(
        element,
        icon,
        MdlButtonColor.COLORED,
        hasRippleEffect,
        classes) {

    constructor(
            icon: IMdlMaterialIcon<Element>? = null,
            href: String? = null,
            target: String? = null,
            hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
            classes: String = String.empty) : this(document.create.a(href, target), icon, hasRippleEffect, classes)
}
