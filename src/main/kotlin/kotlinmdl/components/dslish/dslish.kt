package kotlinmdl.components.dslish

import kotlinmdl.components.*
import kotlinmdl.extensions.empty
import kotlinmdl.extensions.plus
import kotlinx.html.ATarget
import org.w3c.dom.Element

//region Mdl Component Extensions
fun <T : Element> MdlComponent<T>.layoutSpacer(classes: String = String.empty, block: MdlLayoutSpacer.() -> Unit = {})
        = this + MdlLayoutSpacer(classes).apply(block)

fun <T : Element> MdlComponent<T>.layoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {}) = this + MdlLayoutTitle(title, classes).apply(block)

fun <T : Element> MdlComponent<T>.nav(classes: String = kotlin.String.empty, block: MdlLayoutNav.() -> Unit = {})
        = this + MdlLayoutNav(classes).apply(block)

fun MdlLayoutDrawer.layoutTitle(
        title: String = String.empty,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {})
        = this + MdlLayoutTitle(title, classes).also { this.layoutTitle = it; it.block() }

fun MdlLayoutHeader.row(classes: String = String.empty, block: MdlLayoutHeaderRow.() -> Unit = {})
        = this + MdlLayoutHeaderRow(classes).apply(block)

fun MdlLayoutHeaderRow.layoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {})
        = this + MdlLayoutTitle(title, classes).also { this.layoutTitle = it; it.block() }

fun MdlLayoutNav.link(
        href: String? = null,
        target: String? = null,
        classes: String = String.empty,
        block: MdlNavLink.() -> Unit = {}) = this + MdlNavLink(href, target, classes).apply(block)

fun MdlLayoutNav.externalLink(
        href: String? = null,
        classes: String = String.empty,
        block: MdlNavLink.() -> Unit = {}) = this + MdlNavLink(href, ATarget.blank, classes).apply(block)
//endregion

//region Element Extensions
fun Element.mdlLayoutSpacer(classes: String = String.empty, block: MdlLayoutSpacer.() -> Unit = {})
        = this + MdlLayoutSpacer(classes).apply(block)

fun Element.mdlLayoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {}) = this + MdlLayoutTitle(title, classes).apply(block)

fun Element.mdlNav(classes: String = String.empty, block: MdlLayoutNav.() -> Unit = {})
        = this + MdlLayoutNav(classes).apply(block)
//endregion
