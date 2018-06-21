package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinx.html.TextAreaWrap
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.Element
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlBasicTextFieldTextArea protected constructor(
        element: HTMLDivElement,
        id: String,
        label: IMdlTextFieldLabel<Element>? = null,
        error: IMdlTextFieldError<Element>? = null,
        inputRows: Int? = null,
        inputCols: Int? = null,
        inputWrap: TextAreaWrap? = null,
        classes: String = String.empty) : MdlBasicTextFieldBase<HTMLDivElement>(element, classes = classes) {

    constructor(
            element: HTMLDivElement,
            id: String,
            labelText: String,
            inputRows: Int? = null,
            inputCols: Int? = null,
            inputWrap: TextAreaWrap? = null,
            classes: String = String.empty)
            : this(element, id, MdlTextFieldLabel(labelText, id), null, inputRows, inputCols, inputWrap, classes)

    constructor(
            id: String,
            labelText: String,
            inputRows: Int? = null,
            inputCols: Int? = null,
            inputWrap: TextAreaWrap? = null,
            classes: String = String.empty) :
            this(
                    document.create.div(),
                    id,
                    MdlTextFieldLabel(labelText, id),
                    null,
                    inputRows,
                    inputCols,
                    inputWrap,
                    classes)

    constructor(
            element: HTMLDivElement,
            id: String,
            labelText: String,
            errorText: String,
            inputRows: Int? = null,
            inputCols: Int? = null,
            inputWrap: TextAreaWrap? = null,
            classes: String = String.empty) :
            this(
                    element,
                    id,
                    MdlTextFieldLabel(labelText, id),
                    MdlTextFieldError(errorText),
                    inputRows,
                    inputCols,
                    inputWrap,
                    classes)

    constructor(
            id: String,
            labelText: String,
            errorText: String,
            inputRows: Int? = null,
            inputCols: Int? = null,
            inputWrap: TextAreaWrap? = null,
            classes: String = String.empty) :
            this(
                    document.create.div(),
                    id,
                    MdlTextFieldLabel(labelText, id),
                    MdlTextFieldError(errorText),
                    inputRows,
                    inputCols,
                    inputWrap,
                    classes)

    override var input: IMdlTextFieldInput<Element> by this.replaceOrAppendExistingChildOfThis(
            element,
            MdlTextFieldInputTextArea(id, inputRows, inputCols, inputWrap))

    override var label: IMdlTextFieldLabel<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = label)

    override var error: IMdlTextFieldError<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = error)
}
