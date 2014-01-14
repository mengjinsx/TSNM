
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.enums.ValuedEnum;

public final class WeekDayEnum extends ValuedEnum{
/**
*
*/
public static final long serialVersionUID = 732377557389126868L;
private static final int MONDAY=2;
private static final int TUESDAY=3;
private static final int WEDSDAY=4;
private static final int THURSDAY = 5;
private static final int FRIDAY=6;
private static final int SATDAY=7;
private static final int SUNDAY=1;
public static final WeekDayEnum WEEKDAY_MONDAY_ENUM = new WeekDayEnum("星期一",MONDAY);
public static final WeekDayEnum WEEKDAY_TUESDAY_ENUM = new WeekDayEnum("星期二",TUESDAY);
public static final WeekDayEnum WEEKDAY_WEDSDAY_ENUM = new WeekDayEnum("星期三",WEDSDAY);
public static final WeekDayEnum WEEKDAY_THURSDAY_ENUM = new WeekDayEnum("星期四",THURSDAY);
public static final WeekDayEnum WEEKDAY_FRIDAY_ENUM = new WeekDayEnum("星期五",FRIDAY);
public static final WeekDayEnum WEEKDAY_SATDAY_ENUM = new WeekDayEnum("星期六",SATDAY);
public static final WeekDayEnum WEEKDAY_SUNDAY_ENUM = new WeekDayEnum("星期日",SUNDAY);
protected WeekDayEnum(String name, int value) {
super(name, value);
}
public static WeekDayEnum getEnum(String type){
return (WeekDayEnum)getEnum(WeekDayEnum.class, type);
}
public static WeekDayEnum getEnum(int type){
return (WeekDayEnum)getEnum(WeekDayEnum.class, type);
}
public static Map getEnumMap(){
return getEnumMap(WeekDayEnum.class);
}
public static List getEnumList(){
return getEnumList(WeekDayEnum.class);
}
public static Iterator iterator(){
return iterator();
}
public static String getDayOfWeek(int i){
	return getEnum(i).getName();
}
}