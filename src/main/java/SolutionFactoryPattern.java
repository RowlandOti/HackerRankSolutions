import java.security.Permission;
import java.util.Scanner;

public class SolutionFactoryPattern {

	public static void main(String args[]) {
		Do_Not_Terminate.forbidExit();

		try {

			Scanner sc = new Scanner(System.in);
			// creating the factory
			FoodFactory foodFactory = new SolutionFactoryPattern().new FoodFactory();

			// factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());

			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}

	interface Food {
		public String getType();
	}

	class Pizza implements Food {
		public String getType() {
			return "Someone ordered a Fast Food!";
		}
	}

	class Cake implements Food {

		public String getType() {
			return "Someone ordered a Dessert!";
		}
	}

	class FoodFactory {
		public Food getFood(String order) {

			// Fix the Case
			order = order.substring(0, 1).toUpperCase() + order.substring(1);

			Food food = null;

			try {
				Class clazz = null;
				try {
					clazz = Class.forName(order);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				food = (Food) clazz.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return food;
		}
	}// End of getFood method

	static class Do_Not_Terminate {

		public static class ExitTrappedException extends SecurityException {

			private static final long serialVersionUID = 1L;
		}

		public static void forbidExit() {
			final SecurityManager securityManager = new SecurityManager() {
				@Override
				public void checkPermission(Permission permission) {
					if (permission.getName().contains("exitVM")) {
						throw new ExitTrappedException();
					}
				}
			};
			System.setSecurityManager(securityManager);
		}

	}

}// End of factory class

