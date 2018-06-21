package kotlinmdl.internal.extensions

import kotlinmdl.components.IMdlComponent
import kotlinmdl.extensions.plus
import kotlinmdl.material.style.IMaterialIcon
import org.w3c.dom.Element
import org.w3c.dom.Node

//region Public Extension Methods
/**
 * Update and initial element is @param element.
 */
fun <T : Element> IMdlComponent<T>.invertToggleClassOf(
        element: Element,
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) = this.invertToggleClassOf(element, element, cssClass, initialValue, setOnInit)

/**
 * Update element is @param element.
 * Initial element is @param initialElement.
 */
fun <T : Element> IMdlComponent<T>.invertToggleClassOf(
        element: Element,
        initialElement: Element,
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) =
        this.toggleClassDelegatedProperty(
                initialElement,
                cssClass,
                initialValue,
                { element.classList.contains(cssClass) },
                { toggleClass(element, cssClass, it, true) },
                setOnInit,
                true)

/**
 * Update and initial element is self.
 */
fun <T : Element> IMdlComponent<T>.invertToggleClassOfThis(
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) = this.invertToggleClassOfThis(this.element, cssClass, initialValue, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialElement.
 */
fun <T : Element> IMdlComponent<T>.invertToggleClassOfThis(
        initialElement: Element,
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) =
        this.toggleClassDelegatedProperty(
                initialElement,
                cssClass,
                initialValue,
                { this.element.classList.contains(cssClass) },
                { toggleClass(this.element, cssClass, it, true) },
                setOnInit,
                true)

/**
 * Update and initial element is @param element.
 */
fun <T, E : Element> IMdlComponent<E>.invertToggleClassOfWhen(
        element: Element,
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true)
        = this.invertToggleClassOfWhen(element, element, cssClass, checkValue, initialValue, setOnInit)

/**
 * Update element is @param element.
 * Initial element is @param initialElement.
 */
fun <T, E : Element> IMdlComponent<E>.invertToggleClassOfWhen(
        element: Element,
        initialElement: Element,
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true) =
        this.toggleClassWhenDelegatedBackingProperty(
                initialElement,
                cssClass,
                checkValue,
                initialValue,
                { _, newValue -> toggleClass(element, cssClass, checkValue == newValue) },
                setOnInit,
                true)

/**
 * Update and initial element is self.
 */
fun <T, E : Element> IMdlComponent<E>.invertToggleClassOfThisWhen(
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true)
        = this.invertToggleClassOfThisWhen(this.element, cssClass, checkValue, initialValue, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialElement.
 */
fun <T, E : Element> IMdlComponent<E>.invertToggleClassOfThisWhen(
        initialElement: Element,
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true) =
        this.toggleClassWhenDelegatedBackingProperty(
                initialElement,
                cssClass,
                checkValue,
                initialValue,
                { _, newValue -> toggleClass(this.element, cssClass, checkValue == newValue) },
                setOnInit,
                true)

/**
 * Update and initial element is @param element.
 */
fun <T, E : Element> IMdlComponent<E>.replaceNewClassOf(element: Element, initialValue: T, setOnInit: Boolean = true)
        = this.replaceNewClassOf(element, element, initialValue, setOnInit)

/**
 * Update element is @param element.
 * Initial element is @param initialElement.
 */
fun <T, E : Element> IMdlComponent<E>.replaceNewClassOf(
        element: Element,
        initialElement: Element,
        initialValue: T,
        setOnInit: Boolean = true) =
        this.replaceNewClassDelegatedBackingProperty(
                initialElement,
                initialValue,
                { oldValue, newValue ->
                    oldValue?.also { element.classList.remove(it.toString()) }
                    newValue?.also { element.classList.add(it.toString()) }
                },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T, E : Element> IMdlComponent<E>.replaceNewClassOfThis(initialValue: T, setOnInit: Boolean = true)
        = this.replaceNewClassOfThis(this.element, initialValue, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialElement.
 */
fun <T, E : Element> IMdlComponent<E>.replaceNewClassOfThis(
        initialElement: Element,
        initialValue: T,
        setOnInit: Boolean = true) =
        this.replaceNewClassDelegatedBackingProperty(
                initialElement,
                initialValue,
                { oldValue, newValue ->
                    oldValue?.also { this.element.classList.remove(it.toString()) }
                    newValue?.also { this.element.classList.add(it.toString()) }
                },
                setOnInit)

/**
 * Update and initial element is element of @param component.
 */
fun <T : IMdlComponent<E2>, P : IMdlComponent<E3>?, E1 : Element, E2 : Element, E3 : Element> IMdlComponent<E1>.replaceOrAppendChildOf(
        component: T,
        initialChildComponent: P,
        setOnInit: Boolean = true) = this.replaceOrAppendChildOf(component.element, initialChildComponent, setOnInit)

/**
 * Update and initial element is element of @param component.
 */
fun <T : IMdlComponent<E2>, P : Node?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendChildOf(
        component: T,
        initialChildNode: P,
        setOnInit: Boolean = true) = this.replaceOrAppendChildOf(component.element, initialChildNode, setOnInit)

/**
 * Update element is element of @param component.
 * Initial element is @param initialElement.
 */
fun <T : IMdlComponent<E2>, P : IMdlComponent<E3>?, E1 : Element, E2 : Element, E3 : Element> IMdlComponent<E1>.replaceOrAppendChildOf(
        component: T,
        initialNode: Node,
        initialChildComponent: P,
        setOnInit: Boolean = true)
        = this.replaceOrAppendChildOf(component.element, initialNode, initialChildComponent, setOnInit)

/**
 * Update element is element of @param component.
 * Initial element is @param initialElement.
 */
fun <T : IMdlComponent<E2>, P : Node?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendChildOf(
        component: T,
        initialNode: Node,
        initialChildNode: P,
        setOnInit: Boolean = true)
        = this.replaceOrAppendChildOf(component.element, initialNode, initialChildNode, setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendChildOf(
        node: Node,
        initialChildComponent: T,
        setOnInit: Boolean = true) = this.replaceOrAppendChildOf(node, node, initialChildComponent, setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendChildOf(
        node: Node,
        initialChildNode: T,
        setOnInit: Boolean = true) = this.replaceOrAppendChildOf(node, node, initialChildNode, setOnInit)

/**
 * Update node is @param node.
 * Initial node is @param initialNode.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendChildOf(
        node: Node,
        initialNode: Node,
        initialChildComponent: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildComponent,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            node.replaceChild(newValue.element, it!!.element)
                        } ?: node + newValue.element
                    } ?: oldValue?.also { node.removeChild(it!!.element) }
                },
                setOnInit)

/**
 * Update node is @param node.
 * Initial node is @param initialNode.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendChildOf(
        node: Node,
        initialNode: Node,
        initialChildNode: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildNode,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            node.replaceChild(newValue, it!!)
                        } ?: node.appendChild(newValue)
                    } ?: oldValue?.also { node.removeChild(it!!) }
                },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendChildOfThis(
        initialComponent: T,
        setOnInit: Boolean = true) = this.replaceOrAppendChildOfThis(this.element, initialComponent, setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendChildOfThis(
        initialNode: T,
        setOnInit: Boolean = true) = this.replaceOrAppendChildOfThis(this.element, initialNode, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialNode.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendChildOfThis(
        initialNode: Node,
        initialChildComponent: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildComponent,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            this.element.replaceChild(newValue.element, it!!.element)
                        } ?: this.element + newValue.element
                    } ?: oldValue?.also { this.element.removeChild(it!!.element) }
                },
                setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialNode.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendChildOfThis(
        initialNode: Node,
        initialChildNode: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildNode,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            this.element.replaceChild(newValue, it!!)
                        } ?: this.element.appendChild(newValue)
                    } ?: oldValue?.also { this.element.removeChild(it!!) }
                },
                setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendExistingChildOf(
        node: Node,
        initialChildComponent: T,
        setOnInit: Boolean = true) = this.replaceOrAppendExistingChildOf(node, node, initialChildComponent, setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendExistingChildOf(
        node: Node?,
        initialChildNode: T,
        setOnInit: Boolean = true) = this.replaceOrAppendExistingChildOf(node, node, initialChildNode, setOnInit)

/**
 * Update node is @param node.
 * Initial node is @param initialNode.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendExistingChildOf(
        node: Node,
        initialNode: Node,
        initialChildComponent: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildComponent,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            node.replaceOrAppendExistingChild(newValue.element, it!!.element)
                        } ?: node + newValue.element
                    } ?: oldValue?.also { node.removeExistingChild(it!!.element) }
                },
                setOnInit)

/**
 * Update node is @param node.
 * Initial node is @param initialNode.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendExistingChildOf(
        node: Node?,
        initialNode: Node?,
        initialChildNode: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildNode,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            node?.replaceOrAppendExistingChild(newValue as Node, it as Node)
                        } ?: node?.appendChild(newValue)
                    } ?: oldValue?.also { node?.removeExistingChild(it as Node) }
                },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendExistingChildOfThis(
        initialComponent: T,
        setOnInit: Boolean = true) = this.replaceOrAppendExistingChildOfThis(this.element, initialComponent, setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendExistingChildOfThis(
        initialNode: T,
        setOnInit: Boolean = true) = this.replaceOrAppendExistingChildOfThis(this.element, initialNode, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialNode.
 */
fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceOrAppendExistingChildOfThis(
        initialNode: Node,
        initialChildComponent: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildComponent,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            this.element.replaceOrAppendExistingChild(newValue.element, it!!.element)
                        } ?: this.element + newValue.element
                    } ?: oldValue?.also { this.element.removeExistingChild(it!!.element) }
                },
                setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialNode.
 */
fun <T : Node?, E : Element> IMdlComponent<E>.replaceOrAppendExistingChildOfThis(
        initialNode: Node,
        initialChildNode: T,
        setOnInit: Boolean = true) =
        this.appendChildDelegatedBackingProperty(
                initialNode,
                initialChildNode,
                { oldValue, newValue ->
                    newValue?.also {
                        oldValue?.also {
                            this.element.replaceOrAppendExistingChild(newValue as Node, it as Node)
                        } ?: this.element.appendChild(newValue)
                    } ?: oldValue?.also { this.element.removeExistingChild(it as Node) }
                },
                setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : IMaterialIcon?, E : Element> IMdlComponent<E>.setTextContentOf(
        element: Element,
        initialMaterialIcon: T,
        setOnInit: Boolean = true) = this.setTextContentOf(element, element, initialMaterialIcon, setOnInit)

/**
 * Update node is @param node.
 * Initial node is @param initialNode.
 */
fun <T : IMaterialIcon?, E : Element> IMdlComponent<E>.setTextContentOf(
        node: Node,
        initialNode: Node,
        initialMaterialIcon: T,
        setOnInit: Boolean = true) =
        this.setTextContentDelegatedBackingProperty(
                initialNode,
                initialMaterialIcon,
                { _, newValue -> node.textContent = newValue?.ligature },
                setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOf(
        element: Element,
        initialTextContent: String = String.empty,
        setOnInit: Boolean = true) = this.setTextContentOf(element, element, initialTextContent, setOnInit)

/**
 * Update node is @param node.
 * Initial node is @param initialNode.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOf(
        node: Node,
        initialNode: Node,
        initialTextContent: String = String.empty,
        setOnInit: Boolean = true) =
        this.setTextContentDelegatedProperty(
                initialNode,
                initialTextContent,
                { node.textContent ?: String.empty },
                { node.textContent = it },
                setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOfNullable(
        element: Element,
        initialTextContent: String? = null,
        setOnInit: Boolean = true) = this.setTextContentOfNullable(element, element, initialTextContent, setOnInit)

/**
 * Update node is @param node.
 * Initial node is @param initialNode.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOfNullable(
        node: Node,
        initialNode: Node,
        initialTextContent: String? = null,
        setOnInit: Boolean = true) =
        this.setTextContentDelegatedProperty(
                initialNode,
                initialTextContent,
                { node.textContent },
                { node.textContent = it },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : IMaterialIcon?, E : Element> IMdlComponent<E>.setTextContentOfThis(
        initialMaterialIcon: T,
        setOnInit: Boolean = true) = this.setTextContentOfThis(this.element, initialMaterialIcon, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialNode.
 */
fun <T : IMaterialIcon?, E : Element> IMdlComponent<E>.setTextContentOfThis(
        initialNode: Node,
        initialMaterialIcon: T,
        setOnInit: Boolean = true) =
        this.setTextContentDelegatedBackingProperty(
                initialNode,
                initialMaterialIcon,
                { _, newValue -> this.element.textContent = newValue?.ligature },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOfThis(
        initialTextContent: String = String.empty,
        setOnInit: Boolean = true) = this.setTextContentOfThis(this.element, initialTextContent, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialNode.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOfThis(
        initialNode: Node,
        initialTextContent: String = String.empty,
        setOnInit: Boolean = true) =
        this.setTextContentDelegatedProperty(
                initialNode,
                initialTextContent,
                { this.element.textContent ?: String.empty },
                { this.element.textContent = it },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOfThisNullable(
        initialTextContent: String? = null,
        setOnInit: Boolean = true) = this.setTextContentOfThisNullable(this.element, initialTextContent, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialNode.
 */
fun <T : Element> IMdlComponent<T>.setTextContentOfThisNullable(
        initialNode: Node,
        initialTextContent: String? = null,
        setOnInit: Boolean = true) =
        this.setTextContentDelegatedProperty(
                initialNode,
                initialTextContent,
                { this.element.textContent },
                { this.element.textContent = it },
                setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T : Element> IMdlComponent<T>.toggleClassOf(
        element: Element,
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) = this.toggleClassOf(element, element, cssClass, initialValue, setOnInit)

/**
 * Update element is @param element.
 * Initial element is @param initialElement.
 */
fun <T : Element> IMdlComponent<T>.toggleClassOf(
        element: Element,
        initialElement: Element,
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) =
        this.toggleClassDelegatedProperty(
                initialElement,
                cssClass,
                initialValue,
                { element.classList.contains(cssClass) },
                { toggleClass(element, cssClass, it) },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T : Element> IMdlComponent<T>.toggleClassOfThis(
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) = this.toggleClassOfThis(this.element, cssClass, initialValue, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialElement.
 */
fun <T : Element> IMdlComponent<T>.toggleClassOfThis(
        initialElement: Element,
        cssClass: String,
        initialValue: Boolean = false,
        setOnInit: Boolean = true) =
        this.toggleClassDelegatedProperty(
                initialElement,
                cssClass,
                initialValue,
                { this.element.classList.contains(cssClass) },
                { toggleClass(this.element, cssClass, it) },
                setOnInit)

/**
 * Update and initial element is @param element.
 */
fun <T, E : Element> IMdlComponent<E>.toggleClassOfWhen(
        element: Element,
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true)
        = this.toggleClassOfWhen(element, element, cssClass, checkValue, initialValue, setOnInit)

/**
 * Update element is @param element.
 * Initial element is @param initialElement.
 */
fun <T, E : Element> IMdlComponent<E>.toggleClassOfWhen(
        element: Element,
        initialElement: Element,
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true) =
        this.toggleClassWhenDelegatedBackingProperty(
                initialElement,
                cssClass,
                checkValue,
                initialValue,
                { _, newValue -> toggleClass(element, cssClass, checkValue == newValue) },
                setOnInit)

/**
 * Update and initial element is self.
 */
fun <T, E : Element> IMdlComponent<E>.toggleClassOfThisWhen(
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true)
        = this.toggleClassOfThisWhen(this.element, cssClass, checkValue, initialValue, setOnInit)

/**
 * Update element is self.
 * Initial element is @param initialElement.
 */
fun <T, E : Element> IMdlComponent<E>.toggleClassOfThisWhen(
        initialElement: Element,
        cssClass: String,
        checkValue: T,
        initialValue: T,
        setOnInit: Boolean = true) =
        this.toggleClassWhenDelegatedBackingProperty(
                initialElement,
                cssClass,
                checkValue,
                initialValue,
                { _, newValue -> toggleClass(this.element, cssClass, checkValue == newValue) },
                setOnInit)
//endregion

//region Private Extension Methods
private fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.appendChildDelegatedBackingProperty(
        initialNode: Node,
        initialChildComponent: T,
        onSet: (oldValue: T, newValue: T) -> Unit = { _, _ -> },
        setOnInit: Boolean = true) =
        this.delegatedBackingProperty(
                initialChildComponent,
                onSet,
                { if (setOnInit && it != null) initialNode + it.element })

private fun <T : Node?, E : Element> IMdlComponent<E>.appendChildDelegatedBackingProperty(
        initialNode: Node?,
        initialChildNode: T,
        onSet: (oldValue: T, newValue: T) -> Unit = { _, _ -> },
        setOnInit: Boolean = true) =
        this.delegatedBackingProperty(
                initialChildNode,
                onSet,
                { if (setOnInit && it != null) initialNode?.appendChild(it) })

private fun <T, E : Element> IMdlComponent<E>.replaceNewClassDelegatedBackingProperty(
        initialElement: Element,
        initialValue: T,
        onSet: (oldValue: T, newValue: T) -> Unit = { _, _ -> },
        setOnInit: Boolean = true) =
        this.delegatedBackingProperty(
                initialValue,
                onSet,
                { if (setOnInit && it != null) initialElement.classList.add(it.toString()) })

private fun <T : IMaterialIcon?, E : Element> IMdlComponent<E>.setTextContentDelegatedBackingProperty(
        initialNode: Node,
        initialMaterialIcon: T,
        onSet: (oldValue: T, newValue: T) -> Unit = { _, _ -> },
        setOnInit: Boolean = true) =
        this.delegatedBackingProperty(
                initialMaterialIcon,
                onSet,
                { if (setOnInit && it != null) initialNode.textContent = it.ligature })

private fun <T : String?, E : Element> IMdlComponent<E>.setTextContentDelegatedProperty(
        initialNode: Node,
        initialTextContent: T,
        onGet: () -> T,
        onSet: (newValue: T) -> Unit = {},
        setOnInit: Boolean = true)
        = this.delegatedProperty(onGet, onSet, { if (setOnInit) initialNode.textContent = initialTextContent })

private fun toggleClass(element: Element, cssClass: String, value: Boolean, isInverted: Boolean = false) {
    if (value != isInverted) element.classList.add(cssClass) else element.classList.remove(cssClass)
}

private fun <T : Element> IMdlComponent<T>.toggleClassDelegatedProperty(
        initialElement: Element,
        cssClass: String,
        initialValue: Boolean,
        onGet: () -> Boolean,
        onSet: (newValue: Boolean) -> Unit = {},
        setOnInit: Boolean = true,
        isInverted: Boolean = false) =
        this.delegatedProperty(
                onGet,
                onSet,
                { if (setOnInit) toggleClass(initialElement, cssClass, initialValue, isInverted) })

private fun <T, E : Element> IMdlComponent<E>.toggleClassWhenDelegatedBackingProperty(
        initialElement: Element,
        cssClass: String,
        checkValue: T,
        initialValue: T,
        onSet: (oldValue: T, newValue: T) -> Unit = { _, _ -> },
        setOnInit: Boolean = true,
        isInverted: Boolean = false) =
        this.delegatedBackingProperty(
                initialValue,
                onSet,
                { if (setOnInit) toggleClass(initialElement, cssClass, checkValue == initialValue, isInverted) })
//endregion
