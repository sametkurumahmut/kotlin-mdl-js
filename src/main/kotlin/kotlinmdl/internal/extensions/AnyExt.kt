package kotlinmdl.internal.extensions

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <T> Any?.delegatedBackingProperty(
        initialValue: T,
        onSet: (oldValue: T, newValue: T) -> Unit = { _, _ -> },
        onInit: (initialValue: T) -> Unit = {},
        onGet: (propValue: T) -> T = { it },
        ignoreSetIf: () -> Boolean = { false }) = object : ReadWriteProperty<Any, T> {

    private var prop = initialValue

    init {
        onInit(initialValue)
    }

    override fun getValue(thisRef: Any, property: KProperty<*>) = onGet(this.prop)

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        onSet(this.prop, value)
        if (!ignoreSetIf()) this.prop = value
    }
}

fun <T> Any?.delegatedProperty(
        onGet: () -> T,
        onSet: (newValue: T) -> Unit = {},
        onInit: () -> Unit = {}) = object : ReadWriteProperty<Any, T> {

    init {
        onInit()
    }

    override fun getValue(thisRef: Any, property: KProperty<*>) = onGet()

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        onSet(value)
    }
}
