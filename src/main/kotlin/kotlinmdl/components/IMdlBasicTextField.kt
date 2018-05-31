package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlBasicTextField<out T : Element> : IMdlTextField<T> {

    var input: IMdlTextFieldInput<Element>
    var label: IMdlTextFieldLabel<Element>?
    var error: IMdlTextFieldError<Element>?
}
