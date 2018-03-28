package kotlinmdl.components

import kotlinmdl.config.MdlConfig
import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlLayoutTabBar(
        element: HTMLDivElement,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty) : MdlLayoutTabBarBase<HTMLDivElement>(element, hasRippleEffect, classes) {

    constructor(hasRippleEffect: Boolean = MdlConfig.hasRippleEffect, classes: String = String.empty)
            : this(document.create.div(), hasRippleEffect, classes)
}
