package kotlinmdl.components.dslish

import kotlinmdl.components.*
import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIconBase
import kotlinmdl.components.style.MdlMaterialIcons
import kotlinmdl.config.MdlConfig
import kotlinmdl.extensions.plus
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.*
import kotlinx.html.*
import org.w3c.dom.Element

//region Mdl Component Extensions
fun <T : Element> IMdlCard<T>.actions(
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlCardActions.() -> Unit = {}) = this + MdlCardActions(hasBorder, isExpandable, classes).apply(block)

fun <T : Element, E : Element> IMdlCard<E>.actions(
        element: T,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlCardActions<T>.() -> Unit = {}): IMdlCardActions<T>
        = this + object : MdlCardActionsBase<T>(element, hasBorder, isExpandable, classes) {}.apply(block)

fun <T : Element> IMdlCard<T>.media(classes: String = String.empty, block: MdlCardMedia.() -> Unit = {})
        = this + MdlCardMedia(classes).apply(block)

fun <T : Element, E : Element> IMdlCard<E>.media(
        element: T,
        classes: String = String.empty,
        block: IMdlCardMedia<T>.() -> Unit = {}): IMdlCardMedia<T>
        = this + object : MdlCardMediaBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlCard<T>.menu(classes: String = String.empty, block: MdlCardMenu.() -> Unit = {})
        = this + MdlCardMenu(classes).apply(block)

fun <T : Element, E : Element> IMdlCard<E>.menu(
        element: T,
        classes: String = String.empty,
        block: IMdlCardMenu<T>.() -> Unit = {}): IMdlCardMenu<T>
        = this + object : MdlCardMenuBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlCard<T>.supportingText(
        text: String,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlCardSupportingText.() -> Unit = {})
        = this + MdlCardSupportingText(text, hasBorder, isExpandable, classes).apply(block)

fun <T : Element, E : Element> IMdlCard<E>.supportingText(
        element: T,
        text: String,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlCardSupportingText<T>.() -> Unit = {}): IMdlCardSupportingText<T>
        = this + object : MdlCardSupportingTextBase<T>(element, text, hasBorder, isExpandable, classes) {}.apply(block)

fun <T : Element> IMdlCard<T>.title(
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlCardTitle.() -> Unit = {}) = this + MdlCardTitle(hasBorder, isExpandable, classes).apply(block)

fun <T : Element, E : Element> IMdlCard<E>.title(
        element: T,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlCardTitle<T>.() -> Unit = {}): IMdlCardTitle<T>
        = this + object : MdlCardTitleBase<T>(element, hasBorder, isExpandable, classes) {}.apply(block)

fun <T : Element> IMdlCardCell<T>.actions(
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlCardActions.() -> Unit = {}) = this + MdlCardActions(hasBorder, isExpandable, classes).apply(block)

fun <T : Element, E : Element> IMdlCardCell<E>.actions(
        element: T,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlCardActions<T>.() -> Unit = {}): IMdlCardActions<T>
        = this + object : MdlCardActionsBase<T>(element, hasBorder, isExpandable, classes) {}.apply(block)

fun <T : Element> IMdlCardCell<T>.media(classes: String = String.empty, block: MdlCardMedia.() -> Unit = {})
        = this + MdlCardMedia(classes).apply(block)

fun <T : Element, E : Element> IMdlCardCell<E>.media(
        element: T,
        classes: String = String.empty,
        block: IMdlCardMedia<T>.() -> Unit = {}): IMdlCardMedia<T>
        = this + object : MdlCardMediaBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlCardCell<T>.menu(classes: String = String.empty, block: MdlCardMenu.() -> Unit = {})
        = this + MdlCardMenu(classes).apply(block)

fun <T : Element, E : Element> IMdlCardCell<E>.menu(
        element: T,
        classes: String = String.empty,
        block: IMdlCardMenu<T>.() -> Unit = {}): IMdlCardMenu<T>
        = this + object : MdlCardMenuBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlCardCell<T>.supportingText(
        text: String,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlCardSupportingText.() -> Unit = {})
        = this + MdlCardSupportingText(text, hasBorder, isExpandable, classes).apply(block)

fun <T : Element, E : Element> IMdlCardCell<E>.supportingText(
        element: T,
        text: String,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlCardSupportingText<T>.() -> Unit = {}): IMdlCardSupportingText<T>
        = this + object : MdlCardSupportingTextBase<T>(element, text, hasBorder, isExpandable, classes) {}.apply(block)

fun <T : Element> IMdlCardCell<T>.title(
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlCardTitle.() -> Unit = {}) = this + MdlCardTitle(hasBorder, isExpandable, classes).apply(block)

fun <T : Element, E : Element> IMdlCardCell<E>.title(
        element: T,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlCardTitle<T>.() -> Unit = {}): IMdlCardTitle<T>
        = this + object : MdlCardTitleBase<T>(element, hasBorder, isExpandable, classes) {}.apply(block)

fun <T : Element> IMdlCardTitle<T>.subtitleText(
        text: String,
        classes: String = String.empty,
        block: MdlCardSubtitleText.() -> Unit = {}) = this + MdlCardSubtitleText(text, classes).apply(block)

fun <T : Element, E : Element> IMdlCardTitle<E>.subtitleText(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlCardSubtitleText<T>.() -> Unit = {}): IMdlCardSubtitleText<T>
        = this + object : MdlCardSubtitleTextBase<T>(element, text, classes) {}.apply(block)

fun <T : Element> IMdlCardTitle<T>.text(
        text: String,
        classes: String = String.empty,
        block: MdlCardTitleText.() -> Unit = {}) = this + MdlCardTitleText(text, classes).apply(block)

fun <T : Element, E : Element> IMdlCardTitle<E>.text(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlCardTitleText<T>.() -> Unit = {}): IMdlCardTitleText<T>
        = this + object : MdlCardTitleTextBase<T>(element, text, classes) {}.apply(block)

fun <T : Element, E : Element> IMdlChip<E>.action(
        element: T,
        icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlChipAction<T>.() -> Unit = {}): IMdlChipAction<T>
        = this + object : MdlChipActionBase<T>(element, icon, classes) {}.apply(block)

fun <T : Element> IMdlChip<T>.actionButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: MdlChipActionButton.() -> Unit = {})
        = this + MdlChipActionButton(formEncType, formMethod, name, type, icon, classes).apply(block)

fun <T : Element> IMdlChip<T>.actionLink(
        href: String? = null,
        target: String? = null,
        icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: MdlChipActionLink.() -> Unit = {}) = this + MdlChipActionLink(href, target, icon, classes).apply(block)

fun <T : Element> IMdlChip<T>.actionExternalLink(
        href: String? = null,
        icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: MdlChipActionLink.() -> Unit = {}) = this.actionLink(href, ATarget.blank, icon, classes).apply(block)

fun <T : Element> IMdlChip<T>.basicContact(
        text: String,
        color: IMdlTextColor? = null,
        backgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty,
        block: MdlChipBasicContact.() -> Unit = {})
        = this + MdlChipBasicContact(text, color, backgroundColor, classes).apply(block)

fun <T : Element, E : Element> IMdlChip<E>.basicContact(
        element: T,
        text: String,
        color: IMdlTextColor? = null,
        backgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty,
        block: IMdlChipBasicContact<T>.() -> Unit = {}): IMdlChipBasicContact<T>
        = this + object : MdlChipBasicContactBase<T>(element, text, color, backgroundColor, classes) {}.apply(block)

fun <T : Element> IMdlChip<T>.contact(classes: String = String.empty, block: MdlChipContact.() -> Unit = {})
        = this + MdlChipContact(classes).apply(block)

fun <T : Element, E : Element> IMdlChip<E>.contact(
        element: T,
        classes: String = String.empty,
        block: IMdlChipContact<T>.() -> Unit = {}): IMdlChipContact<T>
        = this + object : MdlChipContactBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlChip<T>.contactImage(
        alt: String? = null,
        src: String? = null,
        classes: String = String.empty,
        block: MdlChipContactImage.() -> Unit = {}) = this + MdlChipContactImage(alt, src, classes).apply(block)

fun <T : Element> IMdlChip<T>.text(text: String, classes: String = String.empty, block: MdlChipText.() -> Unit = {})
        = this + MdlChipText(text, classes).apply(block)

fun <T : Element, E : Element> IMdlChip<E>.text(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlChipText<T>.() -> Unit = {}): IMdlChipText<T>
        = this + object : MdlChipTextBase<T>(element, text, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.button(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlButton.() -> Unit = {})
        = this + MdlButton(formEncType, formMethod, name, type, buttonColor, hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.button(
        element: T,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlButton<T>.() -> Unit = {}): IMdlButton<T>
        = this + object : MdlButtonBase<T>(element, buttonColor, hasRippleEffect, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.buttonLink(
        href: String? = null,
        target: String? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlButtonLink.() -> Unit = {})
        = this + MdlButtonLink(href, target, buttonColor, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.buttonExternalLink(
        href: String? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlButtonLink.() -> Unit = {})
        = this.buttonLink(href, ATarget.blank, buttonColor, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredButton.() -> Unit = {})
        = this + MdlColoredButton(formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.coloredButton(
        element: T,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlButton<T>.() -> Unit = {}): IMdlButton<T>
        = this + object : MdlButtonBase<T>(element, MdlButtonColor.COLORED, hasRippleEffect, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.coloredButtonLink(
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredButtonLink.() -> Unit = {})
        = this + MdlColoredButtonLink(href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredButtonExternalLink(
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredButtonLink.() -> Unit = {})
        = this.coloredButtonLink(href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredFabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredFloatingActionButton.() -> Unit = {}) =
        this +
                MdlColoredFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes)
                        .apply(block)

fun <T : Element> IMdlComponent<T>.coloredFabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredFloatingActionButtonLink.() -> Unit = {})
        = this + MdlColoredFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredFabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredFloatingActionButtonLink.() -> Unit = {})
        = this.coloredFabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.fabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlFloatingActionButton.() -> Unit = {}) =
        this + MdlFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.fabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlFloatingActionButtonLink.() -> Unit = {})
        = this + MdlFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.fabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlFloatingActionButtonLink.() -> Unit = {})
        = this.fabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredMiniFabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredMiniFloatingActionButton.() -> Unit = {}) =
        this +
                MdlColoredMiniFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes)
                        .apply(block)

fun <T : Element> IMdlComponent<T>.coloredMiniFabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredMiniFloatingActionButtonLink.() -> Unit = {})
        = this + MdlColoredMiniFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredMiniFabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredMiniFloatingActionButtonLink.() -> Unit = {})
        = this.coloredMiniFabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.miniFabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlMiniFloatingActionButton.() -> Unit = {}) =
        this +
                MdlMiniFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes)
                        .apply(block)

fun <T : Element> IMdlComponent<T>.miniFabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlMiniFloatingActionButtonLink.() -> Unit = {})
        = this + MdlMiniFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.miniFabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlMiniFloatingActionButtonLink.() -> Unit = {})
        = this.miniFabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredIconButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredIconButton.() -> Unit = {})
        = this + MdlColoredIconButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.coloredIconButton(
        element: T,
        icon: IMdlMaterialIcon<Element>? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlIconButton<T>.() -> Unit = {}): IMdlIconButton<T> =
        this +
                object : MdlIconButtonBase<T>(element, icon, MdlButtonColor.COLORED, hasRippleEffect, classes) {}
                        .apply(block)

fun <T : Element> IMdlComponent<T>.coloredIconButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredIconButtonLink.() -> Unit = {})
        = this + MdlColoredIconButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredIconButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredIconButtonLink.() -> Unit = {})
        = this.coloredIconButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.iconButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlIconButton.() -> Unit = {})
        = this + MdlIconButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.iconButton(
        element: T,
        icon: IMdlMaterialIcon<Element>? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlIconButton<T>.() -> Unit = {}): IMdlIconButton<T>
        = this + object : MdlIconButtonBase<T>(element, icon, buttonColor, hasRippleEffect, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.iconButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlIconButtonLink.() -> Unit = {})
        = this + MdlIconButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.iconButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlIconButtonLink.() -> Unit = {})
        = this.iconButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredRaisedButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredRaisedButton.() -> Unit = {})
        = this + MdlColoredRaisedButton(formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.coloredRaisedButton(
        element: T,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlRaisedButton<T>.() -> Unit = {}): IMdlRaisedButton<T> =
        this +
                object : MdlRaisedButtonBase<T>(element, MdlButtonColor.COLORED, hasRippleEffect, classes) {}
                        .apply(block)

fun <T : Element> IMdlComponent<T>.coloredRaisedButtonLink(
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredRaisedButtonLink.() -> Unit = {})
        = this + MdlColoredRaisedButtonLink(href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.coloredRaisedButtonExternalLink(
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredRaisedButtonLink.() -> Unit = {})
        = this.coloredRaisedButtonLink(href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.raisedButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlRaisedButton.() -> Unit = {})
        = this + MdlRaisedButton(formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.raisedButton(
        element: T,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlRaisedButton<T>.() -> Unit = {}): IMdlRaisedButton<T>
        = this + object : MdlRaisedButtonBase<T>(element, buttonColor, hasRippleEffect, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.raisedButtonLink(
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlRaisedButtonLink.() -> Unit = {})
        = this + MdlRaisedButtonLink(href, target, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.raisedButtonExternalLink(
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlRaisedButtonLink.() -> Unit = {})
        = this.raisedButtonLink(href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun <T : Element> IMdlComponent<T>.card(
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty,
        block: MdlCard.() -> Unit = {}) = this + MdlCard(shadow, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.card(
        element: T,
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty,
        block: IMdlCard<T>.() -> Unit = {}): IMdlCard<T>
        = this + object : MdlCardBase<T>(element, shadow, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.basicButtonChip(
        text: String,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        classes: String = String.empty,
        block: MdlBasicButtonChip.() -> Unit = {})
        = this + MdlBasicButtonChip(text, formEncType, formMethod, name, type, classes).apply(block)

fun <T : Element> IMdlComponent<T>.basicChip(
        text: String,
        classes: String = String.empty,
        block: MdlBasicChip.() -> Unit = {}) = this + MdlBasicChip(text, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.basicChip(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlBasicChip<T>.() -> Unit = {}): IMdlBasicChip<T> =
        this +
                object : MdlBasicChipBase<T>(element, classes = classes) {

                    override var text: IMdlChipText<Element>
                            by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
                }.apply(block)

fun <T : Element> IMdlComponent<T>.chip(
        hasContact: Boolean = false,
        isDeletable: Boolean = false,
        classes: String = String.empty,
        block: MdlChip.() -> Unit = {}) = this + MdlChip(hasContact, isDeletable, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.chip(
        element: T,
        hasContact: Boolean = false,
        isDeletable: Boolean = false,
        classes: String = String.empty,
        block: IMdlChip<T>.() -> Unit = {}): IMdlChip<T>
        = this + object : MdlChipBase<T>(element, hasContact, isDeletable, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.chipButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        classes: String = String.empty,
        block: MdlChipButton.() -> Unit = {})
        = this + MdlChipButton(formEncType, formMethod, name, type, classes).apply(block)

fun <T : Element> IMdlComponent<T>.contactChip(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty,
        block: MdlContactChip.() -> Unit = {})
        = this + MdlContactChip(text, contactText, contactColor, contactBackgroundColor, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.contactChip(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T>
        = this + customContactChip(element, text, contactText, contactColor, contactBackgroundColor, classes, block)

fun <T : Element> IMdlComponent<T>.contactImageChip(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        classes: String = String.empty, block: MdlContactImageChip.() -> Unit = {})
        = this + MdlContactImageChip(text, contactAlt, contactSrc, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.contactImageChip(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        classes: String = String.empty,
        block: IMdlContactChip<T>.() -> Unit = {}): IMdlContactChip<T>
        = this + customContactImageChip(element, text, contactAlt, contactSrc, classes, block)

fun <T : Element> IMdlComponent<T>.deletableChip(
        text: String,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableChip.() -> Unit = {}) =
        this +
                MdlDeletableChip(text, actionFormEncType, actionFormMethod, actionName, actionType, actionIcon, classes)
                        .apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableChip(
        element: T,
        text: String,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}): IMdlDeletableChip<T> =
        this + customDeletableChip(
                element,
                text,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes,
                block)

fun <T : Element> IMdlComponent<T>.deletableChipLink(
        text: String,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableChipLink.() -> Unit = {})
        = this + MdlDeletableChipLink(text, actionHref, actionTarget, actionIcon, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableChipLink(
        element: T,
        text: String,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}): IMdlDeletableChip<T> =
        this + customDeletableChipLink(element, text, actionHref, actionTarget, actionIcon, classes, block)

fun <T : Element> IMdlComponent<T>.deletableChipExternalLink(
        text: String,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableChipLink.() -> Unit = {})
        = this.deletableChipLink(text, actionHref, ATarget.blank, actionIcon, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableChipExternalLink(
        element: T,
        text: String,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}): IMdlDeletableChip<T> =
        this.deletableChipLink(element, text, actionHref, ATarget.blank, actionIcon, classes, block)

fun <T : Element> IMdlComponent<T>.deletableContactChip(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactChip.() -> Unit = {}) =
        this + MdlDeletableContactChip(
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableContactChip(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T> =
        this + customDeletableContactChip(
                element,
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes,
                block)

fun <T : Element> IMdlComponent<T>.deletableContactChipLink(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactChipLink.() -> Unit = {}) =
        this + MdlDeletableContactChipLink(
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                actionTarget,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableContactChipLink(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T> =
        this + customDeletableContactChipLink(
                element,
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                actionTarget,
                actionIcon,
                classes,
                block)

fun <T : Element> IMdlComponent<T>.deletableContactChipExternalLink(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactChipLink.() -> Unit = {}) =
        this.deletableContactChipLink(
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableContactChipExternalLink(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T> =
        this.deletableContactChipLink(
                element,
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes,
                block)

fun <T : Element> IMdlComponent<T>.deletableContactImageChip(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactImageChip.() -> Unit = {}) =
        this + MdlDeletableContactImageChip(
                text,
                contactAlt,
                contactSrc,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableContactImageChip(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}): IMdlDeletableContactChip<T> =
        this + customDeletableContactImageChip(
                element,
                text,
                contactAlt,
                contactSrc,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes,
                block)

fun <T : Element> IMdlComponent<T>.deletableContactImageChipLink(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactImageChipLink.() -> Unit = {}) =
        this + MdlDeletableContactImageChipLink(
                text,
                contactAlt,
                contactSrc,
                actionHref,
                actionTarget,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableContactImageChipLink(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}): IMdlDeletableContactChip<T> =
        this + customDeletableContactImageChipLink(
                element,
                text,
                contactAlt,
                contactSrc,
                actionHref,
                actionTarget,
                actionIcon,
                classes,
                block)

fun <T : Element> IMdlComponent<T>.deletableContactImageChipExternalLink(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactImageChipLink.() -> Unit = {}) =
        this.deletableContactImageChipLink(
                text,
                contactAlt,
                contactSrc,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.deletableContactImageChipExternalLink(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}): IMdlDeletableContactChip<T> =
        this.deletableContactImageChipLink(
                element,
                text,
                contactAlt,
                contactSrc,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes,
                block)

fun <T : Element> IMdlComponent<T>.fixedTabLayout(classes: String = String.empty, block: MdlTabLayout.() -> Unit = {})
        = this + MdlTabLayout(MdlTabLayoutTabMode.FIXED, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.fixedTabLayout(
        element: T,
        classes: String = String.empty,
        block: IMdlTabLayout<T>.() -> Unit = {}): IMdlTabLayout<T>
        = this + object : MdlTabLayoutBase<T>(element, MdlTabLayoutTabMode.FIXED, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.scrollableTabLayout(
        classes: String = String.empty,
        block: MdlTabLayout.() -> Unit = {}) = this + MdlTabLayout(MdlTabLayoutTabMode.SCROLLABLE, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.scrollableTabLayout(
        element: T,
        classes: String = String.empty,
        block: IMdlTabLayout<T>.() -> Unit = {}): IMdlTabLayout<T>
        = this + object : MdlTabLayoutBase<T>(element, MdlTabLayoutTabMode.SCROLLABLE, classes) {}.apply(block)

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

fun <T : Element> IMdlComponent<T>.layoutIcon(classes: String = String.empty, block: MdlLayoutIcon.() -> Unit = {})
        = this + MdlLayoutIcon(classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.layoutIcon(
        element: T,
        classes: String = String.empty,
        block: IMdlLayoutIcon<T>.() -> Unit = {}): IMdlLayoutIcon<T>
        = this + object : MdlLayoutIconBase<T>(element, classes) {}.apply(block)

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

fun <T : Element> IMdlComponent<T>.logo(classes: String = String.empty, block: MdlLogo.() -> Unit = {})
        = this + MdlLogo(classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.logo(
        element: T,
        classes: String = String.empty,
        block: IMdlLogo<T>.() -> Unit = {}): IMdlLogo<T>
        = this + object : MdlLogoBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.megaFooter(classes: String = String.empty, block: MdlMegaFooter.() -> Unit = {})
        = this + MdlMegaFooter(classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.megaFooter(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooter<T>.() -> Unit = {}): IMdlMegaFooter<T>
        = this + object : MdlMegaFooterBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlComponent<T>.miniFooter(classes: String = String.empty, block: MdlMiniFooter.() -> Unit = {})
        = this + MdlMiniFooter(classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.miniFooter(
        element: T,
        classes: String = String.empty,
        block: IMdlMiniFooter<T>.() -> Unit = {}): IMdlMiniFooter<T>
        = this + object : MdlMiniFooterBase<T>(element, classes) {}.apply(block)

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

fun <T : Element> IMdlComponent<T>.textField(
        hasFloatingLabel: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlTextField.() -> Unit = {}) = this + MdlTextField(hasFloatingLabel, isExpandable, classes).apply(block)

fun <T : Element, E : Element> IMdlComponent<E>.textField(
        element: T,
        hasFloatingLabel: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlTextField<T>.() -> Unit = {}): IMdlTextField<T>
        = this + object : MdlTextFieldBase<T>(element, hasFloatingLabel, isExpandable, classes) {}.apply(block)

fun <T : Element> IMdlGrid<T>.cardCell(
        colSize: IMdlCellColSize? = null,
        desktopColSize: IMdlDesktopCellColSize? = null,
        tabletColSize: IMdlTabletCellColSize? = null,
        phoneColSize: IMdlPhoneCellColSize? = null,
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty,
        block: MdlCardCell.() -> Unit = {})
        = this + MdlCardCell(colSize, desktopColSize, tabletColSize, phoneColSize, shadow, classes).apply(block)

fun <T : Element, E : Element> IMdlGrid<E>.cardCell(
        element: T,
        colSize: IMdlCellColSize? = null,
        desktopColSize: IMdlDesktopCellColSize? = null,
        tabletColSize: IMdlTabletCellColSize? = null,
        phoneColSize: IMdlPhoneCellColSize? = null,
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty,
        block: IMdlCardCell<T>.() -> Unit = {}): IMdlCardCell<T> =
        this +
                object : MdlCardCellBase<T>(
                        element,
                        colSize,
                        desktopColSize,
                        tabletColSize,
                        phoneColSize,
                        shadow,
                        classes) {}
                        .apply(block)

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

fun <T : Element> IMdlLayoutContent<T>.tabPanel(
        id: String,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: MdlLayoutTabPanel.() -> Unit = {}) = this + MdlLayoutTabPanel(id, isActive, classes).apply(block)

fun <T : Element, E : Element> IMdlLayoutContent<E>.tabPanel(
        element: T,
        id: String,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: IMdlLayoutTabPanel<T>.() -> Unit = {}): IMdlLayoutTabPanel<T>
        = this + object : MdlLayoutTabPanelBase<T>(element, id, isActive, classes) {}.apply(block)

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

fun <T : Element> IMdlLayoutHeader<T>.tabBar(
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlLayoutTabBar.() -> Unit = {}) = this + MdlLayoutTabBar(hasRippleEffect, classes).apply(block)

fun <T : Element, E : Element> IMdlLayoutHeader<E>.tabBar(
        element: T,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlLayoutTabBar<T>.() -> Unit = {}): IMdlLayoutTabBar<T>
        = this + object : MdlLayoutTabBarBase<T>(element, hasRippleEffect, classes) {}.apply(block)

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

fun <T : Element> IMdlLayoutTabBar<T>.tab(
        hrefId: String,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: MdlLayoutTab.() -> Unit = {}) = this + MdlLayoutTab(hrefId, isActive, classes).apply(block)

fun <T : Element, E : Element> IMdlLayoutTabBar<E>.tab(
        element: T,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: IMdlLayoutTab<T>.() -> Unit = {}): IMdlLayoutTab<T>
        = this + object : MdlLayoutTabBase<T>(element, isActive, classes) {}.apply(block)

fun <T : Element> IMdlMegaFooter<T>.bottomSection(
        classes: String = String.empty,
        block: MdlMegaFooterBottomSection.() -> Unit = {})
        = this + MdlMegaFooterBottomSection(classes).also { this.bottomSection = it; it.block() }

fun <T : Element, E : Element> IMdlMegaFooter<E>.bottomSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterBottomSection<T>.() -> Unit = {}): IMdlMegaFooterBottomSection<T> =
        this +
                object : MdlMegaFooterBottomSectionBase<T>(element, classes) {}.also {
                    this.bottomSection = it
                    it.block()
                }

fun <T : Element> IMdlMegaFooter<T>.middleSection(
        classes: String = String.empty,
        block: MdlMegaFooterMiddleSection.() -> Unit = {})
        = this + MdlMegaFooterMiddleSection(classes).also { this.middleSection = it; it.block() }

fun <T : Element, E : Element> IMdlMegaFooter<E>.middleSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterMiddleSection<T>.() -> Unit = {}): IMdlMegaFooterMiddleSection<T> =
        this +
                object : MdlMegaFooterMiddleSectionBase<T>(element, classes) {}.also {
                    this.middleSection = it
                    it.block()
                }

fun <T : Element> IMdlMegaFooter<T>.topSection(
        classes: String = String.empty,
        block: MdlMegaFooterTopSection.() -> Unit = {})
        = this + MdlMegaFooterTopSection(classes).also { this.topSection = it; it.block() }

fun <T : Element, E : Element> IMdlMegaFooter<E>.topSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterTopSection<T>.() -> Unit = {}): IMdlMegaFooterTopSection<T>
        = this + object : MdlMegaFooterTopSectionBase<T>(element, classes) {}.also { this.topSection = it; it.block() }

fun <T : Element> IMdlMegaFooterDropdownSection<T>.heading(
        text: String,
        classes: String = String.empty,
        block: MdlMegaFooterHeading.() -> Unit = {})
        = this + MdlMegaFooterHeading(text, classes).also { this.heading = it; it.block() }

fun <T : Element, E : Element> IMdlMegaFooterDropdownSection<E>.heading(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlMegaFooterHeading<T>.() -> Unit = {}): IMdlMegaFooterHeading<T>
        = this + object : MdlMegaFooterHeadingBase<T>(element, text, classes) {}.also { this.heading = it; it.block() }

fun <T : Element> IMdlMegaFooterDropdownSection<T>.headingCheckBox(
        type: InputType? = InputType.checkBox,
        formEncType: InputFormEncType? = null,
        formMethod: InputFormMethod? = null,
        name: String? = null,
        isChecked: Boolean = true,
        classes: String = String.empty,
        block: MdlMegaFooterHeadingCheckBox.() -> Unit = {}) =
        this +
                MdlMegaFooterHeadingCheckBox(type, formEncType, formMethod, name, isChecked, classes).also {
                    this.headingCheckBox = it
                    it.block()
                }

fun <T : Element, E : Element> IMdlMegaFooterDropdownSection<E>.headingCheckBox(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterHeadingCheckBox<T>.() -> Unit = {}): IMdlMegaFooterHeadingCheckBox<T> =
        this +
                object : MdlMegaFooterHeadingCheckBoxBase<T>(element, classes) {}.also {
                    this.headingCheckBox = it
                    it.block()
                }

fun <T : Element> IMdlMegaFooterSection<T>.linkList(
        classes: String = String.empty,
        block: MdlMegaFooterLinkList.() -> Unit = {}) = this + MdlMegaFooterLinkList(classes).apply(block)

fun <T : Element, E : Element> IMdlMegaFooterSection<E>.linkList(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterLinkList<T>.() -> Unit = {}): IMdlMegaFooterLinkList<T>
        = this + object : MdlMegaFooterLinkListBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlMegaFooterSection<T>.socialButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = null,
        classes: String = String.empty,
        block: MdlMegaFooterSocialButton.() -> Unit = {})
        = this + MdlMegaFooterSocialButton(formEncType, formMethod, name, type, classes).apply(block)

fun <T : Element> IMdlMegaFooterVerticalSection<T>.dropDownSection(
        classes: String = String.empty,
        block: MdlMegaFooterDropdownSection.() -> Unit = {})
        = this + MdlMegaFooterDropdownSection(classes).apply(block)

fun <T : Element, E : Element> IMdlMegaFooterVerticalSection<E>.dropDownSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterDropdownSection<T>.() -> Unit = {}): IMdlMegaFooterDropdownSection<T>
        = this + object : MdlMegaFooterDropdownSectionBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlMegaFooterVerticalSection<T>.leftSection(
        classes: String = String.empty,
        block: MdlMegaFooterLeftSection.() -> Unit = {})
        = this + MdlMegaFooterLeftSection(classes).also { this.leftSection = it; it.block() }

fun <T : Element, E : Element> IMdlMegaFooterVerticalSection<E>.leftSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterLeftSection<T>.() -> Unit = {}): IMdlMegaFooterLeftSection<T> =
        this + object : MdlMegaFooterLeftSectionBase<T>(element, classes) {}.also { this.leftSection = it; it.block() }

fun <T : Element> IMdlMegaFooterVerticalSection<T>.rightSection(
        classes: String = String.empty,
        block: MdlMegaFooterRightSection.() -> Unit = {})
        = this + MdlMegaFooterRightSection(classes).also { this.rightSection = it; it.block() }

fun <T : Element, E : Element> IMdlMegaFooterVerticalSection<E>.rightSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooterRightSection<T>.() -> Unit = {}): IMdlMegaFooterRightSection<T> =
        this +
                object : MdlMegaFooterRightSectionBase<T>(element, classes) {}.also {
                    this.rightSection = it
                    it.block()
                }

fun <T : Element> IMdlMiniFooter<T>.leftSection(
        classes: String = String.empty,
        block: MdlMiniFooterLeftSection.() -> Unit = {})
        = this + MdlMiniFooterLeftSection(classes).also { this.leftSection = it; it.block() }

fun <T : Element, E : Element> IMdlMiniFooter<T>.leftSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMiniFooterLeftSection<T>.() -> Unit = {}): IMdlMiniFooterLeftSection<T> =
        this + object : MdlMiniFooterLeftSectionBase<T>(element, classes) {}.also { this.leftSection = it; it.block() }

fun <T : Element> IMdlMiniFooter<T>.rightSection(
        classes: String = String.empty,
        block: MdlMiniFooterRightSection.() -> Unit = {})
        = this + MdlMiniFooterRightSection(classes).also { this.rightSection = it; it.block() }

fun <T : Element, E : Element> IMdlMiniFooter<T>.rightSection(
        element: T,
        classes: String = String.empty,
        block: IMdlMiniFooterRightSection<T>.() -> Unit = {}): IMdlMiniFooterRightSection<T> =
        this +
                object : MdlMiniFooterRightSectionBase<T>(element, classes) {}.also {
                    this.rightSection = it
                    it.block()
                }

fun <T : Element> IMdlMiniFooterSection<T>.linkList(
        classes: String = String.empty,
        block: MdlMiniFooterLinkList.() -> Unit = {}) = this + MdlMiniFooterLinkList(classes).apply(block)

fun <T : Element, E : Element> IMdlMiniFooterSection<E>.linkList(
        element: T,
        classes: String = String.empty,
        block: IMdlMiniFooterLinkList<T>.() -> Unit = {}): IMdlMiniFooterLinkList<T>
        = this + object : MdlMiniFooterLinkListBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlMiniFooterSection<T>.socialButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = null,
        classes: String = String.empty,
        block: MdlMiniFooterSocialButton.() -> Unit = {})
        = this + MdlMiniFooterSocialButton(formEncType, formMethod, name, type, classes).apply(block)

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

fun <T : Element> IMdlTabs<T>.tabBar(classes: String = String.empty, block: MdlTabsTabBar.() -> Unit = {})
        = this + MdlTabsTabBar(classes).apply(block)

fun <T : Element, E : Element> IMdlTabs<E>.tabBar(
        element: T,
        classes: String = String.empty,
        block: IMdlTabsTabBar<T>.() -> Unit = {}): IMdlTabsTabBar<T>
        = this + object : MdlTabsTabBarBase<T>(element, classes) {}.apply(block)

fun <T : Element> IMdlTabsTabBar<T>.tab(
        hrefId: String,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: MdlTabsTab.() -> Unit = {}) = this + MdlTabsTab(hrefId, isActive, classes).apply(block)

fun <T : Element, E : Element> IMdlTabsTabBar<E>.tab(
        element: T,
        isActive: Boolean = false,
        classes: String = String.empty,
        block: IMdlTabsTab<T>.() -> Unit = {}): IMdlTabsTab<T>
        = this + object : MdlTabsTabBase<T>(element, isActive, classes) {}.apply(block)

fun <T : Element> IMdlTextField<T>.error(
        text: String,
        classes: String = String.empty,
        block: MdlTextFieldError.() -> Unit = {}) = this + MdlTextFieldError(text, classes).apply(block)

fun <T : Element, E : Element> IMdlTextField<E>.error(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlTextFieldError<T>.() -> Unit = {}): IMdlTextFieldError<T>
        = this + object : MdlTextFieldErrorBase<T>(element, text, classes) {}.apply(block)

fun <T : Element> IMdlTextField<T>.expandableHolder(
        classes: String = String.empty,
        block: MdlTextFieldExpandableHolder.() -> Unit = {})
        = this + MdlTextFieldExpandableHolder(classes).also { this.isExpandable = true; it.block() }

fun <T : Element, E : Element> IMdlTextField<E>.expandableHolder(
        element: T,
        classes: String = String.empty,
        block: IMdlTextFieldExpandableHolder<T>.() -> Unit = {}): IMdlTextFieldExpandableHolder<T> =
        this +
                object : MdlTextFieldExpandableHolderBase<T>(element, classes) {}.also {
                    this.isExpandable = true
                    it.block()
                }

fun <T : Element> IMdlTextField<T>.input(
        id: String,
        pattern: String? = null,
        type: InputType? = InputType.text,
        formEncType: InputFormEncType? = null,
        formMethod: InputFormMethod? = null,
        name: String? = null,
        classes: String = String.empty,
        block: MdlTextFieldInput.() -> Unit = {})
        = this + MdlTextFieldInput(id, pattern, type, formEncType, formMethod, name, classes).apply(block)

fun <T : Element, E : Element> IMdlTextField<E>.input(
        element: T,
        id: String,
        classes: String = String.empty,
        block: IMdlTextFieldInput<T>.() -> Unit = {}): IMdlTextFieldInput<T>
        = this + object : MdlTextFieldInputBase<T>(element, id, classes) {}.apply(block)

fun <T : Element> IMdlTextField<T>.inputTextArea(
        id: String,
        rows: Int? = null,
        cols: Int? = null,
        wrap: TextAreaWrap? = null,
        classes: String = String.empty,
        block: MdlTextFieldInputTextArea.() -> Unit = {})
        = this + MdlTextFieldInputTextArea(id, rows, cols, wrap, classes).apply(block)

fun <T : Element> IMdlTextField<T>.numericInput(
        id: String,
        type: InputType? = InputType.text,
        formEncType: InputFormEncType? = null,
        formMethod: InputFormMethod? = null,
        name: String? = null,
        classes: String = String.empty,
        block: MdlTextFieldNumericInput.() -> Unit = {})
        = this + MdlTextFieldNumericInput(id, type, formEncType, formMethod, name, classes).apply(block)

fun <T : Element> IMdlTextField<T>.label(
        text: String,
        htmlFor: String,
        classes: String = String.empty,
        block: MdlTextFieldLabel.() -> Unit = {}) = this + MdlTextFieldLabel(text, htmlFor, classes).apply(block)

fun <T : Element, E : Element> IMdlTextField<E>.label(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlTextFieldLabel<T>.() -> Unit = {}): IMdlTextFieldLabel<T>
        = this + object : MdlTextFieldLabelBase<T>(element, text, classes) {}.apply(block)

fun <T : Element> IMdlTextFieldExpandableHolder<T>.error(
        text: String,
        classes: String = String.empty,
        block: MdlTextFieldError.() -> Unit = {}) = this + MdlTextFieldError(text, classes).apply(block)

fun <T : Element, E : Element> IMdlTextFieldExpandableHolder<E>.error(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlTextFieldError<T>.() -> Unit = {}): IMdlTextFieldError<T>
        = this + object : MdlTextFieldErrorBase<T>(element, text, classes) {}.apply(block)

fun <T : Element> IMdlTextFieldExpandableHolder<T>.input(
        id: String,
        pattern: String? = null,
        type: InputType? = InputType.text,
        formEncType: InputFormEncType? = null,
        formMethod: InputFormMethod? = null,
        name: String? = null,
        classes: String = String.empty,
        block: MdlTextFieldInput.() -> Unit = {})
        = this + MdlTextFieldInput(id, pattern, type, formEncType, formMethod, name, classes).apply(block)

fun <T : Element, E : Element> IMdlTextFieldExpandableHolder<E>.input(
        element: T,
        id: String,
        classes: String = String.empty,
        block: IMdlTextFieldInput<T>.() -> Unit = {}): IMdlTextFieldInput<T>
        = this + object : MdlTextFieldInputBase<T>(element, id, classes) {}.apply(block)

fun <T : Element> IMdlTextFieldExpandableHolder<T>.inputTextArea(
        id: String,
        rows: Int? = null,
        cols: Int? = null,
        wrap: TextAreaWrap? = null,
        classes: String = String.empty,
        block: MdlTextFieldInputTextArea.() -> Unit = {})
        = this + MdlTextFieldInputTextArea(id, rows, cols, wrap, classes).apply(block)

fun <T : Element> IMdlTextFieldExpandableHolder<T>.numericInput(
        id: String,
        type: InputType? = InputType.text,
        formEncType: InputFormEncType? = null,
        formMethod: InputFormMethod? = null,
        name: String? = null,
        classes: String = String.empty,
        block: MdlTextFieldNumericInput.() -> Unit = {})
        = this + MdlTextFieldNumericInput(id, type, formEncType, formMethod, name, classes).apply(block)

fun <T : Element> IMdlTextFieldExpandableHolder<T>.label(
        text: String,
        htmlFor: String,
        classes: String = String.empty,
        block: MdlTextFieldLabel.() -> Unit = {}) = this + MdlTextFieldLabel(text, htmlFor, classes).apply(block)

fun <T : Element, E : Element> IMdlTextFieldExpandableHolder<E>.label(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlTextFieldLabel<T>.() -> Unit = {}): IMdlTextFieldLabel<T>
        = this + object : MdlTextFieldLabelBase<T>(element, text, classes) {}.apply(block)

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
fun Element.mdlButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlButton.() -> Unit = {})
        = this + MdlButton(formEncType, formMethod, name, type, buttonColor, hasRippleEffect, classes).apply(block)

fun <T : Element> Element.mdlButton(
        element: T,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlButton<T>.() -> Unit = {}): IMdlButton<T>
        = this + object : MdlButtonBase<T>(element, buttonColor, hasRippleEffect, classes) {}.apply(block)

fun Element.mdlButtonLink(
        href: String? = null,
        target: String? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlButtonLink.() -> Unit = {})
        = this + MdlButtonLink(href, target, buttonColor, hasRippleEffect, classes).apply(block)

fun Element.mdlButtonExternalLink(
        href: String? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlButtonLink.() -> Unit = {})
        = this.mdlButtonLink(href, ATarget.blank, buttonColor, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredButton.() -> Unit = {})
        = this + MdlColoredButton(formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element> Element.mdlColoredButton(
        element: T,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlButton<T>.() -> Unit = {}): IMdlButton<T>
        = this + object : MdlButtonBase<T>(element, MdlButtonColor.COLORED, hasRippleEffect, classes) {}.apply(block)

fun Element.mdlColoredButtonLink(
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredButtonLink.() -> Unit = {})
        = this + MdlColoredButtonLink(href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredButtonExternalLink(
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredButtonLink.() -> Unit = {})
        = this.mdlColoredButtonLink(href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredFabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredFloatingActionButton.() -> Unit = {}) =
        this +
                MdlColoredFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes)
                        .apply(block)

fun Element.mdlColoredFabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredFloatingActionButtonLink.() -> Unit = {})
        = this + MdlColoredFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredFabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredFloatingActionButtonLink.() -> Unit = {})
        = this.mdlColoredFabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlFabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlFloatingActionButton.() -> Unit = {}) =
        this + MdlFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun Element.mdlFabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlFloatingActionButtonLink.() -> Unit = {})
        = this + MdlFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlFabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlFloatingActionButtonLink.() -> Unit = {})
        = this.mdlFabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredMiniFabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredMiniFloatingActionButton.() -> Unit = {}) =
        this +
                MdlColoredMiniFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes)
                        .apply(block)

fun Element.mdlColoredMiniFabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredMiniFloatingActionButtonLink.() -> Unit = {})
        = this + MdlColoredMiniFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredMiniFabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredMiniFloatingActionButtonLink.() -> Unit = {}) =
        this.mdlColoredMiniFabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlMiniFabButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlMiniFloatingActionButton.() -> Unit = {}) =
        this +
                MdlMiniFloatingActionButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes)
                        .apply(block)

fun Element.mdlMiniFabButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlMiniFloatingActionButtonLink.() -> Unit = {})
        = this + MdlMiniFloatingActionButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlMiniFabButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlMiniFloatingActionButtonLink.() -> Unit = {})
        = this.mdlMiniFabButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredIconButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredIconButton.() -> Unit = {})
        = this + MdlColoredIconButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element> Element.mdlColoredIconButton(
        element: T,
        icon: IMdlMaterialIcon<Element>? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlIconButton<T>.() -> Unit = {}): IMdlIconButton<T> =
        this +
                object : MdlIconButtonBase<T>(element, icon, MdlButtonColor.COLORED, hasRippleEffect, classes) {}
                        .apply(block)

fun Element.mdlColoredIconButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredIconButtonLink.() -> Unit = {})
        = this + MdlColoredIconButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredIconButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredIconButtonLink.() -> Unit = {})
        = this.mdlColoredIconButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlIconButton(
        icon: IMdlMaterialIcon<Element>? = null,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlIconButton.() -> Unit = {})
        = this + MdlIconButton(icon, formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element> Element.mdlIconButton(
        element: T,
        icon: IMdlMaterialIcon<Element>? = null,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlIconButton<T>.() -> Unit = {}): IMdlIconButton<T>
        = this + object : MdlIconButtonBase<T>(element, icon, buttonColor, hasRippleEffect, classes) {}.apply(block)

fun Element.mdlIconButtonLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlIconButtonLink.() -> Unit = {})
        = this + MdlIconButtonLink(icon, href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlIconButtonExternalLink(
        icon: IMdlMaterialIcon<Element>? = null,
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlIconButtonLink.() -> Unit = {})
        = this.mdlIconButtonLink(icon, href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredRaisedButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredRaisedButton.() -> Unit = {})
        = this + MdlColoredRaisedButton(formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element> Element.mdlColoredRaisedButton(
        element: T,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlRaisedButton<T>.() -> Unit = {}): IMdlRaisedButton<T>
        = this + object : MdlRaisedButtonBase<T>(element, buttonColor, hasRippleEffect, classes) {}.apply(block)

fun Element.mdlColoredRaisedButtonLink(
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredRaisedButtonLink.() -> Unit = {})
        = this + MdlColoredRaisedButtonLink(href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlColoredRaisedButtonExternalLink(
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlColoredRaisedButtonLink.() -> Unit = {})
        = this.mdlColoredRaisedButtonLink(href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlRaisedButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlRaisedButton.() -> Unit = {})
        = this + MdlRaisedButton(formEncType, formMethod, name, type, hasRippleEffect, classes).apply(block)

fun <T : Element> Element.mdlRaisedButton(
        element: T,
        buttonColor: IMdlButtonColor? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: IMdlRaisedButton<T>.() -> Unit = {}): IMdlRaisedButton<T>
        = this + object : MdlRaisedButtonBase<T>(element, buttonColor, hasRippleEffect, classes) {}.apply(block)

fun Element.mdlRaisedButtonLink(
        href: String? = null,
        target: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlRaisedButtonLink.() -> Unit = {})
        = this + MdlRaisedButtonLink(href, target, hasRippleEffect, classes).apply(block)

fun Element.mdlRaisedButtonExternalLink(
        href: String? = null,
        hasRippleEffect: Boolean = MdlConfig.hasRippleEffect,
        classes: String = String.empty,
        block: MdlRaisedButtonLink.() -> Unit = {})
        = this.mdlRaisedButtonLink(href, ATarget.blank, hasRippleEffect, classes).apply(block)

fun Element.mdlCard(shadow: IMdlShadow? = MdlShadow.DP2, classes: String = String.empty, block: MdlCard.() -> Unit = {})
        = this + MdlCard(shadow, classes).apply(block)

fun <T : Element> Element.mdlCard(
        element: T,
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty,
        block: IMdlCard<T>.() -> Unit = {}): IMdlCard<T>
        = this + object : MdlCardBase<T>(element, shadow, classes) {}.apply(block)

fun Element.mdlBasicButtonChip(
        text: String,
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        classes: String = String.empty,
        block: MdlBasicButtonChip.() -> Unit = {})
        = this + MdlBasicButtonChip(text, formEncType, formMethod, name, type, classes).apply(block)

fun Element.mdlBasicChip(text: String, classes: String = String.empty, block: MdlBasicChip.() -> Unit = {})
        = this + MdlBasicChip(text, classes).apply(block)

fun <T : Element> Element.mdlBasicChip(
        element: T,
        text: String,
        classes: String = String.empty,
        block: IMdlBasicChip<T>.() -> Unit = {}): IMdlBasicChip<T> =
        this +
                object : MdlBasicChipBase<T>(element, classes = classes) {

                    override var text: IMdlChipText<Element>
                            by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
                }.apply(block)

fun Element.mdlChip(
        hasContact: Boolean = false,
        isDeletable: Boolean = false,
        classes: String = String.empty,
        block: MdlChip.() -> Unit = {}) = this + MdlChip(hasContact, isDeletable, classes).apply(block)

fun <T : Element> Element.mdlChip(
        element: T,
        hasContact: Boolean = false,
        isDeletable: Boolean = false,
        classes: String = String.empty,
        block: IMdlChip<T>.() -> Unit = {}): IMdlChip<T>
        = this + object : MdlChipBase<T>(element, hasContact, isDeletable, classes) {}.apply(block)

fun Element.mdlChipButton(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = ButtonType.button,
        classes: String = String.empty,
        block: MdlChipButton.() -> Unit = {})
        = this + MdlChipButton(formEncType, formMethod, name, type, classes).apply(block)

fun Element.mdlContactChip(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty,
        block: MdlContactChip.() -> Unit = {})
        = this + MdlContactChip(text, contactText, contactColor, contactBackgroundColor, classes).apply(block)

fun <T : Element> Element.mdlContactChip(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T>
        = this + customContactChip(element, text, contactText, contactColor, contactBackgroundColor, classes, block)

fun Element.mdlContactImageChip(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        classes: String = String.empty, block: MdlContactImageChip.() -> Unit = {})
        = this + MdlContactImageChip(text, contactAlt, contactSrc, classes).apply(block)

fun <T : Element> Element.mdlContactImageChip(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        classes: String = String.empty,
        block: IMdlContactChip<T>.() -> Unit = {}): IMdlContactChip<T>
        = this + customContactImageChip(element, text, contactAlt, contactSrc, classes, block)

fun Element.mdlDeletableChip(
        text: String,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableChip.() -> Unit = {}) =
        this + MdlDeletableChip(
                text,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element> Element.mdlDeletableChip(
        element: T,
        text: String,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}): IMdlDeletableChip<T> =
        this + customDeletableChip(
                element,
                text,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes,
                block)

fun Element.mdlDeletableChipLink(
        text: String,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableChipLink.() -> Unit = {})
        = this + MdlDeletableChipLink(text, actionHref, actionTarget, actionIcon, classes).apply(block)

fun <T : Element> Element.mdlDeletableChipLink(
        element: T,
        text: String,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}): IMdlDeletableChip<T> =
        this + customDeletableChipLink(element, text, actionHref, actionTarget, actionIcon, classes, block)

fun Element.mdlDeletableChipExternalLink(
        text: String,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableChipLink.() -> Unit = {})
        = this.mdlDeletableChipLink(text, actionHref, ATarget.blank, actionIcon, classes).apply(block)

fun <T : Element> Element.mdlDeletableChipExternalLink(
        element: T,
        text: String,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}): IMdlDeletableChip<T>
        = this.mdlDeletableChipLink(element, text, actionHref, ATarget.blank, actionIcon, classes, block)

fun Element.mdlDeletableContactChip(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactChip.() -> Unit = {}) =
        this + MdlDeletableContactChip(
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element> Element.mdlDeletableContactChip(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T> =
        this + customDeletableContactChip(
                element,
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes,
                block)

fun Element.mdlDeletableContactChipLink(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactChipLink.() -> Unit = {}) =
        this + MdlDeletableContactChipLink(
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                actionTarget,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element> Element.mdlDeletableContactChipLink(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T> =
        this + customDeletableContactChipLink(
                element,
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                actionTarget,
                actionIcon,
                classes,
                block)

fun Element.mdlDeletableContactChipExternalLink(
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactChipLink.() -> Unit = {}) =
        this.mdlDeletableContactChipLink(
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element> Element.mdlDeletableContactChipExternalLink(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}): IMdlBasicContactChip<T> =
        this.mdlDeletableContactChipLink(
                element,
                text,
                contactText,
                contactColor,
                contactBackgroundColor,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes,
                block)

fun Element.mdlDeletableContactImageChip(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactImageChip.() -> Unit = {}) =
        this + MdlDeletableContactImageChip(
                text,
                contactAlt,
                contactSrc,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element> Element.mdlDeletableContactImageChip(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}): IMdlDeletableContactChip<T> =
        this + customDeletableContactImageChip(
                element,
                text,
                contactAlt,
                contactSrc,
                actionFormEncType,
                actionFormMethod,
                actionName,
                actionType,
                actionIcon,
                classes,
                block)

fun Element.mdlDeletableContactImageChipLink(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactImageChipLink.() -> Unit = {}) =
        this + MdlDeletableContactImageChipLink(
                text,
                contactAlt,
                contactSrc,
                actionHref,
                actionTarget,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element> Element.mdlDeletableContactImageChipLink(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}): IMdlDeletableContactChip<T> =
        this + customDeletableContactImageChipLink(
                element,
                text,
                contactAlt,
                contactSrc,
                actionHref,
                actionTarget,
                actionIcon,
                classes,
                block)

fun Element.mdlDeletableContactImageChipExternalLink(
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty, block: MdlDeletableContactImageChipLink.() -> Unit = {}) =
        this.mdlDeletableContactImageChipLink(
                text,
                contactAlt,
                contactSrc,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes)
                .apply(block)

fun <T : Element> Element.mdlDeletableContactImageChipExternalLink(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}): IMdlDeletableContactChip<T> =
        this.mdlDeletableContactImageChipLink(
                element,
                text,
                contactAlt,
                contactSrc,
                actionHref,
                ATarget.blank,
                actionIcon,
                classes,
                block)

fun Element.mdlFixedTabLayout(classes: String = String.empty, block: MdlTabLayout.() -> Unit = {})
        = this + MdlTabLayout(MdlTabLayoutTabMode.FIXED, classes).apply(block)

fun <T : Element> Element.mdlFixedTabLayout(
        element: T,
        classes: String = String.empty,
        block: IMdlTabLayout<T>.() -> Unit = {}): IMdlTabLayout<T>
        = this + object : MdlTabLayoutBase<T>(element, MdlTabLayoutTabMode.FIXED, classes) {}.apply(block)

fun Element.mdlScrollableTabLayout(classes: String = String.empty, block: MdlTabLayout.() -> Unit = {})
        = this + MdlTabLayout(MdlTabLayoutTabMode.SCROLLABLE, classes).apply(block)

fun <T : Element> Element.mdlScrollableTabLayout(
        element: T,
        classes: String = String.empty,
        block: IMdlTabLayout<T>.() -> Unit = {}): IMdlTabLayout<T>
        = this + object : MdlTabLayoutBase<T>(element, MdlTabLayoutTabMode.SCROLLABLE, classes) {}.apply(block)

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

fun Element.mdlLayoutIcon(classes: String = String.empty, block: MdlLayoutIcon.() -> Unit = {})
        = this + MdlLayoutIcon(classes).apply(block)

fun <T : Element> Element.mdlLayoutIcon(
        element: T,
        classes: String = String.empty,
        block: IMdlLayoutIcon<T>.() -> Unit = {}): IMdlLayoutIcon<T>
        = this + object : MdlLayoutIconBase<T>(element, classes) {}.apply(block)

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

fun Element.mdlLogo(classes: String = String.empty, block: MdlLogo.() -> Unit = {})
        = this + MdlLogo(classes).apply(block)

fun <T : Element> Element.mdlLogo(
        element: T,
        classes: String = String.empty,
        block: IMdlLogo<T>.() -> Unit = {}): IMdlLogo<T>
        = this + object : MdlLogoBase<T>(element, classes) {}.apply(block)

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

fun Element.mdlMegaFooter(classes: String = String.empty, block: MdlMegaFooter.() -> Unit = {})
        = this + MdlMegaFooter(classes).apply(block)

fun <T : Element> Element.mdlMegaFooter(
        element: T,
        classes: String = String.empty,
        block: IMdlMegaFooter<T>.() -> Unit = {}): IMdlMegaFooter<T>
        = this + object : MdlMegaFooterBase<T>(element, classes) {}.apply(block)

fun Element.mdlMiniFooter(classes: String = String.empty, block: MdlMiniFooter.() -> Unit = {})
        = this + MdlMiniFooter(classes).apply(block)

fun <T : Element> Element.mdlMiniFooter(
        element: T,
        classes: String = String.empty,
        block: IMdlMiniFooter<T>.() -> Unit = {}): IMdlMiniFooter<T>
        = this + object : MdlMiniFooterBase<T>(element, classes) {}.apply(block)

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

fun <T : Element> Element.mdlTextField(
        hasFloatingLabel: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: MdlTextField.() -> Unit = {}) = this + MdlTextField(hasFloatingLabel, isExpandable, classes).apply(block)

fun <T : Element> Element.mdlTextField(
        element: T,
        hasFloatingLabel: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty,
        block: IMdlTextField<T>.() -> Unit = {}): IMdlTextField<T>
        = this + object : MdlTextFieldBase<T>(element, hasFloatingLabel, isExpandable, classes) {}.apply(block)
//endregion

//region Private Methods
private fun <T : Element> customContactChip(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty,
        block: IMdlBasicContactChip<T>.() -> Unit = {}) =
        object : MdlBasicContactChipBase<T>(element, classes) {

            override var contact: IMdlChipBasicContact<Element>
                    by this.replaceOrAppendExistingChildOfThis(
                            element,
                            MdlChipBasicContact(contactText, contactColor, contactBackgroundColor))

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
        }.apply(block)

private fun <T : Element> customContactImageChip(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        classes: String = String.empty,
        block: IMdlContactChip<T>.() -> Unit = {}) =
        object : MdlContactChipBase<T>(element, classes) {

            override var contact: IMdlChipContact<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipContactImage(contactAlt, contactSrc))

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
        }.apply(block)

private fun <T : Element> customDeletableChip(
        element: T,
        text: String,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}) =
        object : MdlDeletableChipBase<T>(element, classes) {

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

            override var action: IMdlChipAction<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipActionButton(actionFormEncType, actionFormMethod, actionName, actionType, actionIcon))
        }.apply(block)

private fun <T : Element> customDeletableChipLink(
        element: T,
        text: String,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableChip<T>.() -> Unit = {}) =
        object : MdlDeletableChipBase<T>(element, classes) {

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

            override var action: IMdlChipAction<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipActionLink(actionHref, actionTarget, actionIcon))
        }.apply(block)

private fun <T : Element> customDeletableContactChip(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableBasicContactChip<T>.() -> Unit = {}) =
        object : MdlDeletableBasicContactChipBase<T>(element, classes) {

            override var contact: IMdlChipBasicContact<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipBasicContact(contactText, contactColor, contactBackgroundColor))

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

            override var action: IMdlChipAction<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipActionButton(actionFormEncType, actionFormMethod, actionName, actionType, actionIcon))
        }.apply(block)

private fun <T : Element> customDeletableContactChipLink(
        element: T,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableBasicContactChip<T>.() -> Unit = {}) =
        object : MdlDeletableBasicContactChipBase<T>(element, classes) {

            override var contact: IMdlChipBasicContact<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipBasicContact(contactText, contactColor, contactBackgroundColor))

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

            override var action: IMdlChipAction<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipActionLink(actionHref, actionTarget, actionIcon))
        }.apply(block)

private fun <T : Element> customDeletableContactImageChip(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}) =
        object : MdlDeletableContactChipBase<T>(element, classes) {

            override var contact: IMdlChipContact<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipContactImage(contactAlt, contactSrc))

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

            override var action: IMdlChipAction<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipActionButton(actionFormEncType, actionFormMethod, actionName, actionType, actionIcon))
        }.apply(block)

private fun <T : Element> customDeletableContactImageChipLink(
        element: T,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty,
        block: IMdlDeletableContactChip<T>.() -> Unit = {}) =
        object : MdlDeletableContactChipBase<T>(element, classes) {

            override var contact: IMdlChipContact<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipContactImage(contactAlt, contactSrc))

            override var text: IMdlChipText<Element>
                    by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

            override var action: IMdlChipAction<Element> by this.replaceOrAppendExistingChildOfThis(
                    element,
                    MdlChipActionLink(actionHref, actionTarget, actionIcon))
        }.apply(block)
//endregion
