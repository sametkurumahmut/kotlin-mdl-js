package kotlinmdl.internal.extensions

import kotlinmdl.components.IMdlComponent
import kotlinmdl.extensions.plus
import org.w3c.dom.Element
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <E : Element> IMdlComponent<E>.invertToggleClass(
        cssClass: String,
        initialValue: Boolean = false,
        runOnInit: Boolean = true) = object : ReadWriteProperty<Any, Boolean> {

    var propValue = initialValue

    init {
        if (runOnInit) this.onSet(initialValue)
    }

    override fun getValue(thisRef: Any, property: KProperty<*>)
            = this@invertToggleClass.element.classList.contains(cssClass)

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        this.onSet(value)
        this.propValue = value
    }

    fun onSet(value: Boolean) {
        if (value) this@invertToggleClass.element.classList.remove(cssClass)
        else this@invertToggleClass.element.classList.add(cssClass)
    }
}

fun <E : Element> IMdlComponent<E>.invertToggleClassAndOn(
        cssClass: String,
        initialValue: Boolean = false,
        runOnInit: Boolean = true,
        onGet: (propValue: Boolean) -> Unit = {},
        onSet: (propValue: Boolean, value: Boolean) -> Unit = fun (_, _) {})
        = object : ReadWriteProperty<Any, Boolean> {

    var propValue = initialValue

    init {
        if (runOnInit) this.onSet(initialValue)
    }

    override fun getValue(thisRef: Any, property: KProperty<*>) : Boolean {
        onGet(this.propValue)

        return this@invertToggleClassAndOn.element.classList.contains(cssClass)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        onSet(this.propValue, value)
        this.onSet(value)
        this.propValue = value
    }

    fun onSet(value: Boolean) {
        if (value) this@invertToggleClassAndOn.element.classList.remove(cssClass)
        else this@invertToggleClassAndOn.element.classList.add(cssClass)
    }
}

fun <T : IMdlComponent<E2>, P : IMdlComponent<E3>?, E1 : Element, E2 : Element, E3 : Element> IMdlComponent<E1>.replaceChildOf(
        component: T,
        initialComponentValue: P,
        runOnInit: Boolean = true) = this.replaceChildOf(component.element, initialComponentValue, runOnInit)

fun <T : Element, P : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceChildOf(
        element: T,
        initialComponentValue: P,
        runOnInit: Boolean = true) = object : ReadWriteProperty<Any, P> {

    private var comp = initialComponentValue

    init {
        if (runOnInit && initialComponentValue != null) element + initialComponentValue.element
    }

    override fun getValue(thisRef: Any, property: KProperty<*>) = this.comp

    override fun setValue(thisRef: Any, property: KProperty<*>, value: P) {
        value?.let {
            this.comp?.let { element.replaceChild(value.element, this.comp!!.element) }
                    ?: element + value.element
        } ?: this.comp?.let { element.removeChild(this.comp!!.element) }

        this.comp = value
    }
}

fun <T : IMdlComponent<E2>?, E1 : Element, E2 : Element> IMdlComponent<E1>.replaceChildOfThis(
        initialComponentValue: T,
        runOnInit: Boolean = true) = this.replaceChildOf(this, initialComponentValue, runOnInit)

fun <E : Element> IMdlComponent<E>.setTextContentOf(
        reference: Element,
        textContent: String = String.empty,
        runOnInit: Boolean = true) = object : ReadWriteProperty<Any, String> {

    init { if (runOnInit) reference.textContent = textContent }

    override fun getValue(thisRef: Any, property: KProperty<*>): String = reference.textContent ?: String.empty

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        reference.textContent = value
    }
}

fun <E : Element> IMdlComponent<E>.setTextContentOfThis(
        textContent: String = String.empty,
        runOnInit: Boolean = true) = this.setTextContentOf(this.element, textContent, runOnInit)

fun <E : Element> IMdlComponent<E>.toggleClass(
        cssClass: String,
        initialValue: Boolean = false,
        runOnInit: Boolean = true) = object : ReadWriteProperty<Any, Boolean> {

    var propValue = initialValue

    init {
        if (runOnInit) this.onSet(initialValue)
    }

    override fun getValue(thisRef: Any, property: KProperty<*>) = this@toggleClass.element.classList.contains(cssClass)

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        this.onSet(value)
        this.propValue = value
    }

    fun onSet(value: Boolean) {
        if (value) this@toggleClass.element.classList.add(cssClass)
        else this@toggleClass.element.classList.remove(cssClass)
    }
}

fun <E : Element> IMdlComponent<E>.toggleClassAndOn(
        cssClass: String,
        initialValue: Boolean = false,
        runOnInit: Boolean = true,
        onGet: (propValue: Boolean) -> Unit = {},
        onSet: (propValue: Boolean, value: Boolean) -> Unit = fun (_, _) {})
        = object : ReadWriteProperty<Any, Boolean> {

    var propValue = initialValue

    init {
        if (runOnInit) this.onSet(initialValue)
    }

    override fun getValue(thisRef: Any, property: KProperty<*>) : Boolean {
        onGet(this.propValue)

        return this@toggleClassAndOn.element.classList.contains(cssClass)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        onSet(this.propValue, value)
        this.onSet(value)
        this.propValue = value
    }

    fun onSet(value: Boolean) {
        if (value) this@toggleClassAndOn.element.classList.add(cssClass)
        else this@toggleClassAndOn.element.classList.remove(cssClass)
    }
}
