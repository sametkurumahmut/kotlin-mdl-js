package kotlinmdl.components.dslish

import kotlinmdl.components.*
import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIconBase
import kotlinmdl.config.MdlConfig
import kotlinmdl.extensions.plus
import kotlinmdl.internal.extensions.empty
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.*
import kotlinx.html.ATarget
import org.w3c.dom.Element

//region Mdl Component Extensions
fun <T : Element> IMdlComponent<T>.grid(
        hasSpacing: Boolean = true,
        classes: String = String.empty,
        block: MdlGrid.() -> Unit = {}) = this + MdlGrid(hasSpacing, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.grid(
        element: T,
        hasSpacing: Boolean = true,
        classes: String = String.empty,
        block: IMdlGrid<T>.() -> Unit = {}): IMdlGrid<T>
        = this + object : MdlGridBase<T>(element, hasSpacing, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.layout(classes: String = String.empty, block: MdlLayout.() -> Unit = {})
        = this + MdlLayout(classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.layout(
        element: T,
        classes: String = String.empty,
        block: IMdlLayout<T>.() -> Unit = {}): IMdlLayout<T>
        = this + object : MdlLayoutBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.layoutSpacer(classes: String = String.empty, block: MdlLayoutSpacer.() -> Unit = {})
        = this + MdlLayoutSpacer(classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.layoutSpacer(
        element: T,
        classes: String = String.empty,
        block: IMdlLayoutSpacer<T>.() -> Unit = {}): IMdlLayoutSpacer<T>
        = this + object : MdlLayoutSpacerBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.layoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {}) = this + MdlLayoutTitle(title, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.layoutTitle(
        element: T,
        title: String,
        classes: String = String.empty,
        block: IMdlLayoutTitle<T>.() -> Unit = {}): IMdlLayoutTitle<T>
        = this + object : MdlLayoutTitleBase<T>(element, title, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.nav(classes: String = String.empty, block: MdlNav.() -> Unit = {})
        = this + MdlNav(classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.nav(
        element: T,
        classes: String = String.empty,
        block: IMdlNav<T>.() -> Unit = {}): IMdlNav<T> = this + object : MdlNavBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.tabs(
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlTabs.() -> Unit = {}) = this + MdlTabs(hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.tabs(
        element: T,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlTabs<T>.() -> Unit = {}): IMdlTabs<T>
        = this + object : MdlTabsBase<T>(element, hasRippleEffect, classes) {}.apply(block)

fun <T : Element> IMdlGrid<T>.cell(
        colSize: IMdlCellColSize? = null,
        desktopColSize: IMdlDesktopCellColSize? = null,
        tabletColSize: IMdlTabletCellColSize? = null,
        phoneColSize: IMdlPhoneCellColSize? = null,
        classes: String = String.empty,
        block: MdlCell.() -> Unit = {})
        = this + MdlCell(colSize, desktopColSize, tabletColSize, phoneColSize, classes).apply(block)

fun <T : Element, E : Element> IMdlGrid<E>.cell(
        element: T,
        colSize: IMdlCellColSize? = null,
        desktopColSize: IMdlDesktopCellColSize? = null,
        tabletColSize: IMdlTabletCellColSize? = null,
        phoneColSize: IMdlPhoneCellColSize? = null,
        classes: String = String.empty,
        block: IMdlCell<T>.() -> Unit = {}): IMdlCell<T> =
        this +
                object : MdlCellBase<T>(element, colSize, desktopColSize, tabletColSize, phoneColSize, classes) {}
                        .apply(block)

fun <T : Element> IMdlLayout<T>.content(
        title: String = String.empty,
        classes: String = String.empty,
        body: MdlLayoutContent.() -> Unit = {})
        = this + MdlLayoutContent(title, classes, { this@content.content = this; body() })

fun <T : Element, E : Element> IMdlLayout<E>.content(
        element: T,
        title: String = String.empty,
        classes: String = String.empty,
        block: IMdlLayoutContent<T>.() -> Unit = {}): IMdlLayoutContent<T>
        = this + object : MdlLayoutContentBase<T>(element, title, classes) {}.also { this.content = it; it.block() }

fun <T : Element> IMdlLayout<T>.drawer(classes: String = String.empty, block: MdlLayoutDrawer.() -> Unit = {})
        = this + MdlLayoutDrawer(classes).also { this.drawer = it; it.block() }

fun <T : Element, E : Element> IMdlLayout<E>.drawer(
        element: T,
        classes: String = String.empty,
        block: IMdlLayoutDrawer<T>.() -> Unit = {}): IMdlLayoutDrawer<T>
        = this + object : MdlLayoutDrawerBase<T>(element, classes) {}.also { this.drawer = it; it.block() }

fun <T : Element> IMdlLayout<T>.fixedDrawer(classes: String = String.empty, block: MdlLayoutDrawer.() -> Unit = {})
        = this + MdlLayoutDrawer(classes).also { this.drawer = it; this.hasFixedDrawer = true; it.block() }

fun <T : Element, E : Element> IMdlLayout<E>.fixedDrawer(
        element: T,
        classes: String = String.empty,
        block: IMdlLayoutDrawer<T>.() -> Unit = {}): IMdlLayoutDrawer<T> =
        this +
                object : MdlLayoutDrawerBase<T>(element, classes) {}.also {
                    this.drawer = it
                    this.hasFixedDrawer = true
                    it.block()
                }

fun <T : Element, E : Element> IMdlLayout<E>.header(
        element: T,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: IMdlLayoutHeader<T>.() -> Unit = {}): IMdlLayoutHeader<T>
        = this + object : MdlLayoutHeader<T>(element, isTransparent, classes) {}.also { this.header = it; it.block() }

fun <T : Element> IMdlLayout<T>.fixedHeader(
        isSeamed: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: MdlFixedLayoutHeader.() -> Unit = {}) =
        this +
                MdlFixedLayoutHeader(isSeamed, isTransparent, classes).also {
                    this.header = it
                    this.hasFixedHeader = true
                    it.block()
                }

fun <T : Element, E : Element> IMdlLayout<E>.fixedHeader(
        element: T,
        isSeamed: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: IMdlFixedLayoutHeader<T>.() -> Unit = {}): IMdlFixedLayoutHeader<T> =
        this +
                object : MdlFixedLayoutHeaderBase<T>(element, isSeamed, isTransparent, classes) {}.also {
                    this.header = it
                    this.hasFixedHeader = true
                    it.block()
                }

fun <T : Element> IMdlLayout<T>.scrollableHeader(
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: MdlScrollableLayoutHeader.() -> Unit = {})
        = this + MdlScrollableLayoutHeader(isTransparent, classes).also { this.header = it; it.block() }

fun <T : Element, E : Element> IMdlLayout<E>.scrollableHeader(
        element: T,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: IMdlScrollableLayoutHeader<T>.() -> Unit = {}): IMdlScrollableLayoutHeader<T> =
        this +
                object : MdlScrollableLayoutHeaderBase<T>(element, isTransparent, classes) {}.also {
                    this.header = it
                    it.block()
                }

fun <T : Element> IMdlLayout<T>.waterfallHeader(
        isTopHideable: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: MdlWaterfallLayoutHeader.() -> Unit = {})
        = this + MdlWaterfallLayoutHeader(isTopHideable, isTransparent, classes).also { this.header = it; it.block() }

fun <T : Element, E : Element> IMdlLayout<E>.waterfallHeader(
        element: T,
        isTopHideable: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty,
        block: IMdlWaterfallLayoutHeader<T>.() -> Unit = {}): IMdlWaterfallLayoutHeader<T> =
        this +
                object : MdlWaterfallLayoutHeaderBase<T>(element, isTopHideable, isTransparent, classes) {}.also {
                    this.header = it
                    it.block()
                }

fun <T : Element> IMdlLayoutDrawer<T>.layoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {})
        = this + MdlLayoutTitle(title, classes).also { this.layoutTitle = it; it.block() }

fun <T : Element, E : Element> IMdlLayoutDrawer<E>.layoutTitle(
        element: T,
        title: String,
        classes: String = String.empty,
        block: IMdlLayoutTitle<T>.() -> Unit = {}): IMdlLayoutTitle<T>
        = this + object : MdlLayoutTitleBase<T>(element, title, classes) {}.also { this.layoutTitle = it; it.block() }

fun <T : Element> IMdlLayoutHeader<T>.row(classes: String = String.empty, block: MdlLayoutHeaderRow.() -> Unit = {})
        = this + MdlLayoutHeaderRow(classes).apply(block)

fun <T : Element, E : Element> IMdlLayoutHeader<E>.row(
        element: T,
        classes: String = String.empty,
        block: IMdlLayoutHeaderRow<T>.() -> Unit = {}): IMdlLayoutHeaderRow<T>
        = this + object : MdlLayoutHeaderRowBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlLayoutHeaderRow<T>.layoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {})
        = this + MdlLayoutTitle(title, classes).also { this.layoutTitle = it; it.block() }

fun <T : Element, E : Element> IMdlLayoutHeaderRow<E>.layoutTitle(
        element: T,
        title: String,
        classes: String = String.empty,
        block: IMdlLayoutTitle<T>.() -> Unit = {}): IMdlLayoutTitle<T>
        = this + object : MdlLayoutTitleBase<T>(element, title, classes) {}.also { this.layoutTitle = it; it.block() }

fun <T : Element> IMdlNav<T>.link(
        href: String? = null,
        target: String? = null,
        classes: String = String.empty,
        block: MdlNavLink.() -> Unit = {}) = this + MdlNavLink(href, target, classes).apply(block)

fun <T : Element> IMdlNav<T>.externalLink(
        href: String? = null,
        classes: String = String.empty,
        block: MdlNavLink.() -> Unit = {}) = this.link(href, ATarget.blank, classes).apply(block)

fun <T : Element> IMdlTabs<T>.panel(
        id: String,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: MdlTabsPanel.() -> Unit = {}) = this + MdlTabsPanel(id, isActive, classes).apply(block)

fun <T : Element, E : Element> IMdlTabs<E>.panel(
        element: T,
        id: String,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: IMdlTabsPanel<T>.() -> Unit = {}): IMdlTabsPanel<T>
        = this + object : MdlTabsPanelBase<T>(element, id, isActive, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.materialIcon(
        icon: IMaterialIcon,
        color: IMdlTextColor? = null,
        classes: String = String.empty,
        block: MdlMaterialIcon.() -> Unit = {}) = this + MdlMaterialIcon(icon, color, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.materialIcon(
        element: T,
        icon: IMaterialIcon,
        color: IMdlTextColor? = null,
        classes: String = String.empty,
        block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
        = this + object : MdlMaterialIconBase<T>(element, icon, color, classes) {}.apply(block)
//endregion

//region Element Extensions
fun Element.mdlGrid(hasSpacing: Boolean = true, classes: String = String.empty, block: MdlGrid.() -> Unit = {})
        = this + MdlGrid(hasSpacing, classes).apply(block)

fun <T : Element> Element.mdlGrid(
        element: T,
        hasSpacing: Boolean = true,
        classes: String = String.empty,
        block: IMdlGrid<T>.() -> Unit = {}): IMdlGrid<T>
        = this + object : MdlGridBase<T>(element, hasSpacing, classes) {}.apply(block)

fun Element.mdlLayout(classes: String = String.empty, block: MdlLayout.() -> Unit = {})
        = this + MdlLayout(classes).apply(block)

fun <T : Element> Element.mdlLayout(
        element: T,
        classes: String = String.empty,
        block: IMdlLayout<T>.() -> Unit = {}) : IMdlLayout<T>
        = this + object : MdlLayoutBase<T>(element, classes) {}.apply(block)

fun Element.mdlLayoutSpacer(classes: String = String.empty, block: MdlLayoutSpacer.() -> Unit = {})
        = this + MdlLayoutSpacer(classes).apply(block)

fun <T : Element> Element.mdlLayoutSpacer(
        element: T,
        classes: String = String.empty,
        block: IMdlLayoutSpacer<T>.() -> Unit = {}): IMdlLayoutSpacer<T>
        = this + object : MdlLayoutSpacerBase<T>(element, classes) {}.apply(block)

fun Element.mdlLayoutTitle(title: String, classes: String = String.empty, block: MdlLayoutTitle.() -> Unit = {})
        = this + MdlLayoutTitle(title, classes).apply(block)

fun <T : Element> Element.mdlLayoutTitle(
        element: T,
        title: String,
        classes: String = String.empty,
        block: IMdlLayoutTitle<T>.() -> Unit = {}): IMdlLayoutTitle<T>
        = this + object : MdlLayoutTitleBase<T>(element, title, classes) {}.apply(block)

fun Element.mdlMaterialIcon(
        icon: IMaterialIcon,
        color: IMdlTextColor? = null,
        classes: String = String.empty,
        block: MdlMaterialIcon.() -> Unit = {}) = this + MdlMaterialIcon(icon, color, classes).apply(block)

fun <T : Element> Element.mdlMaterialIcon(
        element: T,
        icon: IMaterialIcon,
        color: IMdlTextColor? = null,
        classes: String = String.empty,
        block: IMdlMaterialIcon<T>.() -> Unit = {}): IMdlMaterialIcon<T>
        = this + object : MdlMaterialIconBase<T>(element, icon, color, classes) {}.apply(block)

fun Element.mdlNav(classes: String = String.empty, block: MdlNav.() -> Unit = {}) = this + MdlNav(classes).apply(block)

fun <T : Element> Element.mdlNav(
        element: T,
        classes: String = String.empty,
        block: IMdlNav<T>.() -> Unit = {}): IMdlNav<T> = this + object : MdlNavBase<T>(element, classes) {}.apply(block)

fun Element.mdlTabs(
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlTabs.() -> Unit = {}) = this + MdlTabs(hasRippleEffect, classes).apply(block)

fun <T : Element> Element.mdlTabs(
        element: T,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlTabs<T>.() -> Unit = {}): IMdlTabs<T>
        = this + object : MdlTabsBase<T>(element, hasRippleEffect, classes) {}.apply(block)
//endregion
