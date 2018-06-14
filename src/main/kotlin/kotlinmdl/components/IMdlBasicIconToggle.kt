package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlBasicIconToggle<out T : Element> : IMdlIconToggle<T> {

    var input: IMdlIconToggleInput<Element>
    var label: IMdlIconToggleLabel<Element>
}
