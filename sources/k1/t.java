package K1;

public abstract class t {
    public static Object a(Class cls, String str, s... sVarArr) {
        return b(cls, "isIsolated", (Object) null, false, sVarArr);
    }

    public static Object b(Class cls, String str, Object obj, boolean z4, s... sVarArr) {
        int length = sVarArr.length;
        Class[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        Throwable th = null;
        if (sVarArr.length <= 0) {
            return cls.getDeclaredMethod(str, clsArr).invoke(th, objArr);
        }
        s sVar = sVarArr[0];
        th.getClass();
        throw th;
    }
}
