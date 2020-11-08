import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */
class FieldGetter {

    public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        Class instance = object.getClass();
        Object output = null;
        Field[] fields = instance.getDeclaredFields();
        for (Field field : fields) {
            int modifier = field.getModifiers();
            if (Modifier.isPublic(modifier) && field.getName().equals(fieldName)) {
                output = field.get(object);
            }
        }
        return output;
    }

}