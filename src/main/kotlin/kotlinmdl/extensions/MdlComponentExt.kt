package kotlinmdl.extensions

import kotlinmdl.components.MdlComponent
import org.w3c.dom.Element
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <E : Element> MdlComponent<E>.invertToggleClass(
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

fun <E : Element> MdlComponent<E>.invertToggleClassAndOn(
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

fun <E : Element> MdlComponent<E>.toggleClass(
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

fun <E : Element> MdlComponent<E>.toggleClassAndOn(
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
