package sh.talonfox.vulpesloader.api

import net.minecraft.launchwrapper.Launch


object VulpesListenerManager {
    private var listeners: HashMap<Class<*>, MutableList<Any>> = HashMap()

    @JvmStatic
    fun getListeners(listenerInterface: Class<*>): MutableList<*>? {
        return listeners[listenerInterface]
    }

    @JvmStatic
    fun addListener(clazz: Any) {
        for(i in clazz.javaClass.interfaces.iterator()) {
            if(!listeners.containsKey(i)) {
                listeners[i] = ArrayList()
            }
            listeners[i]?.add(clazz)
        }
    }
}