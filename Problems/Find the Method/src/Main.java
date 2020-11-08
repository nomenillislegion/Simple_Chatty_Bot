import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        String output = null;
        for (String instance : classNames) {
            Class className = Class.forName(instance);
            for (Method methods : className.getMethods()) {
                if (methods.getName().equals(methodName)) {
                    output = instance;
                    break;
                }
            }
        }
        return output;
    }
}