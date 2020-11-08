import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        // Add implementation here
        Constructor[] constructorArray = clazz.getDeclaredConstructors();
        boolean output = false;
        for (Constructor constructor : constructorArray) {
            int modifiers = constructor.getModifiers();
            if (constructor.getParameterCount() == 0 && Modifier.isPublic(modifiers)) {
                output = true;
                break;
            }
        }
        return output;
    }
}