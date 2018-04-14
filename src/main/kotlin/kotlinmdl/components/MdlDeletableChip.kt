package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIcons
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinx.html.ButtonFormEncType
import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.Element
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlDeletableChip(
        element: HTMLSpanElement,
        text: String,
        actionFormEncType: ButtonFormEncType? = null,
        actionFormMethod: ButtonFormMethod? = null,
        actionName: String? = null,
        actionType: ButtonType? = ButtonType.button,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty) : MdlDeletableChipBase<HTMLSpanElement>(element, classes) {

    constructor(
            text: String,
            actionFormEncType: ButtonFormEncType? = null,
            actionFormMethod: ButtonFormMethod? = null,
            actionName: String? = null,
            actionType: ButtonType? = ButtonType.button,
            actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
            classes: String = String.empty) :
            this(
                    document.create.span(),
                    text,
                    actionFormEncType,
                    actionFormMethod,
                    actionName,
                    actionType,
                    actionIcon,
                    classes)

    override var text: IMdlChipText<Element> by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

    override var action: IMdlChipAction<Element> by this.replaceOrAppendExistingChildOfThis(
            element,
            MdlChipActionButton(actionFormEncType, actionFormMethod, actionName, actionType, actionIcon))
}
