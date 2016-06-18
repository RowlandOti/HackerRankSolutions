import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


public class SolutionReflection {

	public static void main(String[] args){
        Class student = null;
		try {
			student = Class.forName("Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();

        for(int i=0; i<methods.length; i++){
            methodList.add(methods[i].getName());
        }
        // Alternative to above
        /*for(Method m: methods){
            methodList.add(m.getName());
        }*/


        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
