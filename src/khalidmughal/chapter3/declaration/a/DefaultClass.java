package khalidmughal.chapter3.declaration.a;

import java.util.ArrayList;
import java.util.List;

public final class DefaultClass<T> {

    public boolean canAccess() {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("string");
        return true;
    }
}
