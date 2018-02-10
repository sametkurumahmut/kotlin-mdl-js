package kotlinmdl.components.dslish

import kotlinmdl.components.*
import kotlinmdl.extensions.empty
import kotlinmdl.extensions.plus
import kotlinx.html.ATarget
import org.w3c.dom.Element

//region Mdl Component Extensions
fun <T : Element> MdlComponent<T>.layout(classes: String = kotlin.String.empty, block: MdlLayout.() -> Unit = {})
        = this + kotlinmdl.components.MdlLayout(classes).apply(block)

fun <T : Element> MdlComponent<T>.layoutSpacer(classes: String = String.empty, block: MdlLayoutSpacer.() -> Unit = {})
        = this + MdlLayoutSpacer(classes).apply(block)

fun <T : Element> MdlComponent<T>.layoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {}) = this + MdlLayoutTitle(title, classes).apply(block)

fun <T : Element> MdlComponent<T>.nav(classes: String = kotlin.String.empty, block: MdlLayoutNav.() -> Unit = {})
        = this + MdlLayoutNav(classes).apply(block)

fun MdlLayout.content(
        title: String = String.empty,
        classes: String = String.empty,
        body: MdlLayoutContent.() -> Unit = {})
        = this + MdlLayoutContent(title, classes, { this@content.content = this; body() })

fun MdlLayout.drawer(classes: String = String.empty, block: MdlLayoutDrawer.() -> Unit = {})
        = this + MdlLayoutDrawer(classes).also { this.drawer = it; it.block() }

fun MdlLayout.fixedDrawer(classes: String = String.empty, block: MdlLayoutDrawer.() -> Unit = {})
        = this + MdlLayoutDrawer(classes).also { this.drawer = it; this.hasFixedDrawer = true; it.block() }

fun MdlLayout.fixedHeader(
        isSeamed: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: MdlFixedLayoutHeader.() -> Unit = {})
        = this + MdlFixedLayoutHeader(isSeamed, isTransparent, classes).also {
    this.header = it
    this.hasFixedHeader = true
    it.block()
}

fun MdlLayout.scrollableHeader(
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: MdlScrollableLayoutHeader.() -> Unit = {})
        = this + MdlScrollableLayoutHeader(isTransparent, classes).also {
    this.header = it
    it.block()
}

fun MdlLayout.waterfallHeader(
        isTopHideable: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: MdlWaterfallLayoutHeader.() -> Unit = {})
        = this + MdlWaterfallLayoutHeader(isTopHideable, isTransparent, classes).also {
    this.header = it
    it.block()
}

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
fun Element.mdlLayout(classes: String = String.empty, block: MdlLayout.() -> Unit = {})
        = this + MdlLayout(classes).apply(block)

fun Element.mdlLayoutSpacer(classes: String = String.empty, block: MdlLayoutSpacer.() -> Unit = {})
        = this + MdlLayoutSpacer(classes).apply(block)

fun Element.mdlLayoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {}) = this + MdlLayoutTitle(title, classes).apply(block)

fun Element.mdlNav(classes: String = String.empty, block: MdlLayoutNav.() -> Unit = {})
        = this + MdlLayoutNav(classes).apply(block)
//endregion
