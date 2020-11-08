import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public List<String> getPrivateFields(Object object) {
        // Add implementation here
        List<String> list = new ArrayList<String>();
        Class objectClass = object.getClass();
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field :
                fields) {
            int modifires = field.getModifiers();
            if (Modifier.isPrivate(modifires)) {

                list.add(field.getName());
            }
        }
        Collections.sort(list);
        return list;

    }

}