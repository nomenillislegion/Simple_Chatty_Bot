import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        // Add implementation here

        List<String> list = new ArrayList<String>();
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field :
                fields) {
            int modifires = field.getModifiers();
            if (Modifier.isPublic(modifires)) {

                list.add(field.getName());
            }
        }
        return list.toArray(new String[0]);
    }

}